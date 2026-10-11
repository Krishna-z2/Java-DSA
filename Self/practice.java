import java.util.*;

public class practice{
    // 1. Employee Data
    /*
    public static void main(String[] args){
        String name = "Krishna Kumawat";
        String college = "JECRC University";
        int age = 21;

        System.out.println("Name : " + name);
        System.out.println("College Name : " + college);
        System.out.println("Age : " + age);
    }
    */

    // 2. Area & Perimeter of an Rectangle
    /*
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the Lenght of an Rectangle : ");
        int length = sc.nextInt();
        System.out.println("Enter the Width of an Rectangle : ");
        int width = sc.nextInt();

        int area = length * width;
        int perimeter = 2 * (length + width);

        System.out.println("Area of an Rectangle : "+area);
        System.out.println("Perimeter of an Rectangle : "+perimeter);
    }
    */

    // 3. Marks of 3 Subjects and their Average
    /*
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter 1st Subject Marks : ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd Subject Marks : ");
        int num2 = sc.nextInt();
        System.out.println("Enter 3rd Subject Marks : ");
        int num3 = sc.nextInt();

        int avg = (num1 + num2 + num3)/3;
        System.out.println("Avg. of 3 Subject Marks : "+avg);
    }
    */

    // 4. Employee Gross and Annual Salary
    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Name : ");
        String name = sc.nextLine();
        System.out.println("Enter Your Salary : ");
        int salary = sc.nextInt();
        double hra = (salary * 20)/100;
        double da = (salary * 10)/100;
        double gs = salary + hra + da;
        double as = (gs * 12);
        System.out.println("Name : "+name);
        System.out.println("Salary : "+salary);
        System.out.println("Gross Salary : "+gs);
        System.out.println("Annual Salary : "+as);
    }
    */

    // 5. Total Seconds into Hours, Minutes and Seconds
    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Total Seconds : ");
        int input_sec = sc.nextInt();
        int hours = (input_sec / 3600);
        int minutes = ((input_sec % 3600) / 60);
        int seconds = ((input_sec % 3600) % 60);
        System.out.println("Hours : "+hours);
        System.out.println("Minutes : "+minutes);
        System.out.println("Seconds : "+seconds);
    }
    */

    // 6. Celsius to Fahrenheit
    // Important : printf() is useful when you want to control the number of decimal places in Java output.
    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Temprature in Celsius : ");
        float celsius = sc.nextFloat();
        double Fahrenheit = (celsius * (9.0/5.0)) + 32;
        System.out.printf("Temprature in Fahrenheit : %.2f%n ",Fahrenheit);
    }
    */
}