fun main() {
    println("Привет! Эта программа переводит введённое натуральное число в двоичную систему. Ничего сверхъестественного. Дерзайте ;)\n")
    while (true) {
        println("Введите натуральное число (введите 'exit' для выхода):")

        val input = readln().trim()

        if (input.equals("exit", ignoreCase = true)) {
            println("Программа завершена.")
            break
        }

        try {
            val number = input.toInt()

            if (number <= 0) {
                println("Ошибка: Введено не натуральное число. Пожалуйста, введите положительное целое число больше нуля.")
                println()
                continue
            }

            val binaryString = Integer.toBinaryString(number)

            println("Число $number в двоичной системе: $binaryString")

        } catch (e: NumberFormatException) {
            println("Ошибка: введено некорректное число. Пожалуйста, введите натуральное число.")
        }

        println()
    }
}
