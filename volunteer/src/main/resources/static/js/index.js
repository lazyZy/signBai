
var vm = new Vue({
    el: '#vm',
    data: {
        login:{
            email:"",
            pwd:""
        },
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

        reload: function () {
            $.ajax({
                type: "POST",
                url: "../../login/info",
                contentType: "application/json",
                data:JSON.stringify(vm.login),
                success: function (r) {
                    console.log(r.code);
                    if (r.code === 200) {
                        alert('操作成功');
                    } else {
                        alert("操作失败");
                    }
                }
            });
            // axios({
            //     method:'post',
            //     url:'../../login/info',
            //     data:{
            //     email:vm.login.email,
            //     pwd:vm.login.pwd
            //     }
            // }).then(function(resp){
            //     if(resp.code === 200){
            //         alert("登陆成功");
            //     }else {
            //         alert("登录失败")
            //         console.log(JSON.stringify(vm.login));
            //         return 'login.ftl';
            //     }
            // });
        }
    }
});