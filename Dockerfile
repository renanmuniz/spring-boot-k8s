FROM openjdk:17
VOLUME /tmp
EXPOSE 8080
ADD target/spring-k8s-0.0.1-SNAPSHOT.jar my-app.jar
ENTRYPOINT ["java", "-jar", "/my-app.jar"]
