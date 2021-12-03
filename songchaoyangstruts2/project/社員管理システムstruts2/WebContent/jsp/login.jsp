<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- Struts2のタグライブラリを使用可能にする -->
<%@ taglib prefix="s" uri="/struts-tags" %>
<!-- タイプ宣言はHTML5のものを使用する -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
<!-- データを入力するとき、placeholderの値を隠します -->
<script type="text/javascript">
    function eraseInfo(){
        document.getElementByName("accountId")[0].placeholder="";
        }
</script>
</head>
<body background="C:\Users\user\Desktop\login.jpg"
	style="background-attachment: fixed;background-repeat: no-repeat;background-size: 100% 100%">
    <h1 align="center" style="font-size:40px;" >社員管理システム</h1>
    <br><hr>
    <div align="center">
        <s:form action="login" method="POST" name="form" theme="simple">
            <table>
                <tr>
                    <td><s:text name="ユーザーID"/></td>
                </tr>
                <tr><!-- 111@softusing.com 000001 -->
                    <td><s:textfield name="accountId"
                    placeholder="メールアドレスを入力してください!"
                    onkeydown="eraseInfo();"/>
                    </td>
                </tr>
                <tr>
                    <td><s:text name="パスワード" /></td>
                </tr>
                <tr>
                    <td><s:password name="password" value="" maxlength="6"
                    placeholder="パスワードを入力してください!"/></td>
                </tr>
            </table>
            <s:submit value="ログイン"></s:submit>
        </s:form>
    </div>
	<div style="color:red">
       	<s:property value="errorMessage"/>
    </div>
    <footer>
        <hr>
        <h4>Softusing.co.jp</h4>
    </footer>
</body>
</html>