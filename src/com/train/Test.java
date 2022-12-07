package com.train;

public class Test {
    int tickets;
    int round_trip;

   // int tickettotal=1000;
    //float round_triptotal=2000*0.9f;

   // int total = tickets-round_trip;
    public Test(int tickets,int round_trip){
        this.tickets=tickets;
        this.round_trip=round_trip;
    }
    public void print(){
        System.out.println("Total ticket: "+tickets+"\n"+"Round_trip: "+round_trip+
                "\n"+"Total: "+
                (int)(((tickets-round_trip)*1000)+(round_trip)*2000*0.9));
    }

}
