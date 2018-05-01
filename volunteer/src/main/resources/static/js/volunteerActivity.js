var vm = new Vue({
    el: '#vm',
    data: {
        title: "管理员首页",
        volunteer: {
            id:"",
            volunteerName: "",
            volunteerSex: "",
            volunteerPhone: "",
            volunteerEmail: "",
            volunteerAdrress: ""
        },
        teamInfo: {
            id: "",
            teamName: "",
            teamStauts: "",
            memberNum: "",
            teamRegion: ""
        },
        activity:{
            teamId:"",
            leaderId:"",
            name:"",
            region:"",
            introduce:"",
            startTime:"",
            endTime:""
        },
        isTeamLeader:true
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
                                vm.activity.teamId = vm.teamInfo.id;
                                vm.activity.leaderId = vm.volunteer.id;
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
        confirm:function(){
            axios.post('../../volunteer/applyActivity', {
                teamId: vm.activity.teamId,
                leaderId: vm.activity.leaderId,
                name:vm.activity.name,
                region:vm.activity.region,
                introduce:vm.activity.introduce,
                startTime:Date.parse(vm.activity.startTime),
                endTime:Date.parse(vm.activity.endTime)
            })
                .then(function (response) {
                    if (response.data.code === 200) {
                        alert("申请成功，等待管理员审核");
                        location.href = "/page/volunteerIndex";
                    } else{
                        alert(response.data.message);
                    }
                })
        }
    }
})

