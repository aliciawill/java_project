<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">

function validate() {
   var re = /^[a-zA-Z0-9]{4,12}$/ // 아이디와 패스워드가 적합한지 검사할 정규식
   var re2 = /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i;
   // 이메일이 적합한지 검사할 정규식

   var id = document.getElementById("id");
   var pw = document.getElementById("pw");
   var email = document.getElementById("email");

   if (!check(re, id, "아이디는 4~12자의 영문 대소문자와 숫자로만 입력")) {
      return false;
   }

   if (!check(re, pw, "패스워드는 4~12자의 영문 대소문자와 숫자로만 입력")) {
      return false;
   }

   if (join.pw.value != join.pw2.value) {
      alert("비밀번호가 다릅니다. 다시 확인해 주세요.");
      join.checkpw.value = "";
      join.checkpw.focus();
      return false;
   }

   if (email.value == "") {
      alert("이메일을 입력해 주세요");
      email.focus();
      return false;
   }

   if (!check(re2, email, "적합하지 않은 이메일 형식입니다.")) {
      return false;
   }

   if (join.name.value == "") {
      alert("이름을 입력해 주세요.");
      join.name.focus();
      return false;
   }
   
   alert("회원가입이 완료되었습니다.");
   
}

function check(re, what, message) {
   if (re.test(what.value)) {
      return true;
   }
   alert(message);
   what.value = "";
   what.focus();
   // return false;

}

</script>
<meta charset="UTF-8">
<title>회원 가입 화면</title>
<style>
#wrap {
   width: 530px;
   margin-left: auto;
   margin-right: auto;
   text-align: center;
}

table {
   border: 3px solid skyblue
}

td {
   border: 1px solid skyblue
}

#title {
   background-color: skyblue
}
</style>
</head>
<body>
   <h2>회원 가입 화면입니다.</h2>
   <hr color="red">
   <div id="wrap">
      <br> <br> <b><font size="6" color="gray">회원가입</font></b> <br>
      <br> <br>
      <!-- form태그는 값을 입력하고 싶을 때 사용 -->
      <!-- 입력값들은 모두 form들어가야 한다. -->
      <!-- action: 입력값을 받아서 처리하는 다음 페이지를 지정 -->
      <form name="join" onsubmit="return validate();" method="post" enctype="text/plain">
         <table>
            <tr>
               <td id="title" width="180px" align="center">아이디</td>
               <td align="left"><input type="text" name="id" maxlength="20" id="id">
                  <input type="button" value="중복확인"></td>
            </tr>
            <tr>
               <td id="title" align="center">비밀번호</td>
               <td align="left"><input type="password" name="pw"
                  maxlength="20"></td>
            </tr>
            <tr>
               <td id="title" align="center">비밀번호 확인</td>
               <td align="left"><input type="password" name="pw2"
                  maxlength="20"></td>
            </tr>
            <tr>
               <td id="title" align="center">이름</td>
               <td align="left"><input type="text" name="name" maxlength="20">
               </td>
            </tr>
            <tr>
               <td id="title" align="center">닉네임</td>
               <td align="left"><input type="text" name="nickname"
                  maxlength="20"></td>
            </tr>
            <tr>
               <td id="title" align="center">주민등록번호</td>
               <td align="left">
               <input type="hidden" name="social_num">
               <input type="text" name="sn1" size="10" maxlength="6"> - 
               <input type="text" name="sn2" size="10" maxlength="7">
               <input type="button" VALUE="실명 확인" onclick = "varidate()" >
               </td>
            </tr>
            <tr>
               <td id="title" align="center">전화번호</td>
               <td align="left"> 
               <input type="hidden" name="phone">
               <input type="text"  name="tel1" size="1" maxlength="3"> -
                   <input type="text"  name="tel2" size="3" maxlength="4"> -
                 <input type="text" name="tel3" size="3" maxlength="4">
               </td>
            </tr>
            <tr>
               <td id="title" align="center">주소</td>
               <td align="left"><input type="text" name="address"
                  maxlength="20"></td>
            </tr>
            <tr>
               <td id="title" align="center">이메일</td>
               <td align="left"><input type="text" name="email"
                  maxlength="20"></td>
            </tr>
         </table>
         <input type="submit" value="가입신청">
      </form>
   </div>
</body>
</html>