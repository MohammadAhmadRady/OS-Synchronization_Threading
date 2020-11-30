package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int NumOFPumps =0 , NumofClient=0;
        ArrayList<String> ClientsNames = new ArrayList<>();

        System.out.println("Enter the number of pumps! ");
        NumOFPumps=sc.nextInt();

        System.out.println("Enter the number of Clients! ");
        NumofClient = sc.nextInt();

        System.out.println("Enter the Clients' names!");
        sc = new Scanner(System.in);

        for(int i=0 ; i <NumofClient ; i++)
        {ClientsNames.add(sc.nextLine());}


        PetrolStation p = new PetrolStation(NumOFPumps, NumofClient , ClientsNames);
        p.exec();




    }
}
