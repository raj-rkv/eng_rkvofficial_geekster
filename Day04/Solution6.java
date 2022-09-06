package Day04;

import java.util.Scanner;

public class Solution6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int age=sc.nextInt();
        int sal=sc.nextInt();
        if(age>60)
            System.out.println(sal+1000);
        else if(age>40)
            System.out.println(sal+500);
        else
            System.out.println(sal);
        
    }
}