import java.util.Scanner;
public class pattern {
    // 1.
    // ****
    // ****
    // ****
    /*
    public static void main(String[] args) {
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    */

    // 2.
    // * * * * 
    // * * * * 
    // * * * * 
    /*
    public static void main(String[] args) {
        for(int row=0;row<3;row++){
            for(int col=0;col<4;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    */

    // 3. 
    // * 
    // * * 
    // * * * 
    // * * * * 
    // * * * * * 
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

    // 4.
    // | | | | * * * * * 
    // | | | * * * * * 
    // | | * * * * * 
    // | * * * * * 
    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of Rows:");
        int n = sc.nextInt();

        for(int i=1;i<n;i++){
            for(int dash=n-i;dash>0;dash--){
                System.out.print("| ");
            }
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    */

    // 5.
    // * * * * * 
    // * * * * 
    // * * * 
    // * * 
    // * 
    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of Rows:");
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            for(int j=n-i;j>0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    */

    // 6.
    // | | | *
    // | | * * *
    // | * * * * *
    // * * * * * * * 
    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of Rows:");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int dash=n-i;dash>0;dash--){
                System.out.print("| ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int j=2;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    */

    // 7.
    // * * * * * * * 
    // | * * * * * 
    // | | * * * 
    // | | | * 
    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of Rows:");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int dash=1;dash<=i-1;dash++){
                System.out.print("| ");
            }
            for(int j=1;j<=2*n-2*i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    */

    // 8. Hollow Patterns:-  IMPORTANT:-
    // 8.1 :  1st Approach
    // * * * * * * 
    // *         * 
    // *         * 
    // * * * * * * 
    /* 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of Rows:");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            if(i==1 || i==n){
                for(int j=1;j<=n+2;j++){
                    System.out.print("* ");
                }
            }
            else{
                for(int j=1;j<=n+2;j++){
                    if(j==1 || j==(n+2)){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
    */

    // 8.2 : 2nd Approach
    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of Rows:");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n+2;j++){
                if(i==1 || i==n || j==1 || j==n+2){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    */

    // 8.3
    // * 
    // * * 
    // *   * 
    // *     * 
    // * * * * * 
    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of Rows:");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i==1 || i==2 || i==n || j==1 || j==i){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    */

    // 8.4
//           * 
//         *   * 
//       *       * 
//     *           * 
//   * * * * * * * * * 
    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of Rows:");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int dash=n-i;dash>=0;dash--){
                System.out.print("  ");
            }
            for(int j=1;j<=2*i-1;j++){
                if(j==1 || i==n || j==2*i-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    */

    // 9.1 : Number/Characters Printing:-
    // 1 
    // 1 2 
    // 1 2 3 
    // 1 2 3 4 
    // 1 2 3 4 5 
    /* 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of Rows:");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            int count = 1;
            for(int j=1;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
    */

    // 9.2
    // A 
    // A B 
    // A B C 
    // A B C D 
    // A B C D E 
    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of Rows:");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            char c = 'A';
            for(int j=1;j<=i;j++){
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }
    }
    */

    // 9.3
    // E 
    // E D 
    // E D C 
    // E D C B 
    // E D C B A 
    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of Rows:");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            char c = 'A';
            for(int j=1;j<=i;j++){
                System.out.print((char)(c+n-1)+" ");
                c--;
            }
            System.out.println();
        }
    }
    */

    // 9.4
//           1 
//         2 2 2 
//       3 3 3 3 3 
//     4 4 4 4 4 4 4 
//   5 5 5 5 5 5 5 5 5 
    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of Rows:");
        int n = sc.nextInt();

        int count=1;

        for(int i=1;i<=n;i++){
            for(int dash=n-i;dash>=0;dash--){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(count+" ");
            }
            for(int j=2;j<=i;j++){
                System.out.print(count+" ");
            }
            count++;
            System.out.println();
        }
    }
    */

    // 9.5
//         1 
//       1 2 1 
//     1 2 3 2 1 
//   1 2 3 4 3 2 1 
// 1 2 3 4 5 4 3 2 1 
    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of Rows:");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            int count=1;
            for(int dash=n-i;dash>0;dash--){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
            for(int j=2;j<=i;j++){
                System.out.print(i-j+1+" ");
            }
            System.out.println();
        }
    }
    */
}
