# cloudwatch-demo

An application to demonstrate writing logs from Spring Boot application to AWS CloudWatch

## 1. Build the application
- Check out the source and run `mvn install` in the project root

## 2. Install to Beanstalk
- Open the Beanstalk service from the AWS Console 
- Create a new Java application using the jar file created under /target directory

## 3. Configure the application
- Open Configuration and set an Environment Property SERVER_PORT = 5000
- Configure CloudWatch logging by selecting 'Log streaming enabled'

## 4. Generate log events
- Open http://[APP NAME HERE].eu-west-1.elasticbeanstalk.com/swagger-ui.html and post events using the Swagger UI

## 5. Browse logs
- Open CloudWatch from AWS Console -> Logs
