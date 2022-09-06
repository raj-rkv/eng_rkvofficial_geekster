package Day04;

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        if(n1>n2)
            System.out.println(n1);
        else
            System.out.println(n2);
    }
}