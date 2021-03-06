<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="admin" uri="http://bda.mogujie.org/admin" %>
<c:set var="contextPath" scope="application" value="<%=request.getContextPath()%>" />

<!doctype html>
<html lang="en" class="no-js">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="icon" href="${contextPath}/assets/img/favicon.ico" type="image/x-icon">
    <link rel="stylesheet" href="${contextPath}/assets/css/reset.css" type="text/css" charset="utf-8">
    <link rel="stylesheet" href="${contextPath}/assets/css/style.css" type="text/css" charset="utf-8">
    <link rel="stylesheet" href="${contextPath}/assets/plugins/bootstrap-3.3.5/css/bootstrap.min.css" type="text/css" charset="utf-8">
    <link rel="stylesheet" href="${contextPath}/assets/plugins/bootstrap-3.3.5/css/bootstrap-theme.min.css" type="text/css" charset="utf-8">
    <link rel="stylesheet" href="${contextPath}/assets/plugins/font-awesome/css/font-awesome.min.css" type="text/css" charset="utf-8">
    <link rel="stylesheet" href="${contextPath}/assets/css/login.css" type="text/css" charset="utf-8">
    <link rel="stylesheet" href="${contextPath}/assets/plugins/bootstrap-datetimepicker/css/bootstrap-datetimepicker.min.css" type="text/css" charset="utf-8">
    <link rel="stylesheet" href="${contextPath}/assets/plugins/bootstrap-switch/css/bootstrap3/bootstrap-switch.min.css" type="text/css" charset="utf-8">
    <link rel="stylesheet" href="${contextPath}/assets/plugins/back-to-top/css/style.css" type="text/css" charset="utf-8">
    <link rel="stylesheet" href="${contextPath}/assets/css/cart.css" type="text/css" charset="utf-8">
    <link rel="stylesheet" href="${contextPath}/assets/plugins/breadcrumbs/css/style.css" type="text/css" charset="utf-8">
    <link rel="stylesheet" href="${contextPath}/assets/css/main.css" type="text/css" charset="utf-8">
    <link rel="stylesheet" href="${contextPath}/assets/plugins/select2/4.0.1/css/select2.min.css" type="text/css" charset="utf-8">
    <link type="text/css" rel="stylesheet" href="${contextPath}/assets/plugins/qtip2/jquery.qtip.min.css" />
    <link type="text/css" rel="stylesheet" href="${contextPath}/assets/plugins/pnotify/pnotify.custom.min.css" />
    <link type="text/css" rel="stylesheet" href="${contextPath}/assets/plugins/animate/animate.css" />

    <link type="text/css" rel="stylesheet" href="${contextPath}/assets/plugins/bootstrap-table/bootstrap-table.min.css" />
    <link type="text/css" rel="stylesheet" href="${contextPath}/assets/css/select2_special.css" />
    <link type="text/css" rel="stylesheet" href="${contextPath}/assets/plugins/jstree/3.2.1/themes/default/style.min.css" />



    <script src="${contextPath}/assets/plugins/modernizr/modernizr.js" type="application/javascript" charset="utf-8"></script>
    <script src="${contextPath}/assets/plugins/jquery/jquery-2.1.4.min.js" type="application/javascript" charset="utf-8"></script>


    <script>
        var contextPath = "${contextPath}";
    </script>
    <title>调度系统 - 蘑菇街</title>
</head>
<body>
<header>

  <div id="cd-logo" class="bdmenu">
    <ul>
      <li class="active">
        <a  href="${contextPath}/">${platformName}</a>
      </li>
    </ul>
  </div>


    <nav id="cd-top-nav" class="navbar">
        ${admin:menus(__menus, contextPath)}
    </nav>

    <c:choose>
        <c:when test="${null != user && user.uname != ''}">
            <a id="cd-menu-trigger" href="javascript:void(0);">
                <span class="cd-menu-text">${user.nick}</span>
            </a>
        </c:when>
        <c:otherwise>
            <a id="cd-sign-trigger" class="cd-signin" href="javascript:void(0);">
                <span class="cd-menu-text">Login</span>
            </a>
        </c:otherwise>
    </c:choose>


</header>

<main class="cd-main-content">