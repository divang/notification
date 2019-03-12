package sf.pl.notification.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import sf.pl.notification.base.model.NotificationEvent;
import sf.pl.notification.listener.NotificationService;

@RestController
public class NotificationController {

	private final static Logger LOGGER = LoggerFactory.getLogger(NotificationController.class);

	@Autowired
	private NotificationService notificationService;

	@GetMapping("/notify")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public void notify(@RequestParam("message") String message) {
		LOGGER.info("notify REST API called with message: {}", message);
		NotificationEvent notificationEvent = new NotificationEvent();
		notificationEvent.setMessage(message);
		notificationService.publish(notificationEvent);
		LOGGER.info("REST call finished");
	}

}
