var vm = new Vue({
    el: '#vm',
    data: {
        register: {
            email: "",
            pwd: "",
            name: "",
            sex: "0",
            phone: "",
            adrress: ""
        },
        isTeamLeader: false,
        title: "\"心·青年\"志愿活动平台"
    },
    methods: {


        toIndex: function () {
            console.log("跳转到首页页面！"),
                location.href = "/page/index";
        },

        toLogin: function () {
            console.log("跳转到登录页面！"),
                location.href = "/page/login";
        },

        confirm: function () {
            if(vm.register.pwd.length < 7){
                alert("提示：密码至少为8位");
                location.reload();
            }
            axios.post('../../register/volunteer', {
                volunteerMail: vm.register.email,
                volunteerPwd: vm.register.pwd,
                volunteerName: vm.register.name,
                volunteerSex: vm.register.sex,
                volunteerPhone: vm.register.phone,
                volunteerAdrress: vm.register.adrress
            })
                .then(function (response) {
                    if (response.data.code === 400) {
                        alert(response.data.message);
                        location.reload();
                    }
                    if (response.data.code === 200) {
                        alert("注册成功");
                        localStorage.setItem("volunteerId", response.data.data);
                        location.href = vm.isTeamLeader ? "/page/register_team" : "/page/index";
                    }
                    console.log(response);
                });
        }


    }
});

