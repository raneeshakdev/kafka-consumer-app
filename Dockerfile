FROM openjdk:11
WORKDIR /app
COPY target/kafka-consumer-0.0.1-SNAPSHOT.jar /app
EXPOSE 8302
CMD ["java" , "-jar" , "kafka-consumer-0.0.1-SNAPSHOT.jar"]