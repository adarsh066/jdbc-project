# JDBC Project

A simple JDBC project demonstrating CRUD operations using MySQL.

## Description

This project demonstrates basic CRUD operations using JDBC and MySQL. It includes a utility class for managing database connections to reduce code redundancy.

## How to Use

1. **Clone the repository**:
    ```bash
    git clone https://github.com/your-username/jdbc-project.git
    cd jdbc-project
    ```

2. **Set up your MySQL database**:
    - Create a database named `flynautsaas`.
    - Create a table named `tests` with the following structure:
        ```sql
        CREATE TABLE tests (
            id INT AUTO_INCREMENT PRIMARY KEY,
            name VARCHAR(255) NOT NULL,
            short_description VARCHAR(255)
        );
        ```
    - Update the connection details in `DatabaseUtil.java` if necessary.

3. **Add the MySQL Connector/J JAR file**:
    - Download the MySQL Connector/J from [here](https://dev.mysql.com/downloads/connector/j/).
    - Place the JAR file in the `lib/` directory.

4. **Compile and run the Java classes**:
    - Compile the classes:
        ```bash
        javac -cp "lib/mysql-connector-java-<version>.jar" src/main/java/in/jdbc/com/*.java
        ```
    - Run the classes to perform CRUD operations:
        ```bash
        java -cp "lib/mysql-connector-java-<8.0.33>.jar:src/main/java" in.jdbc.com.Insert
        java -cp "lib/mysql-connector-java-<8.0.33>.jar:src/main/java" in.jdbc.com.Update
        java -cp "lib/mysql-connector-java-<8.0.33>.jar:src/main/java" in.jdbc.com.Delete
        java -cp "lib/mysql-connector-java-<8.0.33>.jar:src/main/java" in.jdbc.com.Select
        ```

## Notes

- Ensure that the MySQL server is running and accessible.
- Adjust the database connection details in `DatabaseUtil.java` if your setup differs.
