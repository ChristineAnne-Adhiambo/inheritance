fun main() {
var car = Car("Lexus","F500","black", 3)
car.carry(1)
    car.identity()
   var calc= car.calculatesParkingFees(3)
    println(calc)
    var bus = Bus("Scania","v8", "Blue",60)
   var x= bus.matrixTRipFare(150.0)
    println(x)

}
open class Car(var make:String,var model:String, var color:String,var capacity:Int) {
    fun carry(people: Int) {
        var x = (people-capacity)
        if(people <= capacity){
            println("Carrying $people passengers")
        }
        else if(people>capacity){
            println("Over capacity by $x people")
        }
    }
    fun identity(){
        println("I am a black F500 Lexus")

    }
   open fun calculatesParkingFees(hours: Int) :Int{
        var fee=  hours * 20
        return fee
    }
}

class Bus (var make:String,var model:String, var color:String,var capacity:Int) {
    fun matrixTRipFare(fare: Double): Double {
        var Calculate = capacity * fare
        return Calculate
    }

}
