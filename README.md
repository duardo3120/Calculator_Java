# Simple Calculator

This is a simple command-line calculator implemented in Java. It supports basic arithmetic operations: addition, subtraction, multiplication, and division.

## Features

- Addition
- Subtraction
- Multiplication
- Division

## Requirements

- Java Development Kit (JDK) 8 or higher

## Getting Started

Follow these instructions to get a copy of the project up and running on your local machine.

### Prerequisites

- Java Development Kit (JDK) 8 or higher installed on your machine.
- An IDE or text editor of your choice to view and edit the code (e.g., IntelliJ IDEA, Eclipse, VSCode).

### Installation

1. **Clone the repository:**

    ```bash
    git clone https://github.com/your-username/simple-calculator.git
    ```

2. **Navigate to the project directory:**

    ```bash
    cd simple-calculator
    ```

3. **Compile the Java file:**

    ```bash
    javac calculator.java
    ```

4. **Run the program:**

    ```bash
    java calculator
    ```

## Usage

Upon running the program, you will be prompted to select an operation and enter two numbers.

1. **Select an operation:**

    ```
    1 Adição, 2 Subtração, 3 Multiplicação ou 4 Divisão
    Digite a operação desejada:
    ```

2. **Enter the first number:**

    ```
    Digite o primeiro número:
    ```

3. **Enter the second number:**

    ```
    Digite o segundo número:
    ```

4. **View the result:**

    ```
    O resultado da conta é: [resultado]
    ```

## Code Structure

- `calculator.java`: Contains the main class `calculator` with methods for reading input, performing arithmetic operations, and displaying results.

## Methods

- The `main` method handles user input and performs the selected operation:
    - Addition: `num1 + num2`
    - Subtraction: `num1 - num2`
    - Multiplication: `num1 * num2`
    - Division: `num1 / num2` (with a check to prevent division by zero)
