package Day02;

import java.util.Scanner;

public class Solution7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        double d=sc.nextDouble();
        double e=sc.nextDouble();

        System.out.println("Total marks="+(a+b+c+d+e));
        System.out.println("Percentage="+(a+b+c+d+e)/5);
        
    }
}