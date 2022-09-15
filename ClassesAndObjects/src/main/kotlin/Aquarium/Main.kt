package Aquarium

fun main(args: Array<String>) {
   buildAquarium()
}
fun buildAquarium (){
    val myAquarium = Aquarium(20,30,50)
    println("length :${myAquarium.length} " +
            "height :${myAquarium.height} " +
            "width :${myAquarium.width} " )
    myAquarium.height=80
    println("height2 :${myAquarium.height} ") // aquarium as an object doesnt change when its properties change
    println("fun ${myAquarium.volume()}")
    println("fun ${myAquarium.volume2}") // setter method implemented as property
    val myAquarium2 = Aquarium(numberOfFish=100)

}
