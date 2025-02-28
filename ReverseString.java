import java.util.Scanner;

/* Write a Java program to reverse a given string without using built-in reverse 
functions like StringBuilder.reverse() or Collections.reverse().
Example 
Input: "Java Programming"
Output: "ginmmargorP avaJ"
 */
public class ReverseString {
public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    System.out.print("Enter a String");
    String input= s.nextLine();
    String reversed= reverseString(input);
    System.out.println("Reversed String:"+reversed);
    s.close();
}
public static String reverseString(String Str){
    char[] chars=Str.toCharArray();
    //convert string to  character array
    int left=0;
    int right=Str.length()-1;
    while (left < right) {
        //swap characters
        char temp=chars[left];
        chars[left]=chars[right];
        chars[right]=temp; 
        left++;
        right--;
    }
    return new String(chars);
}
    
}