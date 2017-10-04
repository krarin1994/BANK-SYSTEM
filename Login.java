package banking;

import java.io.Serializable;

public class Login implements Serializable
{
	private String loginid;
	private String loginpass;
	
	public Login(String loginid, String loginpass) {
		super();
		this.loginid = loginid;
		this.loginpass = loginpass;
	}
	public Login()
	{
		
	}
	
	public String getLoginId() {
		return loginid;
	}
	public void setLoginId(String loginid) {
		this.loginid = loginid;
	}
	public String getLoginPass() {
		return loginpass;
	}
	public void setLoginPass(String loginpass) {
		this.loginpass = loginpass;
	}

}
