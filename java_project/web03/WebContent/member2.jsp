<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="shop.DB전담"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 입력한 값 서버에서 받아와야 함. -->
<%

//HttpServletRequest request = new HttpServletRequest
   String id = request.getParameter("id");
   String pw = request.getParameter("pw");
   String name = request.getParameter("name");
   String tel = request.getParameter("tel");
   String company = request.getParameter("company");
   String gender = request.getParameter("gender");
   String birth = request.getParameter("birth");
   String card = request.getParameter("card");
   String cardnum = request.getParameter("cardnum");
   String word = request.getParameter("word");
   String[] hobby = request.getParameterValues("hobby");// {"달리기","독서"}
   String result = "";
   for(String x: hobby) {
      result = result + x + " ";
   }
   //서버에서 받아올 값이 여러개인 경우 다르게 처리해주어야 함.
%>
    <!-- 입력한 값 db처리전담하는 클래스한테 create!하라고 명령  -->
<%//자바코드
   DB전담 db = new DB전담();
   db.create();
   

%>
    <!-- 회원가입처리 결과 알려줌. 클라이언트: html -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>당신의 회원정보를 확인해주세요.</h3>
<hr color="red">
당신이 입력한 아이디: <%= id %> <br>
당신이 입력한 비밀번호: <%= pw %> <br>
당신이 입력한 이름: <%= name %> <br>
당신이 입력한 휴대폰 번호: <%= company %><%= tel %> <br>
당신이 입력한 성별: <%= gender %> <br>
당신이 입력한 생년월일: <%= birth %> <br>
당신이 입력한 카드: <%= card %> <br>
당신이 입력한 카드번호: <%= cardnum %> <br>
당신이 입력한 word: <%= word %> <br>
당신이 입력한 취미: <%= result %>
</body>
</html>