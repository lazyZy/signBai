var vm = new Vue({
    el: '#vm',
    data: {
        volunteer:{
            volunteerMail:"",
            volunteerPwd:"",
            volunteerName:"",
            volunteerSex:"",
            volunteerPhone:"",
            volunteerAdrress:""
        },
        loginReq:{
            email:"",
            pwd:""
        },
        title: "\"心·青年\"志愿活动平台"
    },
    mounted: function () {
        console.log(localStorage.getItem("token"));

        axios.post('../../login/volunteerLoginInfo?token=' + localStorage.getItem("token"), {})
            .then(function (response) {
                if (response.data.code === 200) {
                    vm.volunteer = response.data.data;
                    vm.volunteer.volunteerMail="";
                    vm.volunteer.volunteerPwd=""
                }else{
                    alert("请登录！");
                    location.href = "/page/login";
                }
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
            axios.post('../../register/upVolunteer', {
                loginReq:{
                    email: vm.loginReq.email,
                    pwd: vm.loginReq.pwd
                },
                volunteer:{
                    volunteerMail: vm.volunteer.volunteerMail,
                    volunteerPwd: vm.volunteer.volunteerPwd,
                    volunteerName: vm.volunteer.volunteerName,
                    volunteerSex: vm.volunteer.volunteerSex,
                    volunteerPhone: vm.volunteer.volunteerPhone,
                    volunteerAdrress: vm.volunteer.volunteerAdrress
                },
            })
                .then(function (response) {
                    if (response.data.code === 400) {
                        alert(response.data.message);
                        location.reload();
                    }
                    if (response.data.code === 200) {
                        alert("修改成功");
                        location.href = "/page/volunteerIndex";
                    }
                    console.log(response);
                });
        }


    }
});

