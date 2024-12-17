package com.QuizDatabase;


import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class Exam {
    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
        Scanner sc=new Scanner(System.in);
        System.out.println("...........WELCOME.........");
        while(true) {
            System.out.println("If you are admin please press 1:");
            System.out.println();
            System.out.println("Do  you want to write exam ? please press 2:");
            System.out.println();
            System.out.println("press enter  3 to exit");
            System.out.println();
            int n = sc.nextInt();
            switch (n)
            {
                case 1:
                    DataBaseManager.userinput(n);
                    break;
                case 2:
                    System.out.println("All The Best");
                    DataBaseManager.userinput(n);
                    break;

            }
            if(n==3 ) {
                System.out.println("Thanking for giving your time and  prepare well");
                break;
            }

        }
    }
}
