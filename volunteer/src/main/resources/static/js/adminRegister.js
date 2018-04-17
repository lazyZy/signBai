var vm = new Vue({
    el: '#vm',
    data: {
        title: "管理员首页",
        admin: {
            adminName: "",
            adminSex: "",
            adminPhone: "",
            adminEmail: "",
            adminAdrress: "",
            authority:""
        },
        register: {
            name: "",
            sex: "",
            phone: "",
            email: "",
            adrress: "",
            authority:""
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
            axios.post('../../register/admin', {
                adminEmail: vm.register.email,
                adminPwd: vm.register.pwd,
                adminName: vm.register.name,
                adminSex: vm.register.sex,
                adminPhone: vm.register.phone,
                adminAdrress: vm.register.adrress,
                adminAuthority:vm.register.authority
            })
                .then(function (response) {
                    if (response.data.code === 200) {
                        alert("注册成功");
                    }
                    location.href = "/page/adminIndex";
                    console.log(response);
                })
        },


    }
})

