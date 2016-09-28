<#macro homeLayout>
<!DOCTYPE html>
<html>
<head>
	<#include "assetTop.ftl"/>
</head>
<body>
	 <!-- Begin page content -->
    <div class="container">
		<#include "navBar.ftl"/>
		<#nested/>
	</div>
	<#include "assetBottom.ftl"/>
</body>
</html>
</#macro>