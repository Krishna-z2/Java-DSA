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
    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = 100;
        
        //if:-
        if(age>=18){
            System.out.println("Eligible to Vote");
        }

        //if-else:-
        int score = 42;
        if(score >=45){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }

        //if-else-else if:-
        int accuracy = 78;
        if(accuracy<60 && accuracy>30){
            System.out.println("Not Good");
        }
        else if(accuracy>75 && accuracy<90){
            System.out.println("Good");
        }
        else if(accuracy>90){
            System.out.println("Excellent");
        }
        else{
            System.out.println("Bad");
        }

        //Nested if-else:-
        boolean hassubscription = true;
        int solvescore = 220;

        if(hassubscription){
            if(solvescore>200){
                System.out.println("Unlock Advanced Sheet");
            }
            else{
                System.out.println("Practice more Problems");
            }
        }else{
            System.out.println("Upgrade to Premium");
        }

        //Ternary Operator:-
        int streak = 29;
        String status = (streak>=30) ? "Consistent" : "Inconsistent";
        System.out.println(status);

        //Switch:-
        System.out.println("Enter day:");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thur");
                break;
            case 5:
                System.out.println("Fir");
                break;
            case 6:
                System.out.println("Sat");
                break;
            default:
                System.out.println("Sun");
                break;
        }
    }
    */

    // Loops:-
    /*
    public static void main(String[] args) {

    // For Loops:-
    // for(int i=0 ; i<5 ; i++){
    //     System.out.println(i);
    // }

    // for(int i=1;i<4;i=i+1){
    //     System.out.println("Yoooo");
    // }

    // for(int i=2;i<=10;i=i+2){
    //     System.out.println(i);
    // }

    // Nested For Loops:-
    // for(int i=1;i<=3;i++){
    //     for(int j=1;j<=3;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }

    // for(int i=1;i<=4;i++){
    //     for(int j=1;j<4;j++){
    //         System.out.println("i : " + i + " j : " + j);
    //     }
    // }

    // Break:-
    // for(int i=1;i<=10;i++){
    //     if(i==5){
    //         break;
    //     }
    //     System.out.println(i);
    // }

    // Continue:-
    // for(int i=1;i<5;i++){
    //     if(i==2){
    //         continue;
    //     }
    //     System.out.println(i);
    // }

    // While Loop:-
    // int i = 1;
    // while (i<=5){
    //     System.out.println(i);
    //     i++;
    // }

    // Nested-While Loop:-
    // int i = 1;
    // while(i<=2){
    //     int j = 1; // Important : Reset for each row.
    //     while(j<=3){
    //         System.out.println("i : " + i + "| j : " + j);
    //         j++;
    //     }
    //     i++;
    // }

    // Do-While Loop:-
    //     int i = 1;
    //     do{
    //         System.out.println(i);
    //         i++;
    //     }while(i<=4);
    }
    */
}
