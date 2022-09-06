package Day04;

import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int income=sc.nextInt();
    if(income>=500000)
        System.out.println("Tax to be paid");
    else
        System.out.println("No tax to be paid");
    }
}