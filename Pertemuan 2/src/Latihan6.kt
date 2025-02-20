fun main(){
    val greet = { name: String -> greetings(name) }
    greet("Ali Imran Rodja")
}

fun greetings(name: String) {
    println("Hallo $name!")
}