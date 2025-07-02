FROM maven:3.9.10-amazoncorretto-21-debian

WORKDIR /app

COPY pom.xml .
COPY src ./src
COPY .mvn ./.mvn
COPY mvnw .
COPY mvnw.* .

RUN mvn clean package -DskipTests

CMD ["mvn", "spring-boot:run"]