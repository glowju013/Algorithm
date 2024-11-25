import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val intA = scanner.nextInt()
    val intB = scanner.nextInt()
    if(intA > intB) {
        print(">")
    }
    else if(intA == intB) {
        print("==")
    }
    else {
        print("<")
    }
}