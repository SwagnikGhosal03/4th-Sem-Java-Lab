import java.util.Scanner;

abstract class Twodimensions{
    double width;
    double height;
    double cost_2D=40.0;
     Twodimensions(double height,double width){
       this.width=width;
       this.height=height;
     }
     double calculatecost(){
        return height*width*cost_2D;
     }
}
class Threedimensions extends Twodimensions{
    double depth;
    double cost_3D=30.0;
   Threedimensions(double height, double width,double depth) {
        super(height, width);
        this.depth=depth;
    }
    @Override
   double calculatecost(){
    return height*width*depth*cost_3D;
   }
}
public class Dimensions{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height, width for the sheet:");
        double height = sc.nextDouble();
        double width = sc.nextDouble();
        Twodimensions sheet= new Twodimensions(height, width){};
        System.out.println("depth for the box:");
        double depth = sc.nextDouble();
        Threedimensions box = new Threedimensions(height, width, depth);
        System.out.println("Cost of the sheet: "+sheet.calculatecost());
        System.out.println("Cost of box: "+box.calculatecost());
        sc.close();
}
}