package practice;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class SetterInjectionPara {
		 int id;
		 String name;
		 String address;
		 List<Integer> marks;
		 Set<String> subject;
		 Map<String, String> students;
		 SetterInejcetionAddress myAddresss;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		
		
		public List<Integer> getMarks() {
			return marks;
		}
		public void setMarks(List<Integer> marks) {
			this.marks = marks;
		}
		
		public Set<String> getSubject() {
			return subject;
		}
		public void setSubject(Set<String> subject) {
			this.subject = subject;
		}
		public Map<String, String> getStudents() {
			return students;
		}
		public void setStudents(Map<String, String> students) {
			this.students = students;
		}
		public SetterInjectionPara() {
			super();
		}
		public SetterInejcetionAddress getMyAddresss() {
			return myAddresss;
		}
		public void setMyAddresss(SetterInejcetionAddress myAddresss) {
			this.myAddresss = myAddresss;
		}
		
}
