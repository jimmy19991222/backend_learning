## Intro

### What is MyBatis

* a persistent layer, including SQL Maps and Data Access Objects (DAOs)
* avoid almost all JDBC code

### How to get Mybatis

* maven

  ```Java
  <!-- https://mvnrepository.com/artifact/org.mybatis/mybatis -->
  <dependency>
      <groupId>org.mybatis</groupId>
      <artifactId>mybatis</artifactId>
      <version>3.5.6</version>
  </dependency>
  ```

  

## Consistence

### What is Data Persistence

* Data Persistence is a mechanism for converting program data between **persistent** and **transient** states.
* **Persistent state:** Database(JDBC), io files persistence.
* **transient states:** ROM: Power-off means lost of data.

### Why we need Persistence

* Some data should not be lost.
* ROM is too expensive.



## Consistent layer

DAO layer, Service layer, Controller layer ...

* code implement of consistence.
* layer is highly independent.

