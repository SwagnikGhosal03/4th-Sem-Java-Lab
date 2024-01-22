import java.util.Scanner;

public class Pr2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int arr[]=new int[10];
        int counteven=0;
        int countodd=0;
        System.out.println("enter the array elements");
        for (int i = 0; i < arr.length; i++) {
           arr[i]=in.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                counteven++;
            }
            else countodd++;
        }
        System.out.println("the number of even numbers is "+counteven);
        System.out.println("the number of even numbers is "+countodd);
        in.close();

    }
}
