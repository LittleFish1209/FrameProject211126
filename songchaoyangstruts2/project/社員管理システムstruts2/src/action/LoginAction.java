package action;

import java.sql.SQLException;

import bean.User;
import dao.LoginDao;

public class LoginAction {
	private String accountId;
    private String password;
    private String errorMessage;
    public String getAccountId() {
        return accountId;
    }
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getErrorMessage() {
        return errorMessage;
    }
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
    public String execute() {
        try {
            LoginDao loginDao = new LoginDao();
            User user =loginDao.getUser(accountId);
            if(user==null) {
                return showMessage("有効なメールアドレスを入力してください!");
            }else if(!password.equals(user.getPassword())) {
                return showMessage("パスワード欄に6桁半角英数字を入力してください!");
            }else {
                return "NewUser";
            }
        }catch(SQLException e) {
            return showExceptionMessage("DBの例外が発生しました、管理者へ連絡してください！");
        }
    }
    public String showMessage(String errorMessage) {
        this.errorMessage=errorMessage;
        return "error";
    }
    public String showExceptionMessage(String errorMessage) {
        this.errorMessage=errorMessage;
        return "error";
    }
}
