FROM openjdk:11.0-jre-stretch
MAINTAINER Abdelghani ROUSSI <roussi.abdelghani@gmail.com>

WORKDIR /usr/share/demo-k8s

ARG appDir=/usr/share/demo-k8s
ARG DEPENDENCY=target/dependency

COPY ${DEPENDENCY}/BOOT-INF/lib ${appDir}/lib
COPY ${DEPENDENCY}/META-INF ${appDir}/META-INF
COPY ${DEPENDENCY}/BOOT-INF/classes ${appDir}

EXPOSE 8081 5005

ENTRYPOINT ["java","-cp","com/aroussi/demo/*:lib/*:.","com.aroussi.demo.DemoApplication"]