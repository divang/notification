package sf.pl.notification.base.model;

public class NotificationEvent {

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "NotificationEvent [message=" + message + "]";
	}

}
