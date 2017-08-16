<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="UTF-8">
<head>
<title>用户管理</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0">
<!-- VENDOR CSS -->
<link rel="stylesheet"
	href="${ctp}/assets/vendor/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet"
	href="${ctp}/assets/vendor/font-awesome/css/font-awesome.min.css">
<link rel="stylesheet" href="${ctp}/assets/vendor/linearicons/style.css">
<link rel="stylesheet"
	href="${ctp}/assets/vendor/chartist/css/chartist-custom.css">
<!-- MAIN CSS -->
<link rel="stylesheet" href="${ctp}/assets/css/main.css">
</head>

<body>
	<!-- WRAPPER -->
	<div id="wrapper">
		<!-- NAVBAR -->
		<%@ include file="/WEB-INF/includes/navbar.jsp"%>
		<!-- END NAVBAR -->
		<!-- LEFT SIDEBAR -->
		<%@ include file="/WEB-INF/includes/leftsidebar.jsp"%>
		<!-- END LEFT SIDEBAR -->
		<!-- MAIN -->
		<div class="main">
			<!-- MAIN CONTENT -->
			<div class="main-content">
				<div id="page-inner">

					<div class="row">
						<div class="col-md-12">
							<!-- 用户列表 Tables -->
							<div class="panel panel-default">
								<div class="panel-heading" style="font-size: medium;">标签列表</div>
								<div class="panel-body">
									<button type="button" class="btn btn-danger del_btn"
										style="float: right; margin-left: 10px;">
										<i class=" glyphicon glyphicon-remove"></i> 删除
									</button>
									<button type="button" class="add_label btn btn-primary"
										style="float: right;">
										<i class="glyphicon glyphicon-plus"></i> 新增
									</button>
									<br>
									<hr style="clear: both;">
									<div class="table-responsive">
										<table id="labelTable" class="table  table-bordered">
											<thead>
												<tr>
													<th width="30">#</th>
													<th width="30"><input type="checkbox"
														class="check_all_btn"></th>
													<th>标签名</th>
													<th width="200">操作</th>
												</tr>
											</thead>
											<tbody>
												<!-- 标签列表 -->
											</tbody>
											<tfoot>
												<!-- 分页按钮 -->
												<tr>
												    <td id="pageBar_td" colspan="6" align="center"></td>
												</tr>
											</tfoot>
										</table>
									</div>
								</div>
							</div>
						</div>
						<!--End Advanced Tables -->
					</div>
				</div>

			</div>
			<!-- END MAIN CONTENT -->
		</div>
		<!-- END MAIN -->
		<div class="clearfix"></div>
		<footer>
			<div class="container-fluid">
				<p class="copyright"></p>
			</div>
		</footer>
	</div>
	
	<!-- 添加标签 -->
	<div class="modal fade" id="add_label_model" tabindex="-1" role="dialog" data-backdrop="static"
        aria-labelledby="myModalLabel">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal"
                        aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                    <h4 class="modal-title" id="myModalLabel">添加标签</h4>
                </div>
                <div class="modal-body">
                    <form action="${ctp}/labelManager/add" id="label_form"
                        method="post" enctype="multipart/form-data">
                        <div class="form-group">
                            <label>标签名</label> <input type="text" class="form-control"
                                id="label_name_input" name="name" placeholder="标签名">
                        </div>
                        <div class="form-group">
                            <label>选择标签图片</label> 
                            <input type="file" name="pic" id="pic_file_input">
                        </div>
                        <div class="form-group">
                            <!--选择的文件展示位  -->
                            <div class="row">
                                <div class="col-md-12 imgdiv">
                                
                                </div>
                            </div>
                        </div>
                    </form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                    <button type="button" class="btn btn-primary" id="submitBtn">确定</button>
                </div>
            </div>
        </div>
    </div>
	<!-- END WRAPPER -->
	<!-- Javascript -->
	<script src="${ctp}/assets/vendor/jquery/jquery.min.js"></script>
	<script src="${ctp}/assets/vendor/bootstrap/js/bootstrap.min.js"></script>
	<script
		src="${ctp}/assets/vendor/jquery-slimscroll/jquery.slimscroll.min.js"></script>
	<script src="${ctp}/assets/scripts/klorofil-common.js"></script>
	<script src="${ctp}/plugin/layer/layer.js"></script>
	<script type="text/javascript">
	   $(function(){
		   getAllLabels(1)
	   });
	   
	   $(".add_label").click(function(){
		   $("#add_label_model").modal();
	   });
	   
	   /* 确认添加标签 */
	   $("#submitBtn").click(function(){
		   var fd = new FormData();

		   fd.append("name", $("#label_name_input").val());
           var pic = $("#pic_file_input")[0].files[0]
           fd.append("pic", pic);
           
           $.ajax({
               url : "${ctp}/labelManager/add",
               type : "post",
               data : fd,
               processData : false,//不要处理和编码数据
               contentType : false,//不使用默认的内容类型
               success : function(result) {
                   layer.msg(result);
                   $("#add_label_model").modal("hide");
                   getAllLabels(9999999);
               },
               error : function(e) {
                   layer.msg(e);
               }
           });
	   });
	   
	   /* 获取所有标签 */
       function getAllLabels(pn){
           $.getJSON("${ctp}/labelManager/list?pn=" + pn, function(data) {
                   /* 标签内容 */
                   buildLabels(data.list);
                   /* 显示分页条 */
                   buildPageUl(data);
           });
       }
       
       /* 构建标签栏 */
       function buildLabels(data){
           $("#labelTable tbody").empty();
           $.each(data,function(){
               var tr = $("<tr></tr>")
               .append(
                   "<td>" + this.id +  "</td>"
               ).append(
                   "<td>" + "<input type='checkbox'class='check_all_btn'>" + "</td>"
               ).append(
                   "<td>" + this.labelName + "</td>"
               );
               
               var td = $("<td></td>")
               .append(
                   "<button url='${ctp}/" + this.labelPicUrl + "' type='button' class='btn btn-success btn-xs showImg'><i class='glyphicon glyphicon-check'></i></button>"
               ).append(" ")
               .append(
                   "<button type='button' class='btn btn-danger btn-xs'><i class='glyphicon glyphicon-remove'></i></button>"
               );
               
               td.appendTo(tr);
               
               $("#labelTable tbody").append(tr);
           });
       }
       
       /* 构建分页条 */
       function buildPageUl(page){
           var ul = $("<ul></ul>").addClass("pagination")
           .append($("<li><a onclick='getAllLabels(1)'>首页</a></li>"));
           
           if(page.hasPreviousPage){
               ul.append($("<li><a onclick='getAllLabels(" + page.prePage + ")'>上一页</a></li>"));
           } else {
               ul.append($("<li><a>上一页</a></li>").addClass("disabled"));
           }
           
           var pns = page.navigatepageNums;
           $.each(pns,function(){
               if(this == page.pageNum) {
                   ul.append($("<li><a onclick='getAllLabels(" + this + ")'>"+ this + "</a></li>").addClass("active"));
               }else{
                   ul.append($("<li><a onclick='getAllLabels(" + this + ")'>"+ this + "</a></li>"));
               }
           })
           
           if(page.hasNextPage){
               ul.append($("<li><a onclick='getAllLabels(" + page.nextPage + ")'>下一页</a></li>"));
           } else {
               ul.append($("<li><a>下一页</a></li>").addClass("disabled"));
           }
           
           ul.append($("<li><a onclick='getAllLabels("+ page.pages + ")'>末页</a></li>"));
           
           $("#pageBar_td").empty().append(ul);
       }
       
       //为文件选择项绑定事件；
       $("#pic_file_input").change(function(event){
           //拿到图片项。进行显示
           //1、回调函数需要获取到事件对象
           //2、可以用事件对象得到很多信息
           var files = event.target.files; //this.files[0]
           var file;
           if(files && files.length>0){
               file = files[0];
           }
           //文件上传限制大小  提交表单的时候判断
           //if(file.size > 1024)
           //只允许图片 type:"image/jpeg"
           var reg = /image*/;
           if(!reg.test(file.type)){
               layer.msg("请选择一个图片");
               //不是图片将val置空
               $("#pic_file_input").val("");
               return false;
           };
           
           var URL = window.URL || window.webkitURL;
           //创建一个临时的url地址
           var imgURL = URL.createObjectURL(file);
           
           $(this).parent(".form-group")
               .next(".form-group").find(".imgdiv")
               .append($("<img src='"+imgURL+"'/>").addClass("img-responsive center-block"));
       });
	</script>
</body>

</html>
