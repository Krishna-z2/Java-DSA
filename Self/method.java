import java.util.Scanner;
public class method{
    static int value = 20;
    /*
    // Method Creation:-
    // Pararmeterized Method:-
    static void table(int a){
        // Here a is Parameter
        int ans = 0;
        for(int i=1;i<=10;i++){
            ans = a * i;
            System.out.println(a +  " x " + i + " => " + ans);
        }
    }

    // Non - Parameterized Method:-
    // IMPORTANT : return is unnecessary in Void Methods and if we write return before any statement then that is an unreachable statement.
    // No Retrun Type
    static void name(){
        System.out.println("It Means Nice to Meet You");
    }

    // Return Type
    static int add(int a , int b){
        int sum = a + b;
        return sum;
    }

    // Main:-
    static void main(){
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a  Number for Table : - ");
        // int n = sc.nextInt();

        
        // System.out.println("Yorushku");
        
        // Method Invoke and Non - Parameterized:-
        // name();

        // Method Invoke - 1 and Parameters:-
        // Here n is Arguements
        // table(n);
        // System.out.println("Mata Ne");

        // Method Invoke - 2:-
        // System.out.println("Sum = "+add(9,10));


    }
    */

    // Method Overloading (Method with Same Name):-
    // If i don't give diff parameters it will show duplicate method.
    /*
    static int add(int a, int b){
        int ans = a + b;
        return ans;
    }
    static int add(int a , int b , int c){
        int ans = a + b + c;
        return ans;
    }
    static void main(){
        int result1 = add(12,13 );
        int result2 = add(12, 13, 14);
        System.out.println("Resul1 = " + result1);
        System.out.println("Result2 = " + result2);
    }
    */

    /*
    // Call by Value:-
    // When we pass the arguements they only send their copy not the original values that' why don't get change Permanently.
    // static void solve(int num){
    //     System.out.println("Inside Solve : " + num);
    //     num *= 10;
    //     System.out.println("After Updation Inside Solve : " + num);
    // }

    // Inside Main : 5
    // Inside Solve : 5
    // After Updation Inside Solve : 50
    // After Called by Solve : 5

    // Variable Scopping:-
    static void multiples(){
        int value = 20;
        for(int i = 1; i <= 10 ; i++){
            System.out.println(20*i);
        }
        System.out.println("Printed by Multiples Method(Local variable) : " + value);
    }

    static void main(){
        // Call by Value:-
        // int num = 5;
        // System.out.println("Inside Main : " + num);
        // solve(num);
        // System.out.println("After Called by Solve : " + num);

        // Variable Scopping:-
        // System.out.println("Calling Method variable(Local) : " + value);  // Error : cannot find Symbol

        System.out.println("Calling Global Variable : " + value);  // Output : Calling Global Variable : 20

        // Calling Method:-
        multiples();
    }
    */
   
}