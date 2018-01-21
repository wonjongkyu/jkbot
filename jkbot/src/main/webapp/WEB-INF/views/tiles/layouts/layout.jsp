<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	
	<title><tiles:getAsString name="title" /></title>
    
    <link href="<c:url value='/css/bootstrap.min.css'/>" rel="stylesheet" />
    <link href="<c:url value='/font-awesome/css/font-awesome.css'/>" rel="stylesheet" />
    <!-- Morris -->
    <link href="<c:url value='/css/plugins/morris/morris-0.4.3.min.css'/>" rel="stylesheet">
    <link href="<c:url value='/css/animate.css" rel="stylesheet'/>" />
    <link href="<c:url value='/css/style.css" rel="stylesheet'/>" />

    <link href="<c:url value='/css/plugins/jQueryUI/jquery-ui-1.10.4.custom.min.css'/>" rel="stylesheet">
    <link href="<c:url value='/css/plugins/jqGrid/ui.jqgrid.css'/>" rel="stylesheet">
    <link href="<c:url value='/css/style.css'/>" rel="stylesheet">
    
     <!-- Mainly scripts -->
	 <script src="js/jquery-3.1.1.min.js"></script>
	 <script src="js/bootstrap.min.js"></script>
	 <script src="js/plugins/metisMenu/jquery.metisMenu.js"></script>
	 <script src="js/plugins/slimscroll/jquery.slimscroll.min.js"></script>
	
	 <!-- Peity -->
	 <script src="js/plugins/peity/jquery.peity.min.js"></script>
	
	 <!-- jqGrid -->
	 <script src="js/plugins/jqGrid/i18n/grid.locale-en.js"></script>
	 <script src="js/plugins/jqGrid/jquery.jqGrid.min.js"></script>
	
	 <!-- Custom and plugin javascript -->
	 <script src="js/inspinia.js"></script>
	 <script src="js/plugins/pace/pace.min.js"></script>
	 <script src="js/plugins/jquery-ui/jquery-ui.min.js"></script>
</head>

<body>
	<div id="wrapper">
	    <header id="header">
	        <tiles:insertAttribute name="header" />
	    </header>
	
	    <section id="sidemenu">
	        <tiles:insertAttribute name="left" />
	    </section>
		             
	    <section id="siteContent">
	        <tiles:insertAttribute name="body" />
	    </section>
	
	    <footer id="footer">
	        <tiles:insertAttribute name="footer" />
	    </footer>
	    
	    <footer id="right">
	        <tiles:insertAttribute name="right" />
	    </footer>
    </div>
</body>
</html>
