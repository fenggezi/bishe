var series1 =[];
var series2 =[];
var series3 = [];
var series4 = [];
var xTime = ['20201212', '20201213', '20201214', '20201215', '20201216', '20201217', '20201218'];

window.onload = function(){
	var vm = new Vue({
			// get:function(){
			// 	//发送get请求
			// 	this.$http.get('/sensorDate/historydate').then(function(res){
			// 		for (var i = 0 ;i<res.length;i++){
			// 			series1[series1.length] = res[i].temperature; // wen
			// 			series2[series2.length] = res[i].humidity; //shi
			// 			series3[series3.length] = res[i].Light; // guang
			// 			series4[series4.length] = res[i].carbon; // er
			// 		}
			// 		// document.write(res.body);
			// 	},function(){
			// 		console.log('请求失败处理');
			// 	});
			// }
			$.ajax({

			});
	});
	setInterval(vm.send, 1000);  // 定时器每秒调用send

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
		}]
	},
	options: {
		responsive: true,
		// title: {
		// 	display: true,
		// 	text: 'Chart.js Line Chart'
		// },
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
					labelString: 'Time'
				}
			}],
			yAxes: [{
				display: true,
				scaleLabel: {
					display: true,
					labelString: 'Value'
				}
			}]
		}
	}
});

//这里发送一个ajax 把数据拿下来就行了
new Chart(document.getElementById("carbonline"), {
	type: 'line',
	data: {
		labels: xTime,
		datasets: [{
			label: '光照强度',
			fill: false,
			backgroundColor: window.chartColors.purple,
			borderColor: window.chartColors.green,
			data:series3,
		},{
			label: '二氧化碳浓度',
			fill: false,
			backgroundColor: window.chartColors.purple,
			borderColor: window.chartColors.blue,
			data:series4,
		}]
	},
	options: {
		responsive: true,
		// title: {
		// 	display: true,
		// 	text: 'Chart.js Line Chart'
		// },
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
					labelString: 'Time'
				}
			}],
			yAxes: [{
				display: true,
				scaleLabel: {
					display: true,
					labelString: 'Value'
				}
			}]
		}
	}
});
