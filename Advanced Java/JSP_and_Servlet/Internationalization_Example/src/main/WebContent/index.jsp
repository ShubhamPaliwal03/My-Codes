<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
    <c:set var="locale"
           value="${not empty param.theLocale ? param.theLocale : pageContext.request.locale}"
    />
    <fmt:setLocale value ="${locale}"/>
    <fmt:setBundle basename="mylabels"/>
    <title><fmt:message key="label.title"/></title>
</head>
<body>
<h1>
	<fmt:message key="label.message"/>
	<br>
	<fmt:message key="label.greeting"/>
	<br>
	<fmt:message key="label.firstName"/>
	<br>
	<fmt:message key="label.lastName"/>
</h1>
<br/>
<a href="index.jsp?theLocale=ar_AE">Arabic</a>
<a href="index.jsp?theLocale=de_DE">German</a>
<a href="index.jsp?theLocale=us_US">English (US)</a>
<a href="index.jsp?theLocale=hi_IN">Hindi (India)</a>
<a href="index.jsp?theLocale=ja_JP">Japanese</a>
<a href="index.jsp?theLocale=ru_RU">Russian</a>
<a href="index.jsp?theLocale=es_ES">Spanish</a>
</body>
</html>