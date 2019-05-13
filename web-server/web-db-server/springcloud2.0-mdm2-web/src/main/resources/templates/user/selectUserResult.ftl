<#setting number_format="#">
<#setting datetime_format="yyyy-MM-dd"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
</head>

<body>
<table >
  <thead>
    <tr>
      <th>id</th>
      <th>code</th>
      <th>name</th>
    </tr>
  </thead>
  <tbody>
<#list users as usr>
<tr>
    <td>${usr.userId!''}</td>
    <td>${usr.loginname}</td>
    <td>${usr.ownername}</td>
    </tr>
</#list>
  </tbody>
</table>
</body>
</html>
