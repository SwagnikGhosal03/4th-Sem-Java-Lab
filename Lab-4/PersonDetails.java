import java.util.Scanner;
class Account{
double acc_no;
double balance;
void input(Scanner in){
    System.out.println("enter the account number");
     acc_no=in.nextDouble();
     in.nextLine();
    System.out.println("enter the balance");
     balance=in.nextDouble();
     in.nextLine();
}
void display(){
    System.out.println("Account number:"+acc_no);
    System.out.println("balance:"+balance);
}
}
class Person extends Account{
    String name;
    double aadhar_no;
    @Override
    void input(Scanner in){
        super.input(in);
        System.out.println("enter the name");
        name=in.nextLine();
        System.out.println("enter aadhar number");
        aadhar_no=in.nextDouble();
        in.nextLine();
    }
    @Override
    void display(){
        super.display();
        System.out.println("name:"+name);
        System.out.println("Aadhar no:"+aadhar_no);
    }
}
public class PersonDetails {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
       Person[] person=new Person[10];
       for (int i = 1; i <=3; i++) {
        System.out.println("enter details of person "+i);
         person[i]=new Person();
        person[i].input(in);
       } 
       for (int i = 1; i <= 3; i++) {
        System.out.println("details of person "+i);
        person[i].display();
       }
       in.close();
    }
}
