import java.io.Serializable;

public class professional extends aquaintance implements Serializable{
	private String interest;

	public String getInterest() {
		return interest;
	}

	public void setInterest(String interest) {
		this.interest = interest;
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
