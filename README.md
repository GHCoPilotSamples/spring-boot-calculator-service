# Calculator Service

This is a simple calculator service implemented using Java 17 and the latest version of Spring Boot. It provides basic arithmetic operations such as addition, subtraction, multiplication, and division, as well as the ability to square a number and generate Fibonacci series.

## Project Structure

The project has the following structure:

```
calculator-service
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── calculator
│   │   │               ├── CalculatorServiceApplication.java
│   │   │               ├── controller
│   │   │               │   └── CalculatorController.java
│   │   │               └── service
│   │   │                   └── CalculatorService.java
│   │   └── resources
│   │       ├── application.properties
│   │       └── static
│   └── test
│       └── java
│           └── com
│               └── example
│                   └── calculator
│                       └── CalculatorServiceApplicationTests.java
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```

## Getting Started

To run the calculator service, follow these steps:

1. Clone the repository: `git clone https://github.com/your-username/calculator-service.git`
2. Navigate to the project directory: `cd calculator-service`
3. Build the project: `./mvnw clean install`
4. Run the application: `./mvnw spring-boot:run`

The calculator service will be accessible at `http://localhost:8080`.

## API Endpoints

The calculator service provides the following API endpoints:

- `POST /add`: Adds two numbers. Request body should contain the numbers to be added.
- `POST /subtract`: Subtracts two numbers. Request body should contain the numbers to be subtracted.
- `POST /multiply`: Multiplies two numbers. Request body should contain the numbers to be multiplied.
- `POST /divide`: Divides two numbers. Request body should contain the numbers to be divided.
- `POST /square`: Squares a number. Request body should contain the number to be squared.
- `GET /fibonacci/{n}`: Generates the Fibonacci series up to the specified number `n`.

## Examples

### Addition

Request:
```
POST /add
Content-Type: application/json

{
  "num1": 5,
  "num2": 3
}
```

Response:
```
{
  "result": 8
}
```

### Fibonacci Series

Request:
```
GET /fibonacci/8
```

Response:
```
{
  "series": [0, 1, 1, 2, 3, 5, 8, 13]
}
```

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
```

Please note that the license file (`LICENSE`) is not included in the file tree structure. You can create a new file named `LICENSE` in the project root directory and add the appropriate license text.