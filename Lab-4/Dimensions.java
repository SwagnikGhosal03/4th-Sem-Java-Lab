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
        Twodimensions sheet= new Twodimensions(10,20) {
        };
        Threedimensions box = new Threedimensions(20, 40,60);
        System.out.println("cost of the sheet:"+sheet.calculatecost());
        System.out.println("cost of box:"+box.calculatecost());
    }
}