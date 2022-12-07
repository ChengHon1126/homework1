package com.trainkotlin

import java.util.Scanner

fun main() {
    var scanner =Scanner(System.`in`)
    print("please enter total ticket:");
    var ticket =scanner.nextInt()
    print("how many round_trip:")
    var round = scanner.nextInt()
    val design= design(ticket,round)
    design.print()
    


}

class design(var ticket:Int,var round:Int){

    fun print(){
        print("total ticket:$ticket"+"\n"+"round_trip:$round"+"\n"
                +"total:"+((ticket-round)*1000+round*2000*0.9).toInt())
    }


}