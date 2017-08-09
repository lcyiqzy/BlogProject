<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta content="" name="description" />
<meta content="webthemez" name="author" />
<title>后台管理系统</title>
<!-- Bootstrap Styles-->
<link href="assets/css/bootstrap.css" rel="stylesheet" />
<!-- FontAwesome Styles-->
<link href="assets/css/font-awesome.css" rel="stylesheet" />
<!-- Morris Chart Styles-->
<link href="assets/js/morris/morris-0.4.3.min.css" rel="stylesheet" />
<!-- Custom Styles-->
<link href="assets/css/custom-styles.css" rel="stylesheet" />
<link rel="stylesheet" href="assets/js/Lightweight-Chart/cssCharts.css">
</head>

<body>
    <div id="wrapper">
        <%@ include file="/WEB-INF/includes/nav-top.jsp"%>
        <!--/. NAV TOP  -->

        <%@ include file="/WEB-INF/includes/nav-side.jsp"%>
        <!-- /. NAV SIDE  -->

        <div id="page-wrapper">
            <div class="header">
                <h1 class="page-header">
                    管理员 <small>欢迎来到后台管理系统</small>
                </h1>
                <!--                        <ol class="breadcrumb"> -->
                <!--                      <li><a href="#">Home</a></li> -->
                <!--                      <li><a href="#">Dashboard</a></li> -->
                <!--                      <li class="active">Data</li> -->
                <!--                    </ol>  -->

            </div>
            <div id="page-inner">

                <!-- /. ROW  -->

                <div class="row">
                    <div class="col-md-3 col-sm-12 col-xs-12">
                        <div class="board">
                            <div class="panel panel-primary">
                                <div class="number">
                                    <h3>
                                        <h3>44,023</h3>
                                        <small>日访问量</small>
                                    </h3>
                                </div>
                                <div class="icon">
                                    <i class="fa fa-eye fa-5x red"></i>
                                </div>

                            </div>
                        </div>
                    </div>

                    <div class="col-md-3 col-sm-12 col-xs-12">
                        <div class="board">
                            <div class="panel panel-primary">
                                <div class="number">
                                    <h3>
                                        <h3>32,850</h3>
                                        <small>在线人数</small>
                                    </h3>
                                </div>
                                <div class="icon">
                                    <i class="fa fa-user fa-5x blue"></i>
                                </div>

                            </div>
                        </div>
                    </div>

                    <div class="col-md-3 col-sm-12 col-xs-12">
                        <div class="board">
                            <div class="panel panel-primary">
                                <div class="number">
                                    <h3>
                                        <h3>56,150</h3>
                                        <small>文章数量</small>
                                    </h3>
                                </div>
                                <div class="icon">
                                    <i class="fa fa-book fa-5x green"></i>
                                </div>

                            </div>
                        </div>
                    </div>

                    <div class="col-md-3 col-sm-12 col-xs-12">
                        <div class="board">
                            <div class="panel panel-primary">
                                <div class="number">
                                    <h3>
                                        <h3>89,645</h3>
                                        <small>音频数量</small>
                                    </h3>
                                </div>
                                <div class="icon">
                                    <i class="fa fa-comments fa-5x yellow"></i>
                                </div>

                            </div>
                        </div>
                    </div>

                </div>

                <div class="row">
                    <div class="col-xs-6 col-md-3">
                        <div class="panel panel-default">
                            <div class="panel-body easypiechart-panel">
                                <h4>Profit</h4>
                                <div class="easypiechart" id="easypiechart-blue"
                                    data-percent="82">
                                    <span class="percent">82%</span>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-xs-6 col-md-3">
                        <div class="panel panel-default">
                            <div class="panel-body easypiechart-panel">
                                <h4>Sales</h4>
                                <div class="easypiechart" id="easypiechart-orange"
                                    data-percent="55">
                                    <span class="percent">55%</span>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-xs-6 col-md-3">
                        <div class="panel panel-default">
                            <div class="panel-body easypiechart-panel">
                                <h4>Customers</h4>
                                <div class="easypiechart" id="easypiechart-teal"
                                    data-percent="84">
                                    <span class="percent">84%</span>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-xs-6 col-md-3">
                        <div class="panel panel-default">
                            <div class="panel-body easypiechart-panel">
                                <h4>No. of Visits</h4>
                                <div class="easypiechart" id="easypiechart-red"
                                    data-percent="46">
                                    <span class="percent">46%</span>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!--/.row-->

                <div class="copyrights">
                    Collect from <a href="http://www.cssmoban.com/">企业网站模板</a>
                </div>

                <div class="row">
                    <div class="col-md-5">
                        <div class="panel panel-default">
                            <div class="panel-heading">Line Chart</div>
                            <div class="panel-body">
                                <div id="morris-line-chart"></div>
                            </div>
                        </div>
                    </div>

                    <div class="col-md-7">
                        <div class="panel panel-default">
                            <div class="panel-heading">Bar Chart Example</div>
                            <div class="panel-body">
                                <div id="morris-bar-chart"></div>
                            </div>

                        </div>
                    </div>

                </div>



                <div class="row">
                    <div class="col-md-9 col-sm-12 col-xs-12">
                        <div class="panel panel-default">
                            <div class="panel-heading">Area Chart</div>
                            <div class="panel-body">
                                <div id="morris-area-chart"></div>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-3 col-sm-12 col-xs-12">
                        <div class="panel panel-default">
                            <div class="panel-heading">Donut Chart Example</div>
                            <div class="panel-body">
                                <div id="morris-donut-chart"></div>
                            </div>
                        </div>
                    </div>

                </div>
                <div class="row">
                    <div class="col-md-12"></div>
                </div>
                <!-- /. ROW  -->
                <footer>
                    <p></p>

                </footer>
            </div>
            <!-- /. PAGE INNER  -->
        </div>
        <!-- /. PAGE WRAPPER  -->
    </div>
    <!-- /. WRAPPER  -->
    <!-- JS Scripts-->
    <!-- jQuery Js -->
    <script src="assets/js/jquery-1.10.2.js"></script>
    <!-- Bootstrap Js -->
    <script src="assets/js/bootstrap.min.js"></script>

    <!-- Metis Menu Js -->
    <script src="assets/js/jquery.metisMenu.js"></script>
    <!-- Morris Chart Js -->
    <script src="assets/js/morris/raphael-2.1.0.min.js"></script>
    <script src="assets/js/morris/morris.js"></script>


    <script src="assets/js/easypiechart.js"></script>
    <script src="assets/js/easypiechart-data.js"></script>

    <script src="assets/js/Lightweight-Chart/jquery.chart.js"></script>

    <!-- Custom Js -->
    <script src="assets/js/custom-scripts.js"></script>


    <!-- Chart Js -->
    <script type="text/javascript" src="assets/js/Chart.min.js"></script>
    <script type="text/javascript" src="assets/js/chartjs.js"></script>

</body>

</html>