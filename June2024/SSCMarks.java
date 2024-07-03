package June2024;

import java.util.Scanner;

public class SSCMarks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name :");
        String name = sc.next();

        System.out.println("Enter Student std :");
        String std = sc.next();

        System.out.println("Enter Student age :");
        int age = sc.nextInt();

        System.out.println("Enter Student MobileNumber :");
        long mobileNumber = sc.nextLong();
        //marks
        System.out.println("Enter Student Marks :");
        int telugu = sc.nextInt();
        int Hindi = sc.nextInt();
        int english = sc.nextInt();
        int maths = sc.nextInt();
        int science = sc.nextInt();
        int social = sc.nextInt();
        int total = telugu + Hindi + english + maths + science + social;

        System.out.println("name ::" + name + " total marks :" + total + "  MobileNumber:::" + mobileNumber);
        //avg =total/subjects
        int avg = total / 6;
        System.out.println("Average Marks::" + avg);
    }
}
