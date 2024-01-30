public class MyClass {
    static int objectCount = 0;
    public MyClass() {
        objectCount++;
    }
    public static void displayObjectCount() {
        System.out.println("Number of objects created: " + objectCount);
    }
    public static void main(String[] args) {
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();
        MyClass obj3 = new MyClass();
        MyClass.displayObjectCount(); 
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
    }
}

