package practice;

public class Practice1 {
private int a;
private String b;
private Practice2 practice2;

public Practice2 getPractice2() {
	return practice2;
}
public void setPractice2(Practice2 practice2) {
	this.practice2 = practice2;
}


public Practice1(int a, String b) {
	super();
	this.a = a;
	this.b = b;
}
public Practice1() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Practice1 [a=" + a + ", b=" + b + ", practice2=" + practice2 + "]";
}

}
