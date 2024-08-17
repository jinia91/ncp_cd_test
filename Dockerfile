FROM openjdk:17-jdk
VOLUME /tmp
ARG JAR_FILE=build/libs/cd_test.jar
COPY ${JAR_FILE} cd_test.jar
ENTRYPOINT ["java","-jar","/cd_test.jar"]