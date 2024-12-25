FROM openjdk:17-jdk
EXPOSE 8083
ADD target/AzureDemo-0.0.1-SNAPSHOT.jar azuredemo.jar
ENTRYPOINT ["java","-jar","/azuredemo.jar"]