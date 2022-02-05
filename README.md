# Send Sms with Twilio 

<h1 align='center'>
  📱 Send Sms with Twilio  📱
  
</h1>
<h3 align='center'>
  
  A simple sms sending application was designed using Twilio.
  
<img src = "https://media2.giphy.com/media/QssGEmpkyEOhBCb7e1/giphy.gif?cid=ecf05e47a0n3gi1bfqntqmob8g9aid1oyj2wr3ds3mg700bl&rid=giphy.gif" width = 32px>
 
</h3>


* Download code zip.
* Open Application.yml and change it your info.You can sign up and get user information from this [link](https://www.twilio.com/try-twilio). 
```yml
twilio:
  account_sid: #your account sid
  auth_token: #your auth token
  trial_number: # your trial number
```
* Run the app.
* Run postman app,  change request type `POST`, add `localhost:8080/smsApp/send`
* Postman body raw with Json type. 
#### 
    { "phoneNumber": "Number to send sms.",
    "message": "Message to be sent." }
* Click to send. 
* İf you get this error.``This number can send messages only to verified numbers`` please visit [this](https://www.twilio.com/docs/api/errors/21608) website. 

<h3 align='center'>
  
<img src = "https://media2.giphy.com/media/QssGEmpkyEOhBCb7e1/giphy.gif?cid=ecf05e47a0n3gi1bfqntqmob8g9aid1oyj2wr3ds3mg700bl&rid=giphy.gif" width = 32px>
 
</h3>

## ⚡ Frameworks
![SpringBoot](https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![Maven](https://img.shields.io/badge/apache_maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)


### 📝Documentation
* [Twilio](https://www.twilio.com/docs/sms/quickstart)
* [Java Documentation](https://docs.oracle.com/en/java/)
* [Maven Documentation](https://maven.apache.org/)
* [Spring](https://spring.io/)


## 💻 Code Language
![](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)


 
