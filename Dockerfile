FROM openjdk:17-jdk-alpine
VOLUME /tmp
ADD target/DevOpsAssignment-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]