package com.example.demo.domain;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Login {
	@NotBlank(message = "ユーザー名を記入してください。")
	@Size(max = 100, message = "ベーダー名は100文字を超えないでください。")
	private String userId;
	
	@NotBlank(message = "パスワードを記入してください。")
	@Size(min = 6, max = 20, message = "パスワードは6-20位を入力してください。")
	private String password;
	private String password1;
	private String password2;

	public String getUserId() {
		return userId;
	}

	public String getPassword1() {
		return password1;
	}

	public void setPassword1(String password1) {
		this.password1 = password1;
	}

	public String getPassword2() {
		return password2;
	}

	public void setPassword2(String password2) {
		this.password2 = password2;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
