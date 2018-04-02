var vm = new Vue({
    el: '#vm',
    data: {
        login: {
            email: "",
            pwd: "",
            name:"",
            sex:0,
            phone:"",
            adrress:""
        },
        title:  "\"心·青年\"志愿活动平台"
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

        confirm:function(){
            axios.post('../../register/volunteer', {
                volunteerMail: vm.login.email,
                volunteerPwd: vm.login.pwd,
                volunteerName:vm.login.name,
                volunteerSex:vm.login.sex,
                volunteerPhone:vm.login.phone,
                volunteerAdrress:vm.login.adrress
            })
                .then(function (response) {
                    if (response.data.code === 200) {
                        alert("注册成功");
                    }
                    location.href = "/page/index";
                    console.log(response);
                })
        },


    }
});

