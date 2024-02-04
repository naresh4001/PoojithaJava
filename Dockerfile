FROM openjdk:17-oracle
WORKDIR /app
COPY . /app
RUN javac MainClass.java
RUN javac sample.java
CMD ["java","MainClass"]
