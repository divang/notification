package sf.pl.notification.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;

import sf.pl.notification.base.model.NotificationEvent;
import sf.pl.notification.streams.NotificationStreams;

@Service
public class NotificationService {

	private final static Logger LOGGER = LoggerFactory.getLogger(NotificationService.class);

	@Autowired
	private NotificationStreams notificationStreams;

	public void publish(final NotificationEvent notificationEvent) {
		LOGGER.info("Publishing to stream {} ", notificationEvent);
		MessageChannel messageChannel = notificationStreams.output();

		messageChannel.send(MessageBuilder.withPayload(notificationEvent)
				.setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON).build());
		LOGGER.info("Published to stream {} ", notificationEvent);
	}
}
