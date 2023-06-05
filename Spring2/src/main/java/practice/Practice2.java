package practice;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Practice2 {
	private double c;
	List<String> subject;
	Set<Integer> marks;
	Map<String, Integer> submarks;
	Properties prop;
	
	public List<String> getSubject() {
		return subject;
	}

	public void setSubject(List<String> subject) {
		this.subject = subject;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	public Set<Integer> getMarks() {
		return marks;
	}

	public void setMarks(Set<Integer> marks) {
		this.marks = marks;
	}

	public Map<String, Integer> getSubmarks() {
		return submarks;
	}

	public void setSubmarks(Map<String, Integer> submarks) {
		this.submarks = submarks;
	}

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}

	@Override
	public String toString() {
		return "Practice2 [c=" + c + ", subject=" + subject + ", marks=" + marks + ", submarks=" + submarks + ", prop="
				+ prop + "]";
	}
	
	
}
