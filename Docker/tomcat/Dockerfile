FROM tomcat:9-jre8-alpine
LABEL Anand Verma

ADD /target/fsp.war /usr/local/tomcat/webapps/fsp.war
RUN sh -c 'touch /usr/local/tomcat/webapps/fsp.war'

ENV JPDA_ADDRESS="8000"
ENV JPDA_TRANSPORT="dt_socket"

EXPOSE 8080 8000
ENTRYPOINT ["catalina.sh", "jpda", "run"]