FROM java:8
ADD ./target/notification-*-jar-with-dependencies.jar /app/notification.jar

ENTRYPOINT ["java $JAVA_OPTS -jar /app/notification.jar"]