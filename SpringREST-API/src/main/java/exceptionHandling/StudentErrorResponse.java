package exceptionHandling;

public class StudentErrorResponse {
	int status;
	String message;
	long timeStamp;
	public StudentErrorResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public long getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(long l) {
		this.timeStamp = l;
	}
	
	
}
