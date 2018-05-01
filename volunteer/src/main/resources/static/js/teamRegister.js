var vm = new Vue({
    el: '#vm',
    data: {
        registerTeam: {
            leaderId: "",
            teamName: "",
            teamRegion: ""
        },
        title: "\"心·青年\"志愿活动平台"
    },
    methods: {


        toIndex: function () {
            console.log("跳转到注册页面！"),
                location.href = "/page/index";
        },

        toLogin: function () {
            console.log("跳转到注册页面！"),
                location.href = "/page/login";
        },

        confirm: function () {
            axios.post('../../register/team', {
                leaderId: localStorage.getItem("volunteerId"),
                teamName: vm.registerTeam.teamName,
                teamRegion: vm.registerTeam.teamRegion
            })
                .then(function (response) {
                    if (response.data.code === 200) {
                        alert("注册成功");
                    }
                    location.href = "/page/volunteerIndex";
                    console.log(response);
                })
        },


    }
});

