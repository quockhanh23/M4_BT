<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Greeting</title>
</head>
<body>
<h1>Hello: ${name}</h1>
<form action="/total" method="post">
  <input  name="a">
  <input name="b">
  <button>Click</button>
</form>

<form action="/change" method="post">
  <input  name="a">
  <button>Click</button>
</form>
<h2>kết quả ${dola}$</h2>
</body>
</html>