window.onload = function() {
    var vm = new Vue({
        el:"#datasreal",
        data:{
            temperature:'25',
            humidity:'',
            light:'1200',
            carbon:'1300',
            timesx:'',
            num:''
        },
        methods:{
            send:function(){
                axios({
                    method:'get',
                    url:'/sensorDate/realtime'
                }).then(function(res){
                    console.log(res)
                    console.log(res.data)
                    console.log(".....####......fenge ")


                    console.log(res.data.timesx)
                    console.log("......####.....fenge ")

                    vm.temperature= res.data.temperature;
                    this.humidity = res.data.humidity;
                    vm.light = res.data.light;
                    vm.carbon = res.data.carbon;
                    vm.timesx  = res.data.timesx;
                    console.log("##########")
                    vm.humidity = res.data.humidity;
                    console.log(this.humidity)
                    console.log(humidity)
                    console.log(humidity)
                    console.log("##########")

                }).catch(function(error) {
                    console.log(error);
                });
            }
        }
    });

    setInterval(vm.send, 3000);  // 定时器每秒调用send
}