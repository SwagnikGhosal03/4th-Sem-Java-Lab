import java.util.Scanner;

public class Pr1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter 3 numbers");
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        if(a>b && a>c){
            System.out.println("the largest number is "+a);
        }
        else if (b>c && b>a) {
            System.out.println("the largest number is "+b);
        }
        else System.out.println("the largest number is "+c);
        in.close();
    }
}
