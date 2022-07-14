FROM openjdk:8-jdk-alpine #베이스 이미지 파일
COPY target/spring-boot-test-0.0.1-SNAPSHOT.jar app.jar #컨테이너 내부로 파일 복사
ENTRYPOINT ["java","-jar","/app.jar"] #컨테이너 생성되면서 실행