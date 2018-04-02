
var vm = new Vue({
    el: '#vm',
    data: {
        title: "\"心·青年\"志愿活动平台"

    },
    methods: {


        toLogin: function () {
            location.href="/page/login";
        },

        toRegister: function(){
            location.href="../page/register";
        },

        reload: function () {
            // $.ajax({
            //     type: "POST",
            //     url: "../../login/info",
            //     contentType: "application/json",
            //     data:JSON.stringify(vm.login),
            //     success: function (r) {
            //         console.log(r.code);
            //         if (r.code === 200) {
            //             alert('操作成功');
            //         } else {
            //             alert("操作失败");
            //         }
            //     }
            // });
            axios.post('../../login/info', {
                    email:vm.login.email,
                    pwd:vm.login.pwd
            })
            .then(function (response) {
                if(response.data.code === 200){
                    alert("成功");
                    location.href="/page/login";
                }

                console.log(response);
            })

        }
    }
});

