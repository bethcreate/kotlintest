fun main (){
squares()

    var gari=(Track("Golf2019", 34.2, 34))
    println (gari.load(22))
    println(gari.unload(10))
    gari.weightCheck()
}
data class Book(var Title: String, var Author: String, var pages: String)


fun squares(){
    var i =3000
    do{
        println("negative integers")

    }while(i>=3000)

}

class Track(registration: String, totalWeight: Double, capacity: Int){

fun load(weight: Int){

    println(totalWeight + weight)
}
    fun unload(weight: Int){
        println( totalWeight- weight)
    }
    fun weightCheck(){
        println("The car is loaded with $kgs ")

    }
}



