fun main(){
    myFunction("Jane")
    modulus(7,3)
    sum(70,34,68,100)
    playMe("I love playing basketball")
}


fun myFunction(name: String){
    println("Hello Jane")

}

fun modulus(num1:Int , num2:Int): Int{
    var x = (num1 % num2 )
    println(x)
    return x

}

fun  sum(num1:Int, num2:Int, num3:Int, num4:Int): Int{
    var w =( num1+ num2+ num3+ num4)
    println(w)
    return w

}

fun playMe(name: String) {
    println(name)


}