var vm = new Vue({
    el: '#vm',
    data: {
        title: "志愿者首页",
        volunteer:{},
        leader: {
            id: "",
            volunteerName: "",
            volunteerSex: "",
            volunteerPhone: "",
            volunteerEmail: "",
            volunteerAdrress: ""
        },
        teamInfos: [],
        volunteers: [],
        isLeader: false,
        isJoinTeam:false
    },
    mounted: function () {
        console.log(localStorage.getItem("token"));

        axios.post('../../login/volunteerLoginInfo?token=' + localStorage.getItem("token"), {})
            .then(function (response) {
                if (response.data.code === 200) {
                    console.log(response.data.data);
                    console.log(response.data.data.volunteerName);
                    vm.volunteer = response.data.data;

                    axios.post('../../volunteer/getTeamMember?volunteerId=' + vm.volunteer.id, {})
                        .then(function (response) {
                            if (response.data.code === 200) {
                                vm.teamInfos = response.data.data.teamAndLeaderInfos;
                                vm.volunteers = response.data.data.volunteers;
                                vm.isLeader = response.data.data.isLeader;
                                vm.leader = response.data.data.leader;
                                vm.isJoinTeam = response.data.data.isJoinTeam;

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
        toApproval:function (id) {
            axios.post('../../volunteer/joinTeamCheck?volunteerId='+id+'&status=3', {})
                .then(function (response) {
                    if (response.data.code === 200) {
                        alert("审核完成");
                        location.reload();
                    }
                    console.log(response);
                })
        },
        toReject:function (id) {
            axios.post('../../volunteer/joinTeamCheck?volunteerId='+id+'&status=3', {})
                .then(function (response) {
                    if (response.data.code === 200) {
                        alert("审核完成");
                        location.reload();
                    }
                    console.log(response);
                })
        },
        toJoinTeam:function(id){
            axios.post('../../volunteer/joinTeam?volunteerId='+vm.volunteer.id+'&teamId='+id, {})
                .then(function (response) {
                    if (response.data.code === 200) {
                        alert("等待队长审核......");
                        location.reload();
                    }
                    console.log(response);
                })
        }
    }
})

