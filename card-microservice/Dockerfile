FROM maven:latest

WORKDIR /app

COPY pom.xml .
COPY src ./src
COPY .mvn ./.mvn
COPY mvnw .
COPY mvnw.* .

RUN mvn clean package -DskipTests

CMD ["mvn", "spring-boot:run"]