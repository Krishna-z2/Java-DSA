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
        sc.close();
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
        sc.close();
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
        sc.close();
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
        sc.close();
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
        sc.close();
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
        sc.close();
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
        sc.close();
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
        sc.close();
    }
    */
   
    // 10. Upper Case to Lower Case:-
    /*
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Alphabet:-");
        char choice = sc.next().charAt(0);

        if(choice>='a' && choice<='z'){
            choice = (char)(choice-32);
            System.out.println("Upper Case : "+choice);
        }
        else{
            System.out.println("Invalid Character!");
        }
        sc.close();
   }
   */

   // 11. Lower Case to Upper Case:-
   /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Alphabet:-");
        char choice = sc.next().charAt(0);

        if(choice>='A' && choice<='Z'){
            choice = (char)(choice+32);
            System.out.println("Upper Case : "+choice);
        }
        else{
            System.out.println("Invalid Character!");
        }
        sc.close();
   }
   */
  
   // 12. Print 1 To N:-
    /*
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number : ");
        int num1 = sc.nextInt();
        int i = 1;

        System.out.println("Starting from : ");
        do{
            System.out.println(i);
            i++;
        }while(i<=num1);
        sc.close();
   }
   */

   // 13. Sum of Number from 1 To N:-
    /*
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number : ");
        int num1 = sc.nextInt();

        int sum = 0;
        for (int i=1 ; i<=num1 ; i++){
            if(i%2==0){
                sum+=i;
            }else{
                continue;
            }
        }
        System.out.println("Sum : " + sum);

        sc.close();
   }
   */


   // 14. Multiplication Table of a Number:-
   /*
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number of Which Table You Want : ");
        int num1 = sc.nextInt();

        System.out.println("Till How many Number You Want the Table : ");
        int num2 = sc.nextInt();

        System.out.println("Multiplication Table:-");
        for(int i = 1 ; i<=num2 ; i++){
            System.out.println(num1 + " x " + i + " = " + (i*num1));
        }
        sc.close();
   }
   */

   // 15. Reverse a Number:-
    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Numbers: ");
        int num1 = sc.nextInt();

        int reversed_num = 0;
        int quitoent = num1;

        while(quitoent!=0){
            int remainder = 0;
            remainder = quitoent % 10;
            reversed_num = reversed_num * 10 + remainder;
            quitoent /= 10;
        }
        System.out.println("Original Number : " + num1);
        System.out.println("Reversed Number : " + reversed_num);
        sc.close();
    }
    */

    // 16. Print all Prime numbers from 1 to 100:-
    /*
    public static void main(String[] args) {
        int num = 2;
        while (num<=100){
            boolean is_prime = true;
            for(int i=2;i<num;i++){
                if(num%i==0){
                    is_prime=false;
                }
            }
            if(is_prime){
                    System.out.println("Prime : " + num);
            }
            num++;
        }
    }
    */

    // 17. Print all Integers that are divisible by 7 B/W 50 to 100:-
    /*
    public static void main(String[] args) {
        for(int i=50;i<=100;i++){
            if(i%7==0){
                System.out.println(i);
            }else{
                continue;
            }
        }
    }
    */

    // 18. 
    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of Rows:");
        int n = sc.nextInt();

        for(int row=0;row<n;row++){
            for(int col=0;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    */

    // 19.
    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of Rows:");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int dash=n-i;dash>0;dash--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    */

    // 20.
    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of Rows:");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    */

    // 21.
    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of Rows:");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    */
}