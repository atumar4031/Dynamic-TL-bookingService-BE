FROM openjdk:17-alpine
ADD target/bus-booking.jar bus-booking.jar
ENTRYPOINT ["java", "-jar", "/bus-booking.jar"]