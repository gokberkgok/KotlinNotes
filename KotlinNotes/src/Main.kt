// Kotlin Temelleri için Notlarım
fun main() {
    //Variables - değişkenler && Constants - sabitler
    var x = 5
    var y = 5.15

    val name = "Gökberk"
    //name = "Gök"    // değiştirilemez

    // CHARACTERS
    // Karakterler Char olarak temsil edilir. Tek bir karakteri tanımlamak için kullanılır. Tek tırnak içerisinde tanımlama yapılır.
    val myChar : Char = 'e'

    //Defining - tanımlamak
    var myInteger : Int
    // Initialize - başlatmak, ilk değerini atamak
    myInteger = 15
    myInteger = 20  // var olduğu için başka değeri tanımlayabiliriz
    val a : Int = 5

    val myDoble = 3.14
    val myFloat = 3.14f //float
    println(myFloat* 2)
    var myD : Double = 3.0

    //String
    val first_name = "gökberk"
    val last_name : String = "Gök"
    val full_name  = first_name+ " "+ last_name
    println(full_name)
    println(first_name.capitalize())

    //Bool
    // < > <= >= == != && ||
    var myBool : Boolean = true
    var myBool2 = false
    println(3 != 5 && 6 < 3)

    // Compare, Conversion - Birbirine Çevirme
    var myNumber = 10
    var myLongNumber = myNumber.toLong()
    var input = "10"
    println(input.toInt() * 2)

    /*COLLECTIONS*/
    //Arrays
    val myArray = arrayOf("james", "kirk", "lars", "rob")
    println(myArray[0])

    myArray.set(1,"Kirk Hammett")
    println(myArray[1])

    val numberArray = arrayOf(1,2,3,4,"Gökk",5.2,true)
    println(numberArray[3])

    // List - ArrayList
    val myMusician = arrayListOf<String>("James","Kirk")
    println(myMusician[0])
    myMusician.add("Lars")
    println(myMusician[2])
    myMusician.add(1,"Rob")
    println(myMusician[1])

    val myArrayList = ArrayList<Int>()
    myArrayList.add(200)

    val myMixedArrayList = ArrayList<Any>()
    myMixedArrayList.add("Gök")
    myMixedArrayList.add(2.4)
    println(myMixedArrayList)

    // Set  bir eleman bir kere olabilir
    val myArray2 = arrayOf(1,1,2,4)
    println("First Element : ${myArray2[0]}")
    println("First Element : ${myArray2[1]}")

    val mySet = setOf<Int>(1,1,2,3)
    println(mySet.size)

    val myStringSet = HashSet<String>()
    myStringSet.add("Gökberk")
    myStringSet.add("Ahmet")
    println(myStringSet.size)

    //Map - HashMap (key-value) ilişkisi
    val fruitCalorieMap = hashMapOf<String,Int>()
    fruitCalorieMap.put("Apple",100)
    fruitCalorieMap.put("Banana",150)
    println(fruitCalorieMap["Apple"])
    println("${fruitCalorieMap.keys} -- ${fruitCalorieMap.values}")

    val myHashMap = HashMap<String,String>()
    val myHashMap2 = hashMapOf<String,Int>("A" to 1,"B" to 2,"C" to 3)
    println(myHashMap2["C"])

    // Condition
    // IF
    if (10 < 5){
        println("Küüççk")
    }else if (10 == 5){
        println("Eşit")
    }else{
        println("Büyük")
    }

    // Switch - "When"
    val day = 3
    var dayString = ""
    when(day){
        1 -> dayString = "Monday"
        2 -> dayString = "Tuesday"
        3 -> dayString = "Wednesday"
        else -> dayString = ""
    }
    println(dayString)
    val number = 48
    when (number) {
        in 0..10 -> {
            println("0 ile 10 arasında")
        }
        in 11..20 -> {
            println("11 ile 20 arasında")
        }
        !in 21..30 -> {
            println("21 ile 30 aralığının dışında")
        }else -> {
        println("Aralıkta değil")
    }
    }

    // LOOPS

    //downTo ile büyükten küçüğe doğru range tanımı yapılabilir.
    for (value in 10 downTo 1)
        println(value)
    //Eğer belli aralıklarla atlama yapmak isteniyorsa step fonksiyonu kullanılır.
    for (i in 6 downTo 1 step 2)
        println(i)


    // For loop
    val myNumberArray = arrayOf(6,12,15,18,24,32,42,55)
    for (number in myNumberArray){
        val z = number / 3 * 5
        println(z)
    }
    for (i in myNumberArray.indices){ //gerek yok
        println(i)
    }
    for (b in 0..9){    // 0 dan 9 a kadar rakamları al 2 ile çarp
        println(b * 2)
    }
    val myStrArrayList = ArrayList<String>()
    myStrArrayList.add("Ali")
    myStrArrayList.add("Gök")
    myStrArrayList.add("Baho")
    for (str in myStrArrayList){
        println(str)
    }
    myStrArrayList.forEach { (println(it)) }  //başka bir kullanım şekli

    //While Loop
    var j = 0
    while (j < 10){
        println(j)
        j++
    }
}