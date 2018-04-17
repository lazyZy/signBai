var vm = new Vue({
    el: '#vm',
    data: {
        title: "管理员首页",
        admin: {
            adminName: "",
            adminSex: "",
            adminPhone: "",
            adminEmail: "",
            adminAdrress: ""
        }
    },
    mounted: function () {
        console.log(localStorage.getItem("token"));

        axios.post('../../login/adminLoginInfo?token=' + localStorage.getItem("token"), {})
            .then(function (response) {
                if (response.data.code === 200) {
                    alert("成功");
                    console.log(response.data.data);
                    console.log(response.data.data.adminName);
                    vm.admin = response.data.data;

                } else {
                    alert("请登录！");
                    location.href = "/page/login";
                }

                console.log(response);

            })

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
            axios.post('../../register/volunteer', {
                volunteerMail: vm.register.email,
                volunteerPwd: vm.register.pwd,
                volunteerName: vm.register.name,
                volunteerSex: vm.register.sex,
                volunteerPhone: vm.register.phone,
                volunteerAdrress: vm.register.adrress
            })
                .then(function (response) {
                    if (response.data.code === 200) {
                        alert("注册成功");
                    }
                    localStorage.setItem("volunteerId", response.data.data);
                    location.href = vm.isTeamLeader?"/page/register_team":"/page/index";
                    console.log(response);
                })
        },


    }
})

