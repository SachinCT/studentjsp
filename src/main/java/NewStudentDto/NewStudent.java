package NewStudentDto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class NewStudent {

	@Id
	private int sId;
	private String sName;
	private String sEmail;
	private String sPassword;
	private String sAddress;
	private long sPhone;
	private double sFees;
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsEmail() {
		return sEmail;
	}
	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}
	public String getsPassword() {
		return sPassword;
	}
	public void setsPassword(String sPassword) {
		this.sPassword = sPassword;
	}
	public String getsAddress() {
		return sAddress;
	}
	public void setsAddress(String sAddress) {
		this.sAddress = sAddress;
	}
	public long getsPhone() {
		return sPhone;
	}
	public void setsPhone(long sPhone) {
		this.sPhone = sPhone;
	}
	public double getsFees() {
		return sFees;
	}
	public void setsFees(double sFees) {
		this.sFees = sFees;
	}
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", sEmail=" + sEmail + ", sPassword=" + sPassword
				+ ", sAddress=" + sAddress + ", sPhone=" + sPhone + ", sFees=" + sFees + "]";
	}
	
	
}
