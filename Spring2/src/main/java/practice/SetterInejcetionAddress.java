package practice;

public class SetterInejcetionAddress {
	String town;
	String distict;
	String State;
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public String getDistict() {
		return distict;
	}
	public void setDistict(String distict) {
		this.distict = distict;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public SetterInejcetionAddress() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "SetterInejcetionAddress [town=" + town + ", distict=" + distict + ", State=" + State + "]";
	}
	
	
}
