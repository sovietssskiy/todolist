#FROM openjdk:17
##EXPOSE 80
#ADD target/todolist-0.0.1-SNAPSHOT.jar app.jar
#ENTRYPOINT ["java", "-jar", "app.jar"]

#FROM maven:3.6.3-openjdk-17
#COPY ./ ./
#RUN mvn clean package -Dmaven.test.skip=true
#CMD ["java", "-jar", "target/todolist-0.0.1-SNAPSHOT.jar"]


FROM maven:3.6.3-openjdk-17
COPY ./ ./
RUN mvn clean package -Dmaven.test.skip=true
CMD ["java", "-jar", "target/todolist-0.0.1-SNAPSHOT.jar"]