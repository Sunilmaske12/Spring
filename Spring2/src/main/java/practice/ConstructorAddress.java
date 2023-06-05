package practice;

public class ConstructorAddress {
	 String towm;
	 String state;
	public ConstructorAddress(String towm, String state) {
		super();
		this.towm = towm;
		this.state = state;
	}
	public ConstructorAddress() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ConstructorAddress [towm=" + towm + ", state=" + state + "]";
	}
	 
	 
}
