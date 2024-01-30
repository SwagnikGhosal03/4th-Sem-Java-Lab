import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
     Scanner in= new Scanner(System.in);
     System.out.println("enter a number");
     int n,rev=0,rem,num;
     n=in.nextInt();
     num=n;
     while (n!=0) {
        rem=n%10;
        rev=rev*10+rem;
        n/=10;
     }
   System.out.println(isPalindrome(num, rev));
     in.close();
    }
    static boolean isPalindrome(int num,int rev){
       if(num==rev){
        return true;
       }
       else return false;
    }
}
