<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>Heroic Features - Start Bootstrap Template</title>

 <!-- Bootstrap core CSS -->
  <link href="<%=request.getContextPath()%>/boot/bootstrap/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

  <!-- Custom styles for this template -->
  <link href="<%=request.getContextPath()%>/boot/bootstrap/css/heroic-features.css" rel="stylesheet">

</head>

<body>

  <!-- Navigation -->
  <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
    <div class="container">
      <a class="navbar-brand" href="#">인사관리 시스템</a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarResponsive">
        <ul class="navbar-nav ml-auto">
          <li class="nav-item active">
            <a class="nav-link" href="<%=request.getContextPath()%>">Home
              <span class="sr-only">(current)</span>
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="hr/salary">월급</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="hr/vacation">휴가</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="hr/approval">결재</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="hr/board">게시판</a>
          </li>
        </ul>
      </div>
    </div>
  </nav>

  <!-- Page Content -->
  <div class="container">

    <!-- Jumbotron Header -->
    <header class="jumbotron my-4">
      <h1 class="display-3">인사관리 홈 화면입니다!</h1>
      <p class="lead">원하는 탭을 선택하세요.</p>
    </header>

    <!-- Page Features -->
    <div class="row text-center">

      <div class="col-lg-3 col-md-6 mb-4">
        <div class="card h-100">
          <img class="card-img-top" src="http://placehold.it/500x325" alt="">
          <div class="card-body">
            <h4 class="card-title">월급 지급현황</h4>
            <p class="card-text">사용자의 월급현황을 알아볼 수 있습니다.</p>
          </div>
          <div class="card-footer">
            <a href="hr/salary" class="btn btn-primary">월급!</a>
          </div>
        </div>
      </div>

      <div class="col-lg-3 col-md-6 mb-4">
        <div class="card h-100">
          <img class="card-img-top" src="http://placehold.it/500x325" alt="">
          <div class="card-body">
            <h4 class="card-title">휴가 현황</h4>
            <p class="card-text">휴가신청 및 결재현황을 확인할 수 있습니다.</p>
          </div>
          <div class="card-footer">
            <a href="hr/vacation" class="btn btn-primary">휴가!</a>
          </div>
        </div>
      </div>

      <div class="col-lg-3 col-md-6 mb-4">
        <div class="card h-100">
          <img class="card-img-top" src="http://placehold.it/500x325" alt="">
          <div class="card-body">
            <h4 class="card-title">결재 현황</h4>
            <p class="card-text">결재 진행상황을 알아볼 수 있습니다.</p>
          </div>
          <div class="card-footer">
            <a href="hr/approval" class="btn btn-primary">결재!</a>
          </div>
        </div>
      </div>

      <div class="col-lg-3 col-md-6 mb-4">
        <div class="card h-100">
          <img class="card-img-top" src="http://placehold.it/500x325" alt="">
          <div class="card-body">
            <h4 class="card-title">사내 게시판</h4>
            <p class="card-text">사내 게시판을 확인할 수 있습니다.</p>
          </div>
          <div class="card-footer">
            <a href="hr/board" class="btn btn-primary">게시판!</a>
          </div>
        </div>
      </div>

    </div>
    <!-- /.row -->

  </div>
  <!-- /.container -->

  <!-- Footer -->
  <footer class="py-5 bg-dark">
    <div class="container">
      <p class="m-0 text-center text-white">Copyright &copy; Your Website 2020</p>
    </div>
    <!-- /.container -->
  </footer>

  <!-- Bootstrap core JavaScript -->
  <script src="<%=request.getContextPath()%>/boot/bootstrap/vendor/jquery/jquery.min.js"></script>
  <script src="<%=request.getContextPath()%>/boot/bootstrap/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

</body>

</html>