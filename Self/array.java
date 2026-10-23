import java.util.Arrays;
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
    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Declaration:-
        // int[][] arr;
        
        // Allocation:-
        // arr = new int[3][4];

        // Init:-
        // int [][] brr = {{1,2},{3,4},{5,6},{7,8}};

        // Accessing 1 element at a time:-
        // System.out.println("Row 0 and Column 1 : " + brr[0][0]);
        // System.out.println("Row 3 and Column 0 : " + brr[3][0]);

        // int rowlength = brr.length;
        // int collenght = brr[0].length;
        // if columns have diff length then find it's length everytime inside the loop for every row.

        // // Accessing Whole Matrix:-
        // for(int row = 0; row<=rowlength-1 ; row++){
        //     for(int col = 0 ; col<=collenght-1 ; col++){
        //         System.out.print(brr[row][col] + "  ");
        //     }
        //     System.out.println();
        // }

        // Input / Output in 2-D Array:-
        // int[][] arr1 = new int[2][4];

        // int rowlength = arr1.length;
        // int collenght = arr1[0].length;

        // for(int i=0;i<=rowlength-1;i++){
        //     for(int j=0;j<=collenght-1;j++){
        //         System.out.println("Enter Value for row : " + i + " and columns : " + j);
        //         arr1[i][j] = sc.nextInt();
        //     }
        // }

        // for(int i=0;i<=rowlength-1;i++){
        //     for(int j=0;j<=collenght-1;j++){
        //         System.out.print(arr1[i][j] + " ");
        //     }
        //     System.out.println();
        // }
    }
    */

    // 7. Find the Sum of total values in a 2-D Array:-
    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number of Rows:-");
        int r = sc.nextInt();

        System.out.println("Etner the Number of Columns:-");
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        int rowlength = arr.length;
        int collength;
        int sum = 0;

        for(int i=0;i<=rowlength-1;i++){
            collength = arr[i].length;
            for(int j=0;j<=collength-1;j++){
                System.out.println("Enter the value for Row : " + i + " and Column : " + j);
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("2-D Array:-");

        for(int i=0;i<=rowlength-1;i++){
            collength = arr[i].length;
            for(int j=0;j<=collength-1;j++){
                sum += arr[i][j];
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Total Sum of 2-D Array: " + sum);
    }
    */

    // 8. Find the Multiplication of an 2-D Array:-
    /*
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number of Rows:-");
        int r = sc.nextInt();

        System.out.println("Etner the Number of Columns:-");
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        int rowlength = arr.length;
        int collength;
        int sum = 1;

        for(int i=0;i<=rowlength-1;i++){
            collength = arr[i].length;
            for(int j=0;j<=collength-1;j++){
                System.out.println("Enter the value for Row : " + i + " and Column : " + j);
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("2-D Array:-");

        for(int i=0;i<=rowlength-1;i++){
            collength = arr[i].length;
            for(int j=0;j<=collength-1;j++){
                sum *= arr[i][j];
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Total Sum of 2-D Array: " + sum);
    }
    */

    // 9. Find the Maximum and Minimum in an 2-D Array:-
    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number of Rows:-");
        int r = sc.nextInt();

        System.out.println("Etner the Number of Columns:-");
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        int rowlength = arr.length;
        int collength;

        for(int i=0;i<=rowlength-1;i++){
            collength = arr[i].length;
            for(int j=0;j<=collength-1;j++){
                System.out.println("Enter the value for Row : " + i + " and Column : " + j);
                arr[i][j] = sc.nextInt();
            }
        }

        int max_value = arr[0][0];
        int min_value = arr[0][0];

        for(int i=0;i<=rowlength-1;i++){
            collength = arr[i].length;
            for(int j=0;j<=collength-1;j++){
                System.out.print(arr[i][j] + "  ");
                if(max_value < arr[i][j]){
                    max_value = arr[i][j];
                }else if(min_value > arr[i][j]){
                    min_value = arr[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("Max Value : " + max_value + " Min Value : " + min_value);
    }
    */
   
}