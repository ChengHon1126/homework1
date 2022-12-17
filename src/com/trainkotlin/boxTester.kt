package com.trainkotlin

import sun.security.util.Length
import java.util.Scanner


fun main(){
    var scanner = Scanner(System.`in`)
    var length = scanner.nextFloat()
    var width = scanner.nextFloat()
    var height = scanner.nextInt()
    val box3 = box3(length,width,height)
    val box5 = box5(length,width,height)

    if (box3.validate()) println("box3")
    else if (box5.validate()) println("box5")
    else println("no box size")
}


open class box3(val length: Float, val width:Float,val height: Int){
    open fun validate() = length <23 && width <14 && height<23
}

class box5(length: Float,width:Float, height: Int):box3(length,width,height) {
    override fun validate() =
        length < 39.5f && width < 27.5 && height < 23
}