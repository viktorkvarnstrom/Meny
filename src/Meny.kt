import java.util.*

fun main() {
    println("-------------------------")
    println("Vad vill du göra?")
    println("1. Addera två tal")
    println("2. Räkna bokstäver i en sträng")
    println("3. Spegelvänd en sträng")
    println("4. Summera alla tal i en sträng")
    println("e. Avsluta programmet")

    when(readLine() ?: "") {
        "1" -> addTwoNumbers()
        "2" -> checkLetters()
        "3" -> reverseAString()
        "4" -> addNumbersToSumInAString()
        "e" -> println("Programmet avslutas!")
        else -> main()
    }
}

fun addTwoNumbers() {
    val numberOne = Scanner(System.`in`)
    print("Första talet är: ")
    val firstNumber = numberOne.nextInt()

    val numberTwo = Scanner(System.`in`)
    print("Andra talet är: ")
    val secondNumber = numberTwo.nextInt()

    val sum = firstNumber + secondNumber

    println("Summan är: $sum")
    main()
}

fun checkLetters() {
    println("Ange ordet du vill leta i: ")

    val someString = readLine() ?: ""
    println("Ange bokstaven du vill leta efter: ")
    val scanner = Scanner(System.`in`)
    val someChar = scanner.next().single()
    var count = 0

    for (letters in someString) {
        if (letters == someChar) {
            count++
        }
    }
    println("Det finns $count $someChar i ordet $someString")
    main()

}

fun reverseAString() {
    println("Mata in en textsträng: ")
    val input = readLine() ?: ""
    val inputRes = input.reversed()
    println("Så är blir ordet spegelvänt: $inputRes")
    main()
}

fun addNumbersToSumInAString() {
    println("Mata in alla siffor du vill addera med ett mellanslag: ")
    val input = readLine() ?: ""

    var sum = 0
    var numbersInString = ""

    for (i in input.indices) {
        val char = input[i]
        if (char in '0'..'9') {
            numbersInString += char
            if (i == input.length - 1) {
                sum += numbersInString.toInt()
            }
        } else if (!numbersInString.isBlank()) {
            sum += numbersInString.toInt()
            numbersInString = ""
        }
    }

    println("Summan blir: $sum")
    main()
}