# Lucent-Innovation-Interview
Practical of Lucent Innovation Interview Process.

### Installation

The project is created with Maven, so you just need to import it to your IDE and build the project to resolve the dependencies

### Database configuration

Create a MySQL database with the name lucentinterview and add the credentials to /resources/application.properties.
The default ones are :
```
server.port=2020

#JSP
spring.mvc.view.prefix: /WEB-INF/jsp/
spring.mvc.view.suffix: .jsp

#MySQL
spring.datasource.url=jdbc:mysql://localhost:3306/lucentinterview?useSSL=false
spring.datasource.username=umang
spring.datasource.password=umang
spring.jpa.hibernate.ddl-auto=update

```
Run the project through the IDE and head out to http://localhost:2020/

## TASK 1

Expose API for Customer Details store into the database (1 hour)
Customer Details Fields
1. Name
2. Gender
3. Email Address
4. Mobile No
5. Address Line 1
6. Address Line 2
7. State
8. City
9. ZipCode
10. Country

● Create a new customer
● Update customer details
● Deleting customer
● Get all customer details

### Create a new customer

*Mapping* : POST Mapping.

*Url* : http://localhost:2020/customer/add

```json
{
"name":"Umang",
"gender":"Male",
"emailAddress":"Umang@gmail.com",
"mobileNo":"09090909909",
"address1":"Address a ",
"address2":"Address b",
"city":"AHMEDABAD",
"state":"GUJARAT",
"zipCode":"ASAy566",
"country":"INDIA"
}

```

![alt text](https://github.com/umang4846/Lucient-Innovation-Interview/blob/master/Lucient-Innovation-Interview/addCustomerREST.png)

### Update a customer details

*Mapping* : PUT Mapping.

*Url* : http://localhost:2020/customer/update/{customerId}

```json
{
"name":"UPDATED NAME",
"gender":"Male",
"emailAddress":"Umang@gmail.com",
"mobileNo":"09090909909",
"address1":"Address a ",
"address2":"Address b",
"city":"AHMEDABAD",
"state":"GUJARAT",
"zipCode":"ASAy566",
"country":"INDIA"
}

```

![alt text](https://github.com/umang4846/Lucient-Innovation-Interview/blob/master/Lucient-Innovation-Interview/updateCustomerREST.png)

### Deleting customer

*Mapping* : DELETE Mapping.

*Url* : http://localhost:2020/customer/delete/{customerId}

![alt text](https://github.com/umang4846/Lucient-Innovation-Interview/blob/master/Lucient-Innovation-Interview/deleteCustomerREST.png)

### Get all customer details

*Mapping* : GET Mapping.

*Url* : http://localhost:2020/customer/getAll

![alt text](https://github.com/umang4846/Lucient-Innovation-Interview/blob/master/Lucient-Innovation-Interview/getAllCustomerREST.png)



## TASK 2

Implement API to perform the following operations. 

● Create a Customer Form + using above API
● Update Customer details using Form + using above API
● Display customer List into the table using above API

Note :
 Open Task 2 all urls in Web browser

### Create a Customer Form + using above API

*Url* : http://localhost:2020/registration

![alt text](https://github.com/umang4846/Lucient-Innovation-Interview/blob/master/Lucient-Innovation-Interview/registerCustomerUI.png)

