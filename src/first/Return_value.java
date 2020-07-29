package first;
import java.math.*;
import java.util.Scanner;

public class Return_value {
    public int Add(int num1,int num2)
    {
        int sum =0;
        sum=num1+num2;
        return sum;
    }
    public static int sub(int num1,int num2)
    {
        int sub =0;
        sub=num1-num2;
        return sub;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of 1st number");
        int a= sc.nextInt();
        System.out.println("enter the 2nd value");
        int b=sc.nextInt();

        int sum=0;
        Return_value obj =new Return_value();
        sum=obj.Add(a,b);
        System.out.println("sum of your number is ="+sum);
        System.out.println("difference="+sub(a,b));
    }
}

