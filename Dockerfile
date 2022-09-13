FROM leexiaoming/openjdk-curl:8u171-jre-alpine
CMD java ${JAVA_OPTS} -jar cell-test-1.0-SNAPSHOT.jar
#HEALTHCHECK --start-period=30s --interval=5s CMD curl -f http://localhost:8080/actuator/health || exit 1
COPY target/cell-test-1.0-SNAPSHOT.jar .