
# ctg-mvp #

## Dependencies ##
* JDK 17 (I have it on good authority that Amazon Corretto-17.0.6.10.1 works just fine...)
* Maven 3+

## Local Dev guide ##
This should open in your IDE of choice.. if you use Spring Tools Plugins then you get some fancy IDE start/stop features.
If you want to start/stop this thing without some sort of Spring enabled IDE then you've got a couple of steps...

1. Open termnial\cmd\bash\whatever at the root of the ctg-mvp directory 
2. `mvn clean package`
3. `java -jar mvp-service-0.0.1-SNAPSHOT.jar`

The app should boot and listen on port 8080. Have fun!


## Helpful Links ##
* localhost:8080/swagger-ui.html - Generated Java docs
* localhost:8080/h2-console - DB console
  * user: sa
  * pass: (No password)
* localhost:8080/actuator/health

## Some notes of interest.. ##
* This app runs with spring-boot-devtools. Its primary function in our world atm is to reload classes on edit.. 'hot-deploy' code. _SOMETIMES_ this can really screw with you and isn't worth the cost. If this is the case.. simply remove the dependency from the pom and restart the app. I'd recommend this if 1+1 != 2
