# All comment lines start with #

# Specify base image
FROM tomcat:9-jre8-alpine

# Set Author Reference
LABEL Anand Verma

# Copy the WAR file to the container
ADD /target/fsp.war /usr/local/tomcat/webapps/fsp.war

# Update the WAR file timestamp.
RUN sh -c 'touch /usr/local/tomcat/webapps/fsp.war'

# Setup debugging options
ENV JPDA_ADDRESS="8000"
ENV JPDA_TRANSPORT="dt_socket"

#Expose the container port direct and debug ports. Uncomment below line to expose the port.
EXPOSE 8080
EXPOSE 8000


#Restart the tomcat..
ENTRYPOINT ["catalina.sh", "jpda", "run"]