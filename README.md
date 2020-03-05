<b>UrlShortner</b>

The objective of this application is to provide a Short Url for a Long Url

<b>It provides the following functionalities :</b>
Shorten the Long URL 
Redirect to original URL when request short URL
Assumptions
It will give same Short url to Long url 

<b>Getting Started</b>

Prerequisites

Maven3.*  
Set Up Maven_HOME and give path in System Path.
Please refer below article

https://www.baeldung.com/install-maven-on-windows-linux-mac

Make sure Maven is working fine by typing mvn -v

Java 1.8+ 
Set JAVA_HOME and give path in System Path

Refer Below Article

https://www.baeldung.com/java-home-on-windows-7-8-10-mac-os-x-linux

Make sure Java is working fine by typing JAVA -VERSION
java -version

<b>How to Run the Application</b>
- Clone this repo https://github.com/pahari/UrlShortner

    git clone https://github.com/pahari/UrlShortner
- Go to UrlShortner folder

    cd UrlShortner
 - Build the Project, type below command
 
 
      mvn clean install
      
 - Then run the application by below command
 
    mvn spring-boot:run
    
 The Application will Start in port 8080

Open the below Url in WebBrowser.
http://localhost:8080/index.html


