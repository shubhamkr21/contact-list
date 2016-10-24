import java.io.Serializable;

public class relative extends aquaintance implements Serializable{
	private String bday;
	private String dolm;//date of last meating
	
	public String getBday() {
		return bday;
	}
	public void setBday(String bday) {
		this.bday = bday;
	}
	public String getDolm() {
		return dolm;
	}
	public void setDolm(String dolm) {
		this.dolm = dolm;
	}
	public void setname(String name){
		this.name = name;
	}
	public String getname() {
		return name;
	}
	public void setmobile(String m){
		this.mob = m;
	}
	public String getmobile(){
		return mob;
	}
	public String get_email(){
		return email;
	}
	public void set_email(String mail){
		this.email = mail;
	}

}
