import java.util.Scanner;

public class Rectangle{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("mention length & breadth");
        double length,breadth;
        length=in.nextDouble();
        breadth=in.nextDouble();
        Rectangle1 r=new Rectangle1(length, breadth);
        System.out.println("the area is "+r.area());
        System.out.println("the area is "+r.perimeter());
        in.close();
    }
}
class Rectangle1{
 double length;
 double breadth;
 Rectangle1(double length,double breadth){
    this.length=length;
    this.breadth=breadth;
 }
 double area(){
    return (length*breadth);
 }
 double perimeter(){
    return 2*(length+breadth);
 }
}