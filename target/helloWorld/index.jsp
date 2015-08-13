<html>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<body>
<h2><a href="<%=basePath %>webservice/helloWorld?wsdl">wsdl</a></h2>


</body>
</html>
