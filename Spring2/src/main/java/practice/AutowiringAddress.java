package practice;

public class AutowiringAddress {
	String town;
	String state;
	public AutowiringAddress(String town, String state) {
		super();
		this.town = town;
		this.state = state;
	}
	public AutowiringAddress() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "AutowiringAddress [town=" + town + ", state=" + state + "]";
	}
	
	
}
