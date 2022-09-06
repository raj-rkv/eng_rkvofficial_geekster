package Day04;

import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int marks=sc.nextInt();
    if(marks<33)
        System.out.println(marks+4);
    else
        System.out.println(marks);
    }
}