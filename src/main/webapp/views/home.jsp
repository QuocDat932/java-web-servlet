<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="vi">
<head>
    <meta charset="UTF-8">
    <title>Trang chủ dự án XQTSC</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<nav class="navbar navbar-expand-lg navbar-dark bg-dark shadow">
    <div class="container">
        <a class="navbar-brand" href="#">
            <img src="https://fpt.com.vn/Content/images/logo_fpt.png" alt="" height="24" class="d-inline-block align-text-top me-2">
            AE Dev XQTSC
        </a>
        <div class="navbar-text text-white">
            Chào, <strong class="text-warning">${sessionScope.userLogged != null ? sessionScope.userLogged : 'Guest'}</strong>
        </div>
    </div>
</nav>

<div class="container mt-5">
    <div class="row">
        <div class="col-12">
            <div class="card shadow-sm border-0">
                <div class="card-body p-5 text-center">
                    <h1 class="display-4 text-primary">Chào mừng AE Dev!</h1>
                    <p class="lead text-muted mt-3">Anh em đã đăng nhập thành công vào hệ thống quản lý dự án.</p>
                    <hr class="my-4">
                    <p>Hiện tại hệ thống đang trong quá trình phát triển (Demo). Anh em có thể xem Log trên Tomcat để thấy `username/password` vừa nhập.</p>
                    <a href="login" class="btn btn-outline-danger btn-lg mt-3">Đăng xuất</a>
                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>