FROM java:8
COPY ./target/notification-*.jar /app/notification.jar
CMD [ "java", "-jar", "/app/notification.jar" ]