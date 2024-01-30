public class Pr5 {
        public static void main(String[] args) {
            int[][] matrix = {
                {1, 2, 2},
                {4, 5, 6},
                {7, 8, 9}
            };
            int primary = 0;
            int secondary = 0;
    
            for (int i = 0; i < 3; i++) {
                primary += matrix[i][i];
                secondary += matrix[i][2 - i];
            }
    
            System.out.println("Sum of primary diagonal: " + primary);
            System.out.println("Sum of secondary diagonal: " + secondary);
        }
    }
    
