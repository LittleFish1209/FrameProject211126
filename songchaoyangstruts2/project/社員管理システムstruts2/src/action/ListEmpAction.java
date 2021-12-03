package action;

import java.sql.SQLException;

import dao.ListEmpDao;

public class ListEmpAction {

	private String empCd;
    private String name;
    private String birthday;
    private String countryCd;
    private String sexCd;

public String getEmpCd() {
		return empCd;
	}
	public void setEmpCd(String empCd) {
		this.empCd = empCd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getCountryCd() {
		return countryCd;
	}
	public void setCountryCd(String countryCd) {
		this.countryCd = countryCd;
	}
	public String getSexCd() {
		return sexCd;
	}
	public void setSexCd(String sexCd) {
		this.sexCd = sexCd;
	}
    public String execute() {
        try {
        	ListEmpDao listEmpDao = new ListEmpDao();

            if(ListEmpUser==null) {
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
