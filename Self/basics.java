import java.math.BigInteger;
import java.util.*;

public class basics {
    // Variables:-
    /*
    public static void main(String[] args){
        // Define // Declare
        int age;
        // System.out.println(age);  // Error
        age = 10;
        age = 11;
        System.out.println(age); // 11

        // Define // Initialize
        int marks = 90;
        System.out.println(marks); // 90

        // Case Sensitive
        int weight = 40;
        int WEIGHT = 60;
        System.out.println("weight" + weight); // 40
        System.out.println("WEIGHT" + WEIGHT); // 60

        // Starting Letter
        int maarks = 91;
        int MARKS = 92;
        int _marks = 93;
        int $marks = 94;

        // Subsequent Letter
        int height5 = 21;
        int height_love = 33;
        int height$12love = 34;
        int height_ = 35;
        int height$ = 36;

        // No Reserved Keywords
        //int class = 22; // Error
        
        // Always create a meaningfull variable name.
        // For constant value always try to create a UPPERCASE VARIABLE NAME.
        // camelCase => int totalMarks etc.,
    }
    */

    // Data Types:-
    /*
    public static void main(String[] args){
        // Numberic DT : Byte, int , short, long
        byte num1 = 127;
        System.out.println(num1); // 127 & if i do 1277 then it will show : incompatible types error
        
        short num2 = 3000;
        System.out.println(num2); // 3000 & Same as above due to they have a specific range.

        int num3 = 50000000;
        System.out.println(num3);
        
        long num4 = 352050278;
        System.out.println(num4);

        // Floating DT
        float num5 = 3.1434243f;
        System.out.println(num5);

        double num6 = 3.144535452545345534;
        System.out.println(num6);

        boolean tovote = true;
        System.out.println(tovote);

        char firststchar = 'a';
        System.out.println(firststchar);

        System.out.println(firststchar+1);

        // Explicit TypeCasting:
        System.out.println((char)(firststchar+2));
        long num7 = 342342342;
        int num8 = (int)num7;
        System.out.println(num8);

        // Implicit TypeCasting:
        long newnum = num1;
        newnum = 23434234;
        System.out.println(newnum);
    }
    */

    // Input/Output:-
    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number : ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum of Two Number is : "+sum);

        BigInteger bignum = sc.nextBigInteger();
        System.out.println(bignum);

        boolean flag = sc.nextBoolean();
        short shortval = sc.nextShort();
        float floatnum = sc.nextFloat();

        // sc.close is used to save from resource leak
        sc.close();
    }
    */

    // Operators:-
    /*
    public static void main(String[] args) {
        int num1 = 56;
        int num2 = 15;

        // Arithmetic Operators:-
        System.out.println("Addition : "+(num1+num2));
        System.out.println("Subtraction : "+(num1-num2));
        System.out.println("Multiply : "+(num1*num2));
        System.out.println("Division : "+(num1/num2));
        System.out.println("Remainder : "+(num1%num2));

        // Relational Operators:-
        System.out.println(num1==num2);
        System.out.println(num1!=num2);
        System.out.println(num1>num2);
        System.out.println(num1<num2);
        System.out.println(num1>=num2);
        System.out.println(num1<=num2);

        // Logical Operators:-
        boolean cdsa = true;
        boolean ucdsa = false;

        System.out.println(cdsa&&ucdsa);
        System.out.println(cdsa||ucdsa);
        System.out.println(!cdsa);

        // Assignment Operators:-
        int ratingpoints = 100;
        ratingpoints += 20;
        System.out.println(ratingpoints);
        ratingpoints -= 10;
        System.out.println(ratingpoints);
        ratingpoints /= 10;
        System.out.println(ratingpoints);
        ratingpoints *= 20;
        System.out.println(ratingpoints);
        ratingpoints %= 20;
        System.out.println(ratingpoints);

        // Unary(increment or decrement) Operators:-
        int number = 50;

        System.out.println(-number);
        System.out.println(+number);
        System.out.println(number++);
        System.out.println(++number);
        System.out.println(number--);
        System.out.println(--number);
    }
    */

    // Conditionals:-
}
