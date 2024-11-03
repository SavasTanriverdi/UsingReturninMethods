JavaReturnExample

This project demonstrates the use of the return statement in Java methods. The return statement is essential for returning results from a method to the place where it was called. This example showcases a method that calculates the square of a number using return and another method that calculates the area of a circle with a given radius.
Project Structure

    JavaReturnExample.java: Contains the main method and two example methods square and calculateCircleArea.

Code Overview
Methods

    square(int number)
        Description: Calculates the square of an integer and returns the result.
        Parameters: int number - the integer to be squared.
        Returns: int - the square of the input number.
        Example: square(5) will return 25.

    calculateCircleArea(double radius)
        Description: Calculates the area of a circle given the radius.
        Parameters: double radius - the radius of the circle.
        Returns: double - the area of the circle.
        Example: calculateCircleArea(7.0) will return approximately 153.938.

Usage

Compile and run the program with the following commands:

    javac JavaReturnExample.java
    java JavaReturnExample
Expected output:
    
    The square of 5 is: 25
    The area of the circle with radius 7.0 is: 153.93804002589985
Key Concepts

    Return Statement: return is used to exit from a method and optionally return a value to the caller.
    Method Reusability: Methods like square and calculateCircleArea can be reused with different inputs, making code modular and efficient.

Author

This project is a simple Java example to demonstrate method returns for educational purposes.
