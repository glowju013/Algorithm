import java.util.*

fun main() {
    var scanner = Scanner(System.`in`)
    var num = scanner.nextInt()
    var str = scanner.next()
    var ans1 = ""
    var ans2 = ""
    var ans3 = ""

    fun trans1(input: String): String {
        val result = StringBuilder()
        var shouldToggle = false
        var isFirstChar = true
        for (char in input) {
            if (isFirstChar) {
                result.append(char.lowercaseChar())
                isFirstChar = false
            }
            else if (shouldToggle) {
                result.append(
                    if(char.isLowerCase()) {
                        char.uppercaseChar()
                    }
                    else if(char.isUpperCase()) {
                        char.lowercaseChar()
                    }
                    else char
                )
                shouldToggle = false
            }
                else if (char == '_') {
                shouldToggle = true
            } else {
                result.append(char)
            }
        }

        return result.toString()
    }

    fun trans2(input: String): String {
        val result = StringBuilder()
        var count = 0;
        for ((index, char) in input.withIndex()) {
            if (index > 0 && char.isUpperCase() ) {
                result.append('_').append(char.lowercaseChar())
                count++
            }
            else if(char == input[0]){

                result.append(char.lowercaseChar())
            }  else{
                result.append(char.lowercaseChar())
            }
        }
        return result.toString()
    }

    fun trans3(input: String): String {
        val result = StringBuilder()
        var shouldToggle = false
        var isFirstChar = true
        for (char in input) {
            if (isFirstChar) {
                result.append(char.uppercaseChar())
                isFirstChar = false
            }
            else if (shouldToggle) {
                result.append(
                    if(char.isLowerCase() ) {
                        char.uppercaseChar()
                    }

                    else if(char.isUpperCase()) {
                        char.lowercaseChar()
                    }
                    else char
                )
                shouldToggle = false
            }


            else if (char == '_') {
                shouldToggle = true
            }


            else {
                result.append(char)
            }

        }

        return result.toString()
    }



    if(num==1) {
        ans1 = trans1(str)
        ans2 = trans2(str)
        ans3 = trans3(str)
    }

    if(num==2) {
        ans1 = trans1(str)
        ans2 = trans2(str)
        ans3 = trans3(str)
    }

    if(num==3) {
        ans1 = trans1(str)
        ans2 = trans2(str)
        ans3 = trans3(str)
    }

    println(ans1)
    println(ans2)
    println(ans3)


}