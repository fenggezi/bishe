var series1 =[];
var series2 =[];
var series3 = [];
var series4 = [];
// var xTime = ['20201212', '20201213', '20201214', '20201215', '20201216', '20201217', '20201218'];
var xTime = [];

window.onload = function(){

	var vm = new Vue({
		el:"#app",
		methods:{
			send:function(){
				axios({
					method:'get',
					url:'/sensorDate/historydate'
				}).then(function(res){
					for (let i = 0; i <res.data.datas.length; i++) {

						series1[i] = res.data.datas[i].temperature;
						series2[i] = res.data.datas[i].humidity;
						series3[i] = res.data.datas[i].light;
						series4[i] = res.data.datas[i].carbon;
						xTime [i] = res.data.datas[i].timesx;
					}
					})
					.catch(function(error) {
						console.log(error);
					});
			}
		}
	});
	setInterval(vm.send, 1000);  // 定时器每秒调用send
}

//这里发送一个ajax 把数据拿下来就行了
new Chart(document.getElementById("linechart"), {
	type: 'line',
	data: {
		labels: xTime,
		datasets: [{
			label: '温度',
			backgroundColor: window.chartColors.navy,
			borderColor: window.chartColors.navy,
			data: series1,
			fill: false,
		}, {
			label: '湿度',
			fill: false,
			backgroundColor: window.chartColors.purple,
			borderColor: window.chartColors.purple,
			data:series2,
		},{
			label: '光照强度',
			fill: false,
			backgroundColor: window.chartColors.purple,
			borderColor: window.chartColors.green,
			data:series3,
		},{
			label: '烟雾浓度',
			fill: false,
			backgroundColor: window.chartColors.purple,
			borderColor: window.chartColors.blue,
			data:series4,
		}]
	},
	options: {
		responsive: true,
		title: {
			display: true,
			text: 'Chart.js Line Chart'
		},
		tooltips: {
			mode: 'index',
			intersect: false,
		},
		hover: {
			mode: 'nearest',
			intersect: true
		},
		scales: {
			xAxes: [{
				display: true,
				scaleLabel: {
					display: true,
					labelString: '查询时间'
				}
			}],
			yAxes: [{
				display: true,
				scaleLabel: {
					display: true,
					labelString: '数值范围'
				}
			}]
		}
	}
});
