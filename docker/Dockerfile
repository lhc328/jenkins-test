FROM java:8
VOLUME /tmp
ADD jenkins-test-0.0.1-SNAPSHOT.jar /jenkinsTest.jar
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom","-jar", "-Xms256m", "-Xmx512m", "/jenkinsTest.jar"]
EXPOSE 8082