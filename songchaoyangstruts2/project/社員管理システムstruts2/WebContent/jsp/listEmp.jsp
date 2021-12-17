<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- Struts2のタグライブラリを使用可能にする -->
<!-- タイプ宣言はHTML5のものを使用する -->
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib uri="/struts-dojo-tags" prefix="sx"%>
<!DOCTYPE html>
<html>
<head >
<meta charset="UTF-8">
<title>社員基本情報一覧</title>
<!-- データを入力するとき、placeholderの値を隠します -->
<sx:head/>
</head>
<body background="C:\Users\user\Desktop\login.jpg"
	style="background-attachment: fixed;background-repeat: no-repeat;background-size: 100% 100%">
    <h1  style="font-size:40px;" >社員基本情報一覧</h1>
    <br><hr>

    <div align="right">
    	<s:submit value="新規社員登録"></s:submit>
    	<s:submit value="ログアウト"></s:submit>
    </div><br>
    <div align="center">
    	<s:text name="姓名"/>
    	<s:textfield name=""/>
    	<s:submit value="社員検索"></s:submit>
    </div><br>
     <div align="center">
        <s:form action="login" method="POST" name="form" theme="simple">
            <table border="1" style="background-color:white;">
                <tr>
                    <th><s:text name="社員番号"/></th>
                    <th><s:text name="姓名"/></th>
                    <th><s:text name="生年月日"/></th>
                    <th><s:text name="国籍"/></th>
                    <th><s:text name="性別"/></th>
                    <th colspan="2"><s:text name="操作"/></th>
                </tr>
                <tr>
                    <td><s:textfield name="empCd"/></td>
                    <td><s:textfield name="name" /></td>
                    <td><s:textfield name="birthday" /></td>
                    <td><s:textfield name="countryCd" /></td>
                    <td><s:textfield name="sexCd" /></td>
                    <td><s:submit value="変更"></s:submit></td>
                    <td><s:submit value="削除"></s:submit></td>
                </tr>
            </table>
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