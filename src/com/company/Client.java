package com.company;

public class Client extends Thread {

    private String ClientName ,PumpCounter;


    public Client(String ClientName ,String Pumpcounter )
    {
        this.ClientName=ClientName;
        this.PumpCounter=Pumpcounter;
    }
    @Override
    public void run(){

        if(PetrolStation.S.value>0) System.out.println(ClientName+" Arrived" );
        else System.out.println(ClientName+" Arrived and waiting" );

        PetrolStation.S.P();

        System.out.println(PumpCounter+": "+ClientName+" occupied");
        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(PumpCounter+": "+ClientName+" being served");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(PumpCounter+": "+ClientName+" paying");
        try {
            Thread.sleep(600);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(PumpCounter+": "+ClientName+" leave");

        PetrolStation.S.V();

    }
}
