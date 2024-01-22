import java.util.Arrays;
import java.util.Scanner;
public class Pr4 {
        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                int arr[] = new int[10];
                System.out.println("enter the array elements");
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = in.nextInt();
                }
                in.close();
                countOccurrences(arr);
                System.out.println(Arrays.toString(arr));
        }
    
        public static void countOccurrences(int[] arr) {
            int n = arr.length;
            boolean[] visited = new boolean[n];
    
            for (int i = 0; i < n; i++) {
                if (visited[i]) {
                    continue;
                }
    
                int count = 1;
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        visited[j] = true;
                        count++;
                    }
                }
                System.out.println(arr[i] + " occurs " + count + " times");
            }
        }
    }
    
