
var vm = new Vue({
    el: '#vm',
    data: {
        showList: true,
        title: "心\"",
        q: {
            insId: null
        },
        BaseResult: {
        }
    },
    methods: {

        sendMessage: function () {
            var ids = getSelectedRow();
            var url = "v1/ins/order/noticeToDlbByPerson?orderId="+ids;
            $.ajax({
                type: "POST",
                // dataType:"JSONP",
                url: postBaseURL + url,
                contentType: "application/json",
                success: function (r) {

                    console.log(r.code);
                    if (r.code === 200) {
                        alert('操作成功', function () {
                            vm.reload();
                        });
                    } else {
                        alert("操作失败，都来宝端报错");
                    }
                }
            });
        },

        reload: function (event) {
            var page = $("#jqGrid").jqGrid('getGridParam', 'page');
            $("#jqGrid").jqGrid('PageBody', {
                postData: {
                }
            }).trigger("reloadGrid");
        }
    }
});