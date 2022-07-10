FROM openjdk:8
EXPOSE 8082
ADD target/DailySharePrice-0.0.1-SNAPSHOT.jar DailySharePrice-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/DailySharePrice-0.0.1-SNAPSHOT.jar"]