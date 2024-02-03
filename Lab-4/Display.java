import java.util.Scanner;

public class Display {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the dimensions");
        double length,width,height,thick;
        length=in.nextDouble();
        width=in.nextDouble();
        height=in.nextDouble();
        thick=in.nextDouble();
        plate p= new plate(length,width);
        box b= new box(length, width, height);
        woodbox w=new woodbox(length, width, height, thick);
       p.display();
       b.display();
       w.display();
        in.close();
    }
}
class plate{
    double length;
    double width;
    plate(double length,double width){
        this.length=length;
        this.width=width;
    }
    void display(){
        System.out.println("length="+this.length+" width="+this.width);
    }
}
class box extends plate{
   double height;
    box(double length,double width,double height){
    super(length, width);
    this.height=height;
    }
    @Override
    void display(){
        super.display();
        System.out.println("height"+this.height);
    }
}
class woodbox extends box{
    double thick;
     woodbox(double length,double width,double height,double thick){
     super(length, width,height);
     this.thick=thick;
     }
     @Override
     void display(){
         super.display();
         System.out.println("thickness"+this.thick);
     }
 }