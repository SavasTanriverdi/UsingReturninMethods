public class Main {
    public static void main(String[] args) {
        int number = 5;
        int squareResult = square(number);
        System.out.println("The square of " + number + " is: " + squareResult);

        double circleRadius = 7.0;
        double areaResult = calculateCircleArea(circleRadius);
        System.out.println("The area of the circle with radius " + circleRadius + " is: " + areaResult);
    }
    // Method that calculates the square of an integer and returns the result
    public static int square(int number) {
        return number * number;
    }
    // Method that calculates the area of a circle given the radius and returns the result
    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }
}