import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class string{
    // Basics:-
    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // String Initialization:-
        // String firstname = "Raiden";
        // String lastname = new String("Shogun");

        // System.out.println(firstname + " " + lastname);

        // Indexing:-
        // System.out.println(firstname.length());  // 6
        // System.out.println(lastname.charAt(0));  // S

        // Comparing Strings:-
        // 1. == 
        String name1 = "Kazuha";
        String name2 = "KAZUHA";

        // if(name1 == name2){  // Not Equal
        //     System.out.println("Equal");
        // }else{
        //     System.out.println("Not Equal");
        // }

        // 2. .equals()  {Case Sensitive}

        // if(name1.equals(name2)){  // Not Equal
        //     System.out.println("Equal");
        // }else{
        //     System.out.println("Not Equal");
        // }

        // 3. .equalIgnoreCase()

        // if(name1.equalsIgnoreCase(name2)){  // Equal
        //     System.out.println("Equal");
        // }else{
        //     System.out.println("Not Equal");
        // }

        // String Input:-
        // System.out.println("\nEnter Multiple Words / Lines :");
        // String line = sc.nextLine();
        // System.out.println("Multiple Words : " + line);

        // System.out.println("Enter Single word:");
        // String single = sc.next();
        // System.out.println("Single Word : " + single);

        // Common String Methods:-
        // String str = "Raiden";
        // System.out.println(str.length());
        // System.out.println(str.charAt(3));
        // String s = "RAIDEN";
        // System.out.println(str.equals(s));
        // System.out.println(str.equalsIgnoreCase(s));

        // isempty -> length = 0
        // isblank -> empty or spaces only
        // String a = "";
        // String b = "      ";
        // System.out.println(a.length());
        // System.out.println(b.length());
        // System.out.println(a.isEmpty());
        // System.out.println(b.isBlank());

        // trim -> Removes Leading + Trailing Spaces:-
        // String h = "   YOOOO     ";
        // System.out.println(h.length()); // 13
        // System.out.println(h.trim());  // YOOOO
        // System.out.println(h.length()); // 13
        // h = h.trim();
        // System.out.println(h.length()); // 5

        // Upper and Lower Case
        // System.out.println(name1.toUpperCase()); // KAZUHA
        // System.out.println(name2.toLowerCase()); // kazuha 

        String k = "My Name is Kazuha";
        // substring & contains
        // System.out.println(k.substring(3,7)); // (inclusice , exclusive)  // Name
        // System.out.println(k.contains("w"));  // False

        // valueof(any type)  -> converts the string into any type
        // int num = 5123;
        // String nums = String.valueOf(num);
        // System.out.println(num+1); // 5124
        // System.out.println(nums+1);  // 51231

        // startsWith & endsWith
        // System.out.println(k.startsWith("my Name"));  // False
        // System.out.println(k.endsWith("a"));  // True

        // toCharArray() -> Converts the String into Chars
        // char[] crr = name1.toCharArray();
        // System.out.println(Arrays.toString(crr)); // [K, a, z, u, h, a]

        // split
        // String[] srr = k.split(" ");
        // for(String str : srr){
        //     System.out.println(str);
        // }

        // replace
        // name1 = name1.replace("z", "d");
        // System.out.println(name1);  // Kaduha

        
    }
    */

    // 1. Print each Character of String:-
    // [Y, o, o, o,  , O, r, e, n, o,  , N, a, m, a,  , K, a, z, u, h, a,  , D, e, s, u, .]
    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = "Yooo Oreno Nama Kazuha Desu.";
        char[] ch = str.toCharArray();

        System.out.println(Arrays.toString(ch));
    }
    */
}