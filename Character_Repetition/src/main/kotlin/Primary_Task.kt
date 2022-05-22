import java.util.Scanner
fun main() {

    val list: MutableList<String> = mutableListOf()

    val reader = Scanner(System.`in`)
    print("Enter the number of items you want to add inside the list: ")
    val length:Int = reader.nextInt()
    for(i in 0 until length){
        val count=i+1
        println("Enter item number $count")
        val stringInput:String = readLine()!!
        list.add(stringInput)
    }
    println(averageOfCharacterRepetition(`mutable list` = list))
}
fun averageOfCharacterRepetition(`mutable list`:List<String>):Double {
    var counter =0
     if(`mutable list`.isNotEmpty()) for(i in `mutable list`.indices) {
         if((`mutable list`[i].equals("A",ignoreCase = true)) || (`mutable list`[i].equals("B",ignoreCase = true))) {
             if (`mutable list`[i].equals("A",ignoreCase = true)) counter = counter.inc()
         } else return -1.0
     }
    else return -1.0

    return (counter.toDouble()/`mutable list`.size.toDouble())
}