var vm = new Vue({
    el: '#vm',
    data: {
        title: "\"心·青年\"志愿活动平台",
        activities:[],
        volunteers:[],
        stars:"",
        volunteer: {
            id: "",
            volunteerName: "",
            volunteerSex: "",
            volunteerPhone: "",
            volunteerEmail: "",
            volunteerAdrress: ""
        }
    },
    mounted: function () {
        if(localStorage.getItem("token") != null && localStorage.getItem("token").length > 0){
        axios.post('../../login/volunteerLoginInfo?token=' + localStorage.getItem("token"), {})
            .then(function (response) {
                if (response.data.code === 200) {
                    console.log(response.data.data);
                    console.log(response.data.data.volunteerName);
                    vm.volunteer = response.data.data;}});
        }
        axios.post('/admin/getDoOrFinishActivity', {})
            .then(function (response) {
                if (response.data.code === 200) {
                    vm.activities = response.data.data;
                }
                console.log(response);

            });
        axios.post('/admin/getAllVolunteer', {})
            .then(function (response) {
                if (response.data.code === 200) {
                    vm.volunteers = response.data.data;
                    if(null == localStorage.getItem("stars")){
                        localStorage.setItem("stars","");
                    }
                    vm.stars = localStorage.getItem("stars");
                }
                console.log(response);

            })

    },
    methods: {

        toApproval:function(id){
            axios.post('/volunteer/vote?volunteerId='+id, {})
                .then(function (response) {
                    if (response.data.code === 200) {
                        localStorage.setItem("stars",vm.stars+1);
                        location.reload();
                    }
                })
        },

        toLogin: function () {
            location.href = "/page/login";
        },

        toRegister: function () {
            location.href = "../page/register";
        },

        reload: function () {
            // $.ajax({
            //     type: "POST",
            //     url: "../../login/info",
            //     contentType: "application/json",
            //     data:JSON.stringify(vm.login),
            //     success: function (r) {
            //         console.log(r.code);
            //         if (r.code === 200) {
            //             alert('操作成功');
            //         } else {
            //             alert("操作失败");
            //         }
            //     }
            // });
            axios.post('../../login/info', {
                email: vm.login.email,
                pwd: vm.login.pwd
            })
                .then(function (response) {
                    if (response.data.code === 200) {
                        location.href = "/page/login";
                    }

                    console.log(response);
                })

        }
    }
});

