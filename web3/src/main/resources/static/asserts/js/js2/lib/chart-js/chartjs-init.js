(function ($) {
    "use strict";

    /*  Sales Chart
    --------------------*/

    var sales = {
        type: 'line',
        data: {
            labels: ["2012", "2013", "2014", "2015", "2016", "2018", "2019"],
            type: 'line',
            defaultFontFamily: 'Montserrat',
            datasets: [{
                label: "温度",
                data: [0, 42, 23, 14, 25, 15, 140],
                backgroundColor: 'transparent',
                borderColor: '#e6a1f2',
                borderWidth: 3,
                pointStyle: 'circle',
                pointRadius: 5,
                pointBorderColor: 'transparent',
                pointBackgroundColor: '#e6a1f2',

                    }, {
                label: "湿度",
                data: [0, 30, 10, 60, 80, 63, 10],
                backgroundColor: 'transparent',
                borderColor: '#ed7f7e',
                borderWidth: 3,
                pointStyle: 'circle',
                pointRadius: 5,
                pointBorderColor: 'transparent',
                pointBackgroundColor: '#ed7f7e',
                    }, {
                label: "烟雾浓度",
                data: [0, 50, 40, 20, 40, 79, 20],
                backgroundColor: 'transparent',
                borderColor: '#87de75',
                borderWidth: 3,
                pointStyle: 'circle',
                pointRadius: 5,
                pointBorderColor: 'transparent',
                pointBackgroundColor: '#87de75',
                    }]
        },
        options: {
            responsive: true,

            tooltips: {
                mode: 'index',
                titleFontSize: 12,
                titleFontColor: '#000',
                bodyFontColor: '#000',
                backgroundColor: '#fff',
                titleFontFamily: 'Montserrat',
                bodyFontFamily: 'Montserrat',
                cornerRadius: 3,
                intersect: false,
            },
            legend: {
                labels: {
                    usePointStyle: true,
                    fontFamily: 'Montserrat',
                },
            },
            scales: {
                xAxes: [{
                    display: true,
                    gridLines: {
                        display: false,
                        drawBorder: false
                    },
                    scaleLabel: {
                        display: false,
                        labelString: 'Month'
                    }
                        }],
                yAxes: [{
                    display: true,
                    gridLines: {
                        display: false,
                        drawBorder: false
                    },
                    scaleLabel: {
                        display: true,
                        labelString: '参数值'
                    }
                        }]
            },
            title: {
                display: false,
                text: 'Normal Legend'
            }
        }
    };

















    window.onload = function () {
        var ctx = document.getElementById("sales-chart").getContext("2d");
        window.myLine = new Chart(ctx, sales);

        var ctx = document.getElementById("team-chart").getContext("2d");
        window.myLine = new Chart(ctx, team);

        var ctx = document.getElementById("barChart").getContext("2d");
        window.myLine = new Chart(ctx, barChart);

        var ctx = document.getElementById("radarChart").getContext("2d");
        window.myLine = new Chart(ctx, radarChart);

        var ctx = document.getElementById("lineChart").getContext("2d");
        window.myLine = new Chart(ctx, lineChart);

        var ctx = document.getElementById("pieChart").getContext("2d");
        window.myLine = new Chart(ctx, pieChart);

        var ctx = document.getElementById("doughutChart").getContext("2d");
        window.myLine = new Chart(ctx, doughutChart);

        var ctx = document.getElementById("polarChart").getContext("2d");
        window.myLine = new Chart(ctx, polarChart);

        var ctx = document.getElementById("singelBarChart").getContext("2d");
        window.myLine = new Chart(ctx, singelBarChart);
    }; 
    
})(jQuery);









(function ($) {
    "use strict";






})(jQuery);