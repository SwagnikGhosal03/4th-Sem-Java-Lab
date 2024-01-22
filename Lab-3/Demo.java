import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter length,width & height");
        int length=in.nextInt();
        int width=in.nextInt();
        int height=in.nextInt();
        Box box=new Box(length,width,height);
        System.out.println("the volume is "+box.volume());
        in.close();
    }
}
class Box{
    int length;
    int width;
    int height;
    Box(int length,int width, int height){
     this.length=length;
     this.width=width;
     this.height=height;
    }
    int volume(){
        int volume=length*width*height;
        return volume;
    }
}
