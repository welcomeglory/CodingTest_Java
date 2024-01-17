import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.print(a.replaceAll(" ","")); 
        System.out.print(b.replaceAll(" ",""));
        
    }
}