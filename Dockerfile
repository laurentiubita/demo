FROM openjdk:17-jdk-slim
COPY target/demo-0.1.jar demo-0.1.jar
ENTRYPOINT java -Ddocker.container.id=$HOSTNAME -jar /demo-0.1.jar