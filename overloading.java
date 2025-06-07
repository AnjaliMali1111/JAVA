// ComplexNumber class to represent complex numbers
class ComplexNumber {
    private double real;
    private double imaginary;

    // Default constructor (initializes the complex number to 0 + 0i)
    public ComplexNumber() {
        this.real = 0;
        this.imaginary = 0;
    }

    // Parameterized constructor (initializes with given real and imaginary parts)
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Method to add two complex numbers (mimicking operator overloading)
    public ComplexNumber add(ComplexNumber other) {
        double resultReal = this.real + other.real;
        double resultImaginary = this.imaginary + other.imaginary;
        return new ComplexNumber(resultReal, resultImaginary);
    }

    // Method to display complex number in the form "a + bi"
    public void display() {
        if (imaginary >= 0) {
            System.out.println(real + " + " + imaginary + "i");
        } else {
            System.out.println(real + " - " + Math.abs(imaginary) + "i");
        }
    }
}

// Main class to test ComplexNumber functionality
public class overloading {
    public static void main(String[] args) {
        // Create complex numbers using parameterized constructors
        ComplexNumber num1 = new ComplexNumber(3, 2);  // 3 + 2i
        ComplexNumber num2 = new ComplexNumber(1, 7);  // 1 + 7i

        // Display the complex numbers
        System.out.print("First Complex Number: ");
        num1.display();
        System.out.print("Second Complex Number: ");
        num2.display();

        // Add the two complex numbers
        ComplexNumber sum = num1.add(num2);
        System.out.print("Sum of the Complex Numbers: ");
        sum.display();
    }
}
