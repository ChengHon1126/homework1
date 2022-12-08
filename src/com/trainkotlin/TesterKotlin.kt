package com.trainkotlin

import java.util.Scanner

fun main() {
    var scanner =Scanner(System.`in`)
    var buy = 1

    while (buy != 0){
            buy = scanner.nextInt()
        if (buy != -1) {
            print("please enter total ticket:");
            var ticket =scanner.nextInt()
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
        print("total ticket:$ticket\nround_trip:$round\ntotal:" +
                "${((ticket-round)*1000+round*2000*0.9).toInt()}")
    }


}