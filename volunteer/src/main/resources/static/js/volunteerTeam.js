var vm = new Vue({
    el: '#vm',
    data: {
        title: "管理员首页",
        volunteer: {
            volunteerName: "",
            volunteerSex: "",
            volunteerPhone: "",
            volunteerEmail: "",
            volunteerAdrress: ""
        }
    },
    mounted: function () {
        console.log(localStorage.getItem("token"));

        axios.post('../../login/volunteerLoginInfo?token=' + localStorage.getItem("token"), {})
            .then(function (response) {
                if (response.data.code === 200) {
                    console.log(response.data.data);
                    console.log(response.data.data.volunteerName);
                    vm.volunteer = response.data.data;

                } else {
                    alert("请登录！");
                    location.href = "/page/login";
                }

                console.log(response);

            })

    },
    methods: {}
})

