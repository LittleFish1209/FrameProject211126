function deleteA(obj){
    var tr=obj.parentNode.parentNode;
    tr.parentNode.removeChild(tr);
}

function henkou(bt1) {
    var paras = "";
    var eles = bt1.parentElement.parentElement.children;

    for (var i = 0; i < eles.length - 1; i++) {
        var val = eles[i].innerText;    

        if (i != eles.length - 2){
            paras = paras + "para" + [i] + "=" + val + "&" +"";
        } else {
            paras = paras+ "para" + [i] + "=" +val;
        }

        document.location.href = "addEmp.html?" + paras + "&trId=" + bt1.parentElement.parentElement.id;
    }
}

function showvalf() {
    var thisURL = decodeURI(document.URL);
    var getval = thisURL.split("?")[1];
    var showvals = getval.split("&");

    for (i = 0; i < showvals.length; i++) {
        var showpara = showvals[i].split("=")[0];
        var showval = showvals[i].split("=")[1];    

        document.getElementById(showpara).value = showval;
    }
}

function panduan() {
    var flag = true;
    if (flag == true) {
        var base = "";
        var fun = document.getElementsByClassName("textB");
        for (i = 0;i <= 8;i++){
            var nut = fun[i].value;
            if (i != 8) {
                base = base + "para" + [i] + "=" + nut +"&";
            } else {
                base = base + "para" + [i] + "=" + nut;
            }
        }
    }
    document.location.href = "listEmp.html?" + base + "&trId=" + document.getElementById("trId").value;
}


function jtxx(goDetail){
    var content="";
    var data=goDetail.parentElement.children;//trの元素を取得
    for (var n=0;n<data.length-1;n++){
        var store = data[n].innerText;
        if(n!=data.length-2){
            content=content+"para"+[n]+"="+store+"&"
        }
        else{content=content+"para"+[n]+"="+store;}
    }
    document.location.href="detailEmp.html?"+content;
}

function recive(){
    var thisURL=decodeURI(document.URL);
    var getval=thisURL.split('?')[1];
    var showvals=getval.split('&');
    var trId=showvals[showvals.length-1].split("=")[1];
    var currentTr=document.getElementById(trId);
    for(var i=0;i<currentTr.childElementCount-1;i++){
        currentTr.children[i].innerText=showvals[i].split("=")[1];
    }
}
function chkPwd(){
    
    if(isNaN(document.form11.password.value)){
        alert("エラー,パスワードは数字ではない!");
        document.form11.password();
    }
}

function wupBtn(){
    var name1 = document.form11.address.value;
    var tt2 = document.form11.password.value;
    if ((name1 =="")||(tt2 =="")) {
        document.form11.sure.disabled = true;
    }else{
        document.form11.sure.disabled = false;

    }
}
function search(){// 点击搜索 链接该函数
    var sName = document.getElementById("searchName").value;   //获取用户输入的信息 并赋值给
    var names = document.getElementsByName("empName");     //获取name中的数据 赋值给names
                                                      // 用names数组中的子元素和 用户输入的的值进行比较
    if(sName!=""){
        for(i=0;i<names.length;i++){
            if(!(names[i].innerText.includes(sName))){//如果数组names中的值不包含 用户输入的值   则删除该行
                var currentTr = names[i].parentElement;// 声明一个变量 现在的行并且赋值  名字数组的父级数据 名字数组是td 父级数据就是tr
                currentTr.parentElement.removeChild(currentTr);//从现在的行的父级数据移除一个子级别数据（要移除的数据==现在的行）
                i--;// 执行了这个方程 即代表删除了一行  而i的值不减少的话 就会跳过一行的搜索
            }       
        }
    }
}
function back(){
    window.history.go(-1);
}