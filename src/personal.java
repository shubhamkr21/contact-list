import java.io.Serializable;

public class personal extends aquaintance implements Serializable{
	private String context;
	private String acqdate;
	private String events;
	
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	public String getAcqdate() {
		return acqdate;
	}
	public void setAcqdate(String acqdate) {
		this.acqdate = acqdate;
	}
	public String getEvents() {
		return events;
	}
	public void setEvents(String events) {
		this.events = events;
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
