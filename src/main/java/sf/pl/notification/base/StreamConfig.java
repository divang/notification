package sf.pl.notification.base;

import org.springframework.cloud.stream.annotation.EnableBinding;

import sf.pl.notification.lstreams.NotificationStreams;

@EnableBinding(NotificationStreams.class)
public class StreamConfig {

}
