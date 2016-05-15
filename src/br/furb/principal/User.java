package br.furb.principal;

public class User {

	private String user;
	private String pass;

	public User(String userid, String passwd) {
		setUser(userid);
		setPass(passwd);
	}

	public String getUser() {
		return user;
	}

	public void setUser(String userid) {
		this.user = userid;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String passwd) {
		this.pass = passwd;
	}

}
