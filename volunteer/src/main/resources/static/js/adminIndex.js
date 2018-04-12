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
    methods: {}
})

