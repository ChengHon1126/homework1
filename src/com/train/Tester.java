package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int buy = 1;
        while (buy != 0){
            buy = scanner.nextInt();
            if (buy != -1){
            System.out.print("please enter number of ticket:");
            int tickets = scanner.nextInt();
            System.out.print("how many round_trip ticket:");
            int round_trip = scanner.nextInt();

            Test test = new Test(tickets,round_trip);
            test.print();}
            else {
                return;
            }
        }

    }


    public void testbeta(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter number of ticket:");
        int tickets = scanner.nextInt();
        System.out.print("how many round_trip ticket:");
        int round_trip = scanner.nextInt();

        Test test = new Test(tickets,round_trip);
        test.print();
    }
}
