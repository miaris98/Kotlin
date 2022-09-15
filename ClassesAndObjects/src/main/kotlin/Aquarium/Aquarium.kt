package Aquarium

import kotlin.math.PI

open class Aquarium (var length:Int=100 ,var width:Int=200 ,var height:Int=300){
    open var volume2 :Int
        get() = width * height * length / 1000
        set(value) {(height * width)/5000}

    open var water = volume2 *0.9 // objects are initialize in the order tehy are defined

    fun volume(): Int{
      return width * height * length / 1000
    }

    constructor(numberOfFish: Int): this() { // second constructor on a single class
    val water:Int = numberOfFish * 2000
    val tank:Double = water+water * 0.1
    height = (tank/(length * width)).toInt()

    }
}

class Towertank():Aquarium() { // inheritance 
    override var water = volume2 * 0.2
    override var volume2:Int
        get() = (width * height * length / 100 * PI).toInt()
        set(value) {(height * width)/500}
}