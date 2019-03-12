package sf.pl.notification.streams;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface NotificationStreams {

	String INPUT = "notify-input-stream-topic";
	String OUTPUT = "notify-output-stream-topic";

	@Input(INPUT)
	SubscribableChannel input();

	@Output(OUTPUT)
	MessageChannel output();
}
