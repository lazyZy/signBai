var vm1 = new Vue({
    el: '#vm1',
    data: {
        login: {
            email: "",
            pwd: "",
            isAdmin: false,
        },
        title:  "\"心·青年\"志愿活动平台"
    },
    methods: {



        toRegister: function () {
            console.log("跳转到注册页面！"),
                location.href = "/page/register";
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
            var url = vm1.login.isAdmin ? '../../login/admin' : '../../login/volunteer';
            axios.post(url, {
                email: vm1.login.email,
                pwd: vm1.login.pwd
            })
                .then(function (response) {
                    if (response.data.code === 200) {
                        alert("成功");
                        window.token = response.data.data;
                        console.info(window.token);
                        localStorage.setItem("token",response.data.data);
                        location.href = "/page/adminIndex";
                    }else{
                        alert("用户名或密码错误！");
                    }
                })

        }
    }
});

