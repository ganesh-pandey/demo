package first;

import java.util.Scanner;

public class sum_of_array_element {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
       System.out.println("enter the length of array");
       int sum=0;
       int a = sc.nextInt();
        int arr[]= new int[a];
        System.out.println("enter the value of array elemet");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        System.out.println("sum of array element = "+sum);

    }
}
