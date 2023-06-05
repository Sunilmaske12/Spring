package practice;

public class ConstructorInjectionPara {
	int id;
	String name;
	int rollNo;
	ConstructorAddress constructorAddress;
	
		public ConstructorInjectionPara() {
		super();
	}

		public ConstructorInjectionPara(int id, String name, int rollNo, ConstructorAddress constructorAddress) {
			super();
			this.id = id;
			this.name = name;
			this.rollNo = rollNo;
			this.constructorAddress = constructorAddress;
		}

		@Override
		public String toString() {
			return "ConstructorInjectionPara [id=" + id + ", name=" + name + ", rollNo=" + rollNo
					+ ", constructorAddress=" + constructorAddress + "]";
		}
	
	
	
}
