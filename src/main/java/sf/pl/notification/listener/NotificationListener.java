package sf.pl.notification.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import sf.pl.notification.base.model.NotificationEvent;
import sf.pl.notification.streams.NotificationStreams;

@Component
public class NotificationListener {

	private static final Logger LOGGER = LoggerFactory.getLogger(NotificationListener.class);

	@StreamListener(NotificationStreams.INPUT)
	public void consume(@Payload NotificationEvent event) {
		LOGGER.info("Message consume: {}", event);
	}
}
