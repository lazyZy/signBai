var vm = new Vue({
    el: '#vm',
    data: {
        title: "志愿者首页",
        volunteer: {
            id: "",
            volunteerName: "",
            volunteerSex: "",
            volunteerPhone: "",
            volunteerEmail: "",
            volunteerAdrress: ""
        },
        isTeamLeader: false,
        teamInfo: {
            id: "",
            teamName: "",
            leaderId:"",
            teamStauts: "",
            memberNum: "",
            teamRegion: ""
        },
        teamMemberList: [],
        activities: [],
        isShow: false,
        dataR: {},
        joinStatus:[]
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
                                vm.teamInfo = response.data.data.team;
                                vm.activities = response.data.data.activities;
                                vm.joinStatus = response.data.data.isJoin;
                                for(var i = 0; i< vm.activities.length;i++){
                                    vm.activities[i].teamId = vm.joinStatus[i];
                                }
                                if(vm.teamInfo.leaderId == vm.volunteer.id){
                                    vm.isTeamLeader = true;
                                }
                            } else {
                                alert("请登录！");
                                location.href = "/page/login";
                            }

                            console.log(response);

                        });
                } else {
                    alert("请登录！");
                    location.href = "/page/login";
                }

                console.log(response);

            })

    },
    methods: {
        toJoinActivity:function(activityId){
            console.info(activityId);
            axios.post('../../volunteer/toJoinActivity', {
                activityId: activityId,
                volunteerId: vm.volunteer.id
            })
                .then(function (response) {
                    if (response.data.code === 200) {
                        alert(response.data.data);
                        location.reload();
                    }
                    console.log(response);
                })

        },
        toFinishActivity:function(id,summary){
            axios.post('../../volunteer/toFinishActivity', {
                activityId: id,
                activitySummary: summary
            })
                .then(function (response) {
                    if (response.data.code === 200) {
                        alert(response.data.data);
                        location.reload();
                    }
                    console.log(response);
                })
        }
    }
})

