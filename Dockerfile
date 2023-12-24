FROM openjdk:11
EXPOSE 8080
ADD target/jenkins-hello-world.jar jenkins-hello-world.jar
ENTRYPOINT ["java","-jar","/jenkins-hello-world.jar"]