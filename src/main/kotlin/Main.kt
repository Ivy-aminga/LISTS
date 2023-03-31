fun main() {
    val strings = listOf("Nyeliep","Mideva","Mumo","Aniso","Cynthia")
    val giveStrings = giveStrings(strings)
    println(giveStrings)

    val heights = listOf(2.5, 1.7, 1.5, 2.9, 1.5)
    val (averageHeight, totalHeight) = peoplesHeight(heights)
    println("$averageHeight metres")
    println("$totalHeight metres")


    objectAge()
    println((listOf("Kent","Masha","Houdini","Pops")))

    println(car())













}


//1. Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc (2 points)
fun giveStrings(strings: List<String>): List<String> {
    return strings.filterIndexed { index, _ -> index % 2 == 0 }
}

//2. Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height (2 points)
//
fun peoplesHeight(urefu: List<Double>): Pair<Double, Double> {
    val totalHeight = urefu.sum()
    val averageHeight = totalHeight / urefu.size
    return Pair(averageHeight, totalHeight)
}

//3. Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age (2 points)
data class PersonS(val name: String, val age: Int, val height: Int, val weight: Int)

fun objectAge() {
    val mtu1 =  PersonS("Ivy", 30, 170, 60)
    val mtu2 =  PersonS("Marrion", 25, 180, 75)
    val watu =  listOf(mtu1,mtu2)
    val sortedwatu = watu.sortedByDescending { watu -> watu.age }
    println(sortedwatu)

}


//4. Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.



fun listPeople(person: MutableList<String>) {
    val mtu3 = PersonS("Cate", 20, 25,56)
    val mtu4 = PersonS("Lisa", 35, 30,72)
}




//5. Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.


class Cars(var registration:String, var mileage: Double)
fun car():Double{
    val Car1= Cars("oprjf9",7.8)
    val car2= Cars("ppppt7",6.7)
    val car3= Cars("klkt6",5.5)

    val cars= listOf(Car1, car2, car3)

    val allcars = listOf(Car1, car2, car3)

    val sumMileage = allcars.sumOf {miles->miles.mileage }

    val avgMileage = sumMileage/allcars.size
    return avgMileage
}




