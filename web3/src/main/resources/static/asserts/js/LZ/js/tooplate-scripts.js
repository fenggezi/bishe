const width_threshold = 480;
var series1 =['29','30','30','32','29','29','31','30','32','31','30','31'];
var series2 =['70','73','72','72','70','68','73','68','70','73','72','72'];
// var series3 = ['1200','1199','1212','1300','1212','1236','1245','1399','1243','1236','1245'];
var series4 =['1310','1499','1345','1534','1345','1244','1232','1356','1456','1345','1534'];
// var xTime = ['29','30','30','32','29','29','31','30','32','31','30','31'];
var xTime = [];
window.onload = function(){

  var vm = new Vue({
    el:"#app",
    methods:{
      send:function(){
        axios({
          method:'get',
          url:'/sensorDate/history'
        }).then(function(res){
          for (let i = 0; i <res.data.datas.length; i++) {

            series1[i] = res.data.datas[i].temperature;
            series2[i] = res.data.datas[i].humidity;
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
function drawLineChart() {
  if ($("#lineChart").length) {
    ctxLine = document.getElementById("lineChart").getContext("2d");
    optionsLine = {
      scales: {
        yAxes: [
          {
            scaleLabel: {
              display: true,
              labelString: "Hits"
            }
          }
        ]
      }
    };

    // Set aspect ratio based on window width
    optionsLine.maintainAspectRatio =
      $(window).width() < width_threshold ? false : true;

    configLine = {
      type: "line",
      data: {
      //   labels: [
      //     "January",
      //     "February",
      //     "March",
      //     "April",
      //     "May",
      //     "June",
      //     "July"
      //   ],
        labels:xTime,
        datasets: [
          {
            label: "温度",
            data: ['29','30','30','32','29','29','31','30','32','31','30','31'],
            // data:series1,
            fill: false,
            borderColor: "rgb(75, 192, 192)",
            cubicInterpolationMode: "monotone",
            pointRadius: 0
          },
          {
            label: "湿度",
            data: ['34','43','45','44','42','31','38','38','42','41','35','38'],
            // data:series2,
            fill: false,
            borderColor: "rgba(255,99,132,1)",
            cubicInterpolationMode: "monotone",
            pointRadius: 0
          },
          {
            label: "烟雾浓度",
            data: ['1310','1499','1345','1534','1345','1244','1232','1356','1456','1345','1534'],
            // data:series4,
            fill: false,
            borderColor: "rgba(153, 102, 255, 1)",
            cubicInterpolationMode: "monotone",
            pointRadius: 0
          }
        ]
      },
      options: optionsLine
    };

    lineChart = new Chart(ctxLine, configLine);
  }
}

function drawLineChartwendu() {
  if ($("#lineChart2").length) {
    ctxLine = document.getElementById("lineChart2").getContext("2d");
    optionsLine = {
      scales: {
        yAxes: [
          {
            scaleLabel: {
              display: true,
              labelString: "Hits"
            }
          }
        ]
      }
    };

    // Set aspect ratio based on window width
    optionsLine.maintainAspectRatio =
      $(window).width() < width_threshold ? false : true;

    configLine = {
      type: "line",
      data: {
        // labels: [
        //   "January",
        //   "February",
        //   "March",
        //   "April",
        //   "May",
        //   "June",
        //   "July"
        // ],
        labels:xTime,
        datasets: [
          {
            label: "温度",
            data: ['29','30','30','32','29','29','31','30','32','31','30','31'],
            fill: false,
            borderColor: "rgb(75, 192, 192)",
            cubicInterpolationMode: "monotone",
            pointRadius: 0
          }
        ]
      },
      options: optionsLine
    };

    lineChart = new Chart(ctxLine, configLine);
  }
}

function drawLineChartshidu() {
  if ($("#lineChart3").length) {
    ctxLine = document.getElementById("lineChart3").getContext("2d");
    optionsLine = {
      scales: {
        yAxes: [
          {
            scaleLabel: {
              display: true,
              labelString: "Hits"
            }
          }
        ]
      }
    };

    // Set aspect ratio based on window width
    optionsLine.maintainAspectRatio =
      $(window).width() < width_threshold ? false : true;

    configLine = {
      type: "line",
      data: {
        // labels: [
        //   "January",
        //   "February",
        //   "March",
        //   "April",
        //   "May",
        //   "June",
        //   "July"
        // ],
        labels:xTime,
        datasets: [
         
          {
            label: "湿度",
            data: ['34','43','45','44','42','31','38','38','42','41','35','38'],
            fill: false,
            borderColor: "rgba(255,99,132,1)",
            cubicInterpolationMode: "monotone",
            pointRadius: 0
          },
          
        ]
      },
      options: optionsLine
    };

    lineChart = new Chart(ctxLine, configLine);
  }
}

function drawLineChartyanwu() {
  if ($("#lineChart4").length) {
    ctxLine = document.getElementById("lineChart4").getContext("2d");
    optionsLine = {
      scales: {
        yAxes: [
          {
            scaleLabel: {
              display: true,
              labelString: "Hits"
            }
          }
        ]
      }
    };

    // Set aspect ratio based on window width
    optionsLine.maintainAspectRatio =
      $(window).width() < width_threshold ? false : true;

    configLine = {
      type: "line",
      data: {
        // labels: [
        //   "January",
        //   "February",
        //   "March",
        //   "April",
        //   "May",
        //   "June",
        //   "July"
        // ],
        labels:xTime,

        datasets: [
          
          {
            label: "烟雾浓度",
            data: ['1310','1499','1345','1534','1345','1244','1232','1356','1456','1345','1534'],
            fill: false,
            borderColor: "rgba(153, 102, 255, 1)",
            cubicInterpolationMode: "monotone",
            pointRadius: 0
          }
        ]
      },
      options: optionsLine
    };

    lineChart = new Chart(ctxLine, configLine);
  }
}




function updateLineChart() {
  if (lineChart) {
    lineChart.options = optionsLine;
    lineChart.update();
  }
}

function updateBarChart() {
  // if (barChart) {
  //   barChart.options = optionsBar;
  //   barChart.update();
  // }
}
