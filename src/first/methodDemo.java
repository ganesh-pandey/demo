package first;
// creating a method to print hello world .that does not accept any argument and will not return any value.
public class methodDemo {
    public static void main(String[] args) {
        System.out.println("method demo");
        //creating a object to call method,as displayis in this class
        //but it is non static method so will be called by object
        methodDemo print = new methodDemo();
        print.display();
        System.out.println("existing ----");

    }
    public void  display()
    {
        System.out.println("hello world");
    }
}
