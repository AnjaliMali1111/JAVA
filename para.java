// Student class with default, parameterized, and copy constructors
class Student {
    private String name;
    private int age;
    private int rollNo;

    // Default constructor (initializes with default values)
    public Student() {
        this.name = "Unknown";
        this.age = 0;
        this.rollNo = 0;
    }

    // Parameterized constructor (initializes with given values)
    public Student(String name, int age, int rollNo) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }

    // Copy constructor (copies values from another Student object)
    public Student(Student other) {
        this.name = other.name;
        this.age = other.age;
        this.rollNo = other.rollNo;
    }

    // Method to accept student information
    public void acceptInfo(String name, int age, int rollNo) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("--------------------------------");
    }
}

// Main class to test the Student class
public class para {
    public static void main(String[] args) {
        // Using default constructor
        Student student1 = new Student();
        System.out.println("Using Default Constructor:");
        student1.displayInfo();  // Displays default values

        // Using parameterized constructor
        Student student2 = new Student("John Doe", 20, 101);
        System.out.println("Using Parameterized Constructor:");
        student2.displayInfo();  // Displays the given values

        // Using copy constructor
        Student student3 = new Student(student2);  // Copying student2's data
        System.out.println("Using Copy Constructor:");
        student3.displayInfo();  // Displays copied values

        // Using acceptInfo() method to input student details
        Student student4 = new Student();
        student4.acceptInfo("Alice Smith", 22, 102);
        System.out.println("Using acceptInfo Method:");
        student4.displayInfo();  // Displays entered details
    }
}

