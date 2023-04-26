#
#
FROM maven:3.6.0-jdk-11-slim AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package

#
# Package stage
#
FROM openjdk:11-jre-slim
COPY --from=build /home/app/target/*.jar /home/app/app.jar
ENV JAVA_OPTS=" "
EXPOSE 8080 9096
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -Dcom.sun.management.jmxremote.port=9096 -Dcom.sun.management.jmxremote.rmi.port=9096 -Dcom.sun.management.jmxremote.ssl=false -Dcom.sun.management.jmxremote.authenticate=false -jar /home/app/app.jar"]
