package com.trainkotlin

import java.util.Scanner

fun main() {
    var scanner =Scanner(System.`in`)
    val ticket = 0

    while (ticket != -1){
            print("please enter total ticket:");
          var ticket =scanner.nextInt()
          //  var ticket = scanner.nextInt()
        if (ticket != -1) {
            print("how many round_trip:")
            var round = scanner.nextInt()
            val design = design(ticket, round)
            design.print()
        }else{
            return
        }
    }
}

class design(var ticket:Int,var round:Int){

    fun print(){
        println("total ticket:$ticket\nround_trip:$round\ntotal:" +
                "${((ticket-round)*1000+round*2000*0.9).toInt()}")
    }


}