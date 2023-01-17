# AppArt
Unpload file to data base and show the data, spring boot

The application drop the database schema and created it again every time we run the application 
I have set the port from default 8080 to 8072

Before we run the app we have to put again the values of (spring.datasource.username and spring.datasource.password) in the application.properties file

1. Run http://localhost:8072/feedCovidWithData and http://localhost:8072/feedPoputlationWithData to feed the data base with the 2 csv files
2. Run http://localhost:8072/covid and http://localhost:8072/population to show the data of the data base in the screen
