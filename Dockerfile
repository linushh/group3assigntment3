FROM eclipse-temurin:17
COPY ./build/libs/group3assignment3-0.0.1-SNAPSHOT.jar /usr/src/group3assignment3/
WORKDIR /usr/src/group3assignment3
CMD ["java", "-jar", "group3assignment3-0.0.1-SNAPSHOT.jar"]
