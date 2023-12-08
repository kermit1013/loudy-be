FROM maven:3.8.4 AS build
WORKDIR /app
COPY . /app
RUN mvn clean package -DskipTests

# 第二階段: 使用 OpenJDK 運行
FROM openjdk:11
WORKDIR /app
# 複製第一階段構建的 JAR 文件到第二階段
COPY --from=build /app/target/collaborative-web-be-0.0.1-SNAPSHOT.jar collaborative-web-be-0.0.1-SNAPSHOT.jar
EXPOSE 8080-8090
ENTRYPOINT ["java", "-jar", "collaborative-web-be-0.0.1-SNAPSHOT.jar"]