FROM tomcat

 
COPY target/our-web-app.war /usr/local/tomcat/webapps/.
