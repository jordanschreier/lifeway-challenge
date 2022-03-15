# Lifeway Challenge
Java Code Challenge given by Lifeway Christian Resources

# Getting Started

1. Import this Gradle project into IntelliJ, and run the `bootRun` task under `lifewaychallenge:Tasks:application` in the Gradle task menu.
   1. You can alternatively run this project outside IntelliJ or any other IDE, if your environment is set up to do so, by opening a command window in this directory and running the command: `./gradlew bootRun`
2. Once running, visit the local Swagger page at [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html) (link is also conveniently placed in the bootRun console logs).
3. Under `word-count-controller` expand the `/wordCount` box.
4. Click `Try it out` and in the `Request body` section, you'll be able to input your JSON request, making sure that the `id` value is an integer wrapped in double quotes like this: `"id": "123"`
5. Click the big, blue `Execute` button, and you'll receive a count as a response.

# Additional Features
Since H2 is used here as an in-memory database, all records are reset once the app terminates.
You can access the H2 database console by going to [http://localhost:8080/h2-console](http://localhost:8080/h2-console) (link is also conveniently placed in the bootRun console logs). Login with the following info:
- Driver class: org.h2.Driver
- JDBC URL: jdbc:h2:mem:lifeway
- User Name: sa
- Password: password

Here, now you can run the following SQL to see all registered IDs:
> SELECT * FROM WORD_COUNT