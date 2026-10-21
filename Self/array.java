import java.util.Scanner;
public class array{
    // 1 Basics:-
    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declaration:-
        // int[] arr;
        // or int arr[];

        //Allocation:-
        // arr = new int[5];

        //Init:-
        // int[] brr = {1,2,3,4,5};

        // int[] arr1 = {10,20,30,40};
        // for(int i=0;i<=arr1.length-1;i++){
        //     System.out.println("Value at " + i + " index : " + arr1[i]);
        // }

        // for(int val : arr1){
        //     System.out.println(val);
        // }

        // Taking input for 1 index:-
        // int arr2[] = new int[5];
        // int size = arr2.length;
        // System.out.println("Enter a Number:-");
        // arr2[0] = sc.nextInt();
        // System.out.println("Value at " + 0 + " index : " + arr2[0]);

        // Taking input for Multiple index:-
        // for(int i = 0; i<=size-1 ; i++){
        //     System.out.println("Enter Value for " + i + " index : ");
        //     arr2[i] = sc.nextInt();
        // }
        // for(int val: arr2){
        //     System.out.println("Values are " + val);
        // }
    }
    */

    // 2. Add all array elements:-
    // Total Sum is : 150
    /*
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int sum = 0;
        for(int i=0;i<=arr.length-1;i++){
            sum += arr[i];
        }
        System.out.println("Total Sum is : " + sum);
    }
    */

    // 3. Multiply all elements :-
    // Total Sum is : 120
    /*
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int sum = 1;
        for(int i=0;i<=arr.length-1;i++){
            sum *= arr[i];
        }
        System.out.println("Total Sum is : " + sum);
    }
    */

    // 4. Find the Max. value in an Array
    // Maximum Value in Array : 44
    /*
    public static void main(String[] args) {
        int arr[] = {3,6,-12,42,44};
        int n = arr.length;
        int max_value = arr[0];

        for(int i=0;i<=n-1;i++){
            if(arr[i] > max_value){
                max_value = arr[i];
            }
        }
        System.out.println("Maximum Value in Array : " + max_value);
    }
    */

    // 5. Find the Min. value in an Array
    // Minimum Value in Array : -12
    /*
    public static void main(String[] args) {
        int arr[] = {3,6,-12,42,44};
        int n = arr.length;
        int min_value = arr[0];

        for(int i=0;i<=n-1;i++){
            if(arr[i] < min_value){
                min_value = arr[i];
            }
        }
        System.out.println("Minimum Value in Array : " + min_value);
    }
    */

    // 6. 2-D Array:-
}