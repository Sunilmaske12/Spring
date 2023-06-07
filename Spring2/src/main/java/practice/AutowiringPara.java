package practice;

import org.springframework.beans.factory.annotation.Autowired;

public class AutowiringPara {
	@Autowired
	AutowiringAddress address;
	public AutowiringPara() {
	}
	
	@Autowired
	public AutowiringPara(AutowiringAddress address) {
		super();
		this.address = address;
	}

	@Override
	public String toString() {
		return "AutowiringPara [address=" + address + "]";
	}
	
	
}
