import java.util.Arrays;
import java.util.Scanner;
public class Pr3{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int arr[]=new int[5];
        System.out.println("enter array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
        }
       bubble(arr);
       System.out.println(Arrays.toString(arr));
       in.close();
    }
    static void bubble(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j-1]>arr[j]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                }
            }
        }
    }
}