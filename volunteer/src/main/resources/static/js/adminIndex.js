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
            adminAuthority: ""
        },
        activities: [],
        teams:[]
    },
    mounted: function () {
        console.log(localStorage.getItem("token"));

        axios.post('../../login/adminLoginInfo?token=' + localStorage.getItem("token"), {})
            .then(function (response) {
                if (response.data.code === 200) {
                    vm.admin = response.data.data;
                } else {
                    alert("请登录！");
                    location.href = "/page/login";
                }
                console.log(response);

            })
        axios.post('../../admin/getAllActivity', {})
            .then(function (response) {
                if (response.data.code === 200) {
                    vm.activities = response.data.data;
                } else {
                    alert("请登录！");
                    location.href = "/page/login";
                }

                console.log(response);

            })
        axios.post('../../admin/getAllTeam', {})
            .then(function (response) {
                if (response.data.code === 200) {
                    vm.activities = response.data.data;
                } else {
                    alert("请登录！");
                    location.href = "/page/login";
                }

                console.log(response);

            })

    },
    methods: {
        toAdopt: function (id) {
            console.info(id);
            axios.post('../../admin/adoptActivity?activityId='+id, {})
                .then(function (response) {
                    if (response.data.code === 200) {
                        location.reload();
                    }
                    console.log(response);
                })
        },
        toRefuse: function (id) {
            console.info(id);
            axios.post('../../admin/refuseActivity?activityId='+id, {})
                .then(function (response) {
                    if (response.data.code === 200) {
                        location.reload();
                    }
                    console.log(response);
                })
        },
        toAdminActivity:function () {
            location.href="/page/admin_activity";
        },
        addAdmin:function () {
            location.href="/page/admin_register"
        }
    }
})

