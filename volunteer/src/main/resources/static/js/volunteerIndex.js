var vm = new Vue({
    el: '#vm',
    data: {
        title: "志愿者首页",
        volunteer: {
            id:"",
            volunteerName: "",
            volunteerSex: "",
            volunteerPhone: "",
            volunteerEmail: "",
            volunteerAdrress: ""
        },
        isTeamLeader:false,
        teamInfo:{
            id:"",
            teamName:"",
            memberNum:"",
            teamRegion:""
        },
        teamMemberList:[],
        activities: [],
        isShow:false,
        dataR:""
    },
    mounted: function () {
        console.log(localStorage.getItem("token"));

        axios.post('../../login/volunteerLoginInfo?token=' + localStorage.getItem("token"), {})
            .then(function (response) {
                if (response.data.code === 200) {
                    console.log(response.data.data);
                    console.log(response.data.data.volunteerName);
                    vm.volunteer = response.data.data;

                    axios.post('../../volunteer/getActivity?volunteerId=' + vm.volunteer.id, {})
                        .then(function (response) {
                            if (response.data.code === 200) {
                                console.log(response.data.data);
                                vm.dataR = response.data.data;
                                vm.teamInfo = vm.dataR.team;
                                vm.isTeamLeader = true;
                                vm.isShow = true
                                vm.activities = vm.dataR.activities;
                            } else {
                                alert("请登录！");
                                location.href = "/page/login";
                            }

                            console.log(response);

                        })

                } else {
                    alert("请登录！");
                    location.href = "/page/login";
                }

                console.log(response);

            })

    },
    methods: {}
})

