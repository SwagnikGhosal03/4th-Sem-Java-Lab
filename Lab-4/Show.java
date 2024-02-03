public class Show {
    public static void main(String[] args) {
        apple A=new apple();
        banana B=new banana();
        cherry C=new cherry();
        A.show();
        B.show();
        C.show();
        }
}
class apple{
    void show(){
        System.out.println("this is an apple");
    }
}
class banana extends apple{
    @Override
    void show(){
        System.out.println("this is a banana");
    }
}
class cherry extends apple{
    @Override
    void show(){
        System.out.println("this is a cherry");
    }
}