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

    // 7. Movie Ticket Price:-
    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age : ");
        int age = sc.nextInt();

        if(age>=0 && age<=5){
            System.out.println("Free Ticket");
        }
        else if(age>=6 && age<=17){
            System.out.println("Rupees 100 Ticket");
        }
        else if(age>=18 && age<=59){
            System.out.println("Rupees 200 Ticket");
        }
        else if(age>=60){
            System.out.println("Rupes 120 Ticket");
        }
        else{
            System.out.println("Invalid Age");
        }
    }
    */

    // 8. Scholarship Eligibility
    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Marks : ");
        int marks = sc.nextInt();
        System.out.println("Enter the Attendance : ");
        float attendance = sc.nextFloat();
        System.out.println("Enter the Annual Income : ");
        long income = sc.nextLong();

        if((marks>=85 && marks<=100) && (attendance>=75 && attendance<=100) && (income<=300000 && income>=0)){
            System.out.println("Eligible for Scholarship");
        }
        else if((marks<0 || marks>100) || (attendance<0 || attendance>100) || income<0){
            System.out.println("Invalid inputs");
        }
        else{
            System.out.println("Not Eligible");
        }
    }
    */

    // 9. Leap Year Check
    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year : ");
        int year = sc.nextInt(); 

        if((+year%4==0 && +year%100!=0) || (+year%400==0)){
            System.out.println("Leap Year!");
        }
        else{
            System.out.println("Not a Leap Year!");
        }
    }
    */
}