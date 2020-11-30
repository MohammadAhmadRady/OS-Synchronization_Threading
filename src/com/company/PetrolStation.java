package com.company;

import java.util.ArrayList;
import java.util.Stack;
import java.util.Vector;

public class PetrolStation {

    private  int NumOfPumps  , NumOfClients;
    private ArrayList <String> ClientsNames= new ArrayList<>();
    static Semaphore S ;

    public PetrolStation(int numOfPumps , int numOfClients , ArrayList<String> Cnames){
        NumOfPumps = numOfPumps;
        NumOfClients=numOfClients;
        ClientsNames=Cnames;
        S= new Semaphore(NumOfPumps);
    }

    public void exec() throws InterruptedException {

        Vector<String> Pump = new Vector<>();
        String pump;
        for(int j=NumOfPumps ; j>0; j--)
            Pump.add(("Pump "+j));
        System.out.println(Pump);

        Client thread [] = new Client[NumOfClients];
        for (int i = 0; i < NumOfClients ; i++)
        {
            pump=Pump.get(Pump.size()-1);
            thread[i]=new Client(ClientsNames.get(i),pump);
            thread[i].start();
            Pump.remove(Pump.size()-1);
            Thread.sleep(25);
            Pump.insertElementAt(pump,0);
        }

    }



}
