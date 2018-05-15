<img align="center" src="https://github.com/speedment/speedment-resources/blob/master/src/main/resources/wiki/frontpage/Duke-Spire.png?raw=true." alt="Spire the Hare" title="Spire" width="900px">

Java Stream ORM
====================================================

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.speedment/runtime/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.speedment/runtime)
[![Javadocs](http://www.javadoc.io/badge/com.speedment/runtime-deploy.svg)](http://www.javadoc.io/doc/com.speedment/runtime-deploy)
[![Build Status](https://travis-ci.org/speedment/speedment.svg?branch=develop-3.0)](https://travis-ci.org/speedment/speedment)
[![Hex.pm](https://img.shields.io/hexpm/l/plug.svg?maxAge=2592000)](https://raw.githubusercontent.com/speedment/speedment/master/LICENSE)
[![Join the chat at https://gitter.im/speedment/speedment](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/speedment/speedment?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)

Speedment is an open source Java Stream ORM toolkit and runtime. The toolkit analyzes the metadata of an existing SQL database and automatically creates a Java representation of the data model. This powerful ORM enables you to create scalable and efficient Java applications using **standard Java** streams with no need to type SQL or use any new API. 

Speedment was originally developed by researchers and engineers based in Palo Alto with the purpose to simplify and streamline the development of Java database applications by leveraging the Java 8 Stream API. 

Speedment is licensed under the business-friendly Apache 2 license. Contribution from users is encouraged. Please feel free to request new features, suggest improvements and file bug reports. Read more about contributing [here](https://github.com/speedment/speedment/blob/master/CONTRIBUTING.md). 

<img src="https://github.com/speedment/speedment-resources/blob/master/src/main/resources/wiki/frontpage/Spire-Quick-Start.png?raw=true" alt="Spire the Hare" title="Spire" align="right" width="200px" />

## Quick Start

Assuming you have Maven installed and a relational database available, you can start using Speedment in a minute:

* [Start a New Speedment Maven Project](https://github.com/speedment/speedment/wiki/Start-a-New-Speedment-Maven-Project)
* [Connect to Your Database](https://github.com/speedment/speedment/wiki/Connect-to-Your-Database)

## Expressing SQL as Java 8 Streams

There is a remarkable resemblance between Java streams and SQL as summarized in the simplified table. This means there is no need for manually writing SQL-queries any more. You can remain in a pure Java world!

<img align="left" src="https://github.com/speedment/speedment-resources/blob/master/src/main/resources/wiki/frontpage/SQL-Stream.png?raw=true." alt="Streams to SQL" width="400px">

#### Example
Search in a film database for films with a length greater than 120 minutes:
```java
// Searches are optimized in the background!
Optional<Film> longFilm = films.stream()
    .filter(Film.LENGTH.greaterThan(120))
    .findAny();
``` 

Results in the following SQL query:
```sql
SELECT 
    `film_id`,`title`,`description`,`release_year`,
    `language_id`,`original_language_id`,`rental_duration`,`rental_rate`,
    `length`,`replacement_cost`,`rating`,`special_features`,
    `last_update` 
FROM 
     `sakila`.`film
WHERE
    (`length` > 120)
```


## Resources 

### Documentation 
You can read the online Speedment User Guide [here](https://speedment.github.io/speedment-doc/introduction.html).

### JavaDoc
The latest online JavaDocs are available [here](http://www.javadoc.io/doc/com.speedment/runtime-deploy/3.1.0). 

### Examples 
There are a number of examples in the [example-parent folder](https://github.com/speedment/speedment/tree/master/example-parent) as well as in the User Guide. 

### Tutorials
The tutorials are divided into three sections. The basics are covered in the first section without any expected prior knowledge of Speedment. This builds a foundation of knowledge needed to fully benefit from the following tutorials.

#### Basics
* [Tutorial 1 - Hello Speedment](https://github.com/speedment/speedment/wiki/Tutorial:-Hello-Speedment)
* [Tutorial 2 - A First Stream from Speedment](https://github.com/speedment/speedment/wiki/Tutorial:-A-First-Stream-from-Speedment)

#### Sample applications
* [Tutorial 3 - Speedment Spring Boot Integration; REST assured - it is easy](https://github.com/speedment/speedment/wiki/Tutorial:-Speedment-Spring-Boot-Integration)
* [Tutorial 4 - Speedment filters based on Json Web Tokens](https://github.com/speedment/speedment/wiki/Tutorial:-Speedment-Stream-Filters-Using-JWT-Data)
* [Tutorial 5 - Build a Social Network](https://github.com/speedment/speedment/wiki/Tutorial:-Build-a-Social-Network)
* [Tutorial 6 - Log errors in a database](https://github.com/speedment/speedment/wiki/Tutorial:-Log-errors-in-a-database)
* [Tutorial 7 - Use Speedment with Java EE](https://github.com/speedment/speedment/wiki/Tutorial:-Use-Speedment-with-Java-EE)
* [Tutorial 8 - Create Event Sourced Systems](https://github.com/speedment/speedment/wiki/Tutorial:-Create-an-Event-Sourced-System)

#### Extending Speedment
* [Tutorial 9 - Writing your own extensions](https://github.com/speedment/speedment/wiki/Tutorial:-Writing-your-own-extensions)
* [Tutorial 10 - Plug-in a Custom TypeMapper](https://github.com/speedment/speedment/wiki/Tutorial:-Plug-in-a-Custom-TypeMapper)

## Features

### View Database Tables as Standard Java Streams
* **Pure Java** - Stream API instead of SQL eliminates the need of a query language 
* **Dynamic Joins** - Ability to perform joins as Java streams on the application side
* **Parallel Streams** - Workload can automatically be divided over several threads

### Short and Concise Type Safe Code 
* **Code Generation** - Automatic Java representation of the latest state of your database eliminates boilerplate code and the need of manually writing Java Entity classes while minimizing the risk for bugs. 
* **Null Protection** - Minimizes the risk involved with database null values by wrapping to Java Optionals 
* **Enum Integration** - Mapping of String columns to Java Enums increases memory efficiency and type safety

### Lazy Evaluation for Increased Performance
* **Streams are Lazy** - Content from the database is pulled as elements are needed and consumed 
* **Pipeline Introspection** - Optimized performance by short circuiting of stream operations

## Requirements
Speedment requires `Java 8` or later. Make sure your IDE is configured to use JDK 8 (version 1.8.0_40 or newer).

Speedment Open Source comes with support for the following databases out-of-the-box:
* MySQL
* MariaDB
* PostgreSQL

For Enterprise database connectors see [www.speedment.com](www.speedment.com/pricing). 

## Need help? 
If you need assistance or have questions of any sort, don't hesitate to reach out to the Speedment developers and other community members via [the Gitter chatroom](https://gitter.im/speedment/speedment). 
 
## Contributing 
Since Speedment is an open source project, pull requests and improvement suggestions from the community are gladly accepted. Read more [here](https://github.com/speedment/speedment/blob/master/CONTRIBUTING.md) on how to contribute to Speedment.

## Licenses
### Speedment Open Source 
This site covers the **Speedment Open Source** project available under the 
[Apache 2 license](http://www.apache.org/licenses/LICENSE-2.0). 

### Speedment Enterprise
The enterprise product with support for commercial 
databases (i.e. Oracle, MS SQL Server, DB2, AS400) and in-JVM-memory acceleration can be found at 
[www.speedment.com](http://speedment.com/).

## Copyright

Copyright (c) 2014-2018, Speedment, Inc. All Rights Reserved.
Visit [www.speedment.com](http://www.speedment.com/) for more info.

[![Analytics](https://ga-beacon.appspot.com/UA-64937309-1/speedment/main)](https://github.com/igrigorik/ga-beacon)

[![Beacon](http://stat.speedment.com:8081/Beacon?site=GitHub&path=main)](https://some-site.com)

[Github activity visualized](https://www.youtube.com/watch?v=Rmc_3lLZQpM)
