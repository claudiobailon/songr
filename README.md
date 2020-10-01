# Songr

## Running the app
Run the app in intelliJ to start app. In your browser, go to localhost:8080 to see homepage.<br>
At localhost:8080/hello you will get a greeting<br>
At localhost:8080/capitalize/<your input> you will get your input returned in all caps<br>
At localhost:8080/albums you will see a table with some albums<br>

Lab 12 Update: in the application.properties file found in the resources folder, you'll have to add your own username and password where I have mine.
In my file:<br>
`spring.datasource.url=jdbc:postgresql://localhost:5432/songr?username=claudio&password=hello`<br>
`spring.datasource.username=claudio`<br>
`sprint.datasource.password=hello`<br>
`spring.jpa.hibernate.ddl-auto=update`<br>
Also, in build.gradle, you'll have to add the following line of code under dependencies.<br> 
`	compile 'org.springframework.boot:spring-boot-starter-data-jpa'`<br>
` 	implementation('org.springframework.boot:spring-boot-starter-thymeleaf')`<br>
`	implementation('org.springframework.boot:spring-boot-starter-web')`<br>
` 	runtimeOnly('org.postgresql:postgresql')`<br>
` 	testImplementation('org.springframework.boot:spring-boot-starter-test')`<br>
Filling out the form in the /albums route will add the input to the albums being shown as well as to the database.
