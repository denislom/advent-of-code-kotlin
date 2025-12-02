fun main() {
    fun part1(input: List<String>): Int {
        var dial = 50
        var count = 0

        input.forEach { line ->
            val dir = line[0]
            val dist = line.drop(1).toInt()

            dial = when (dir) {
                'L' -> dial - dist
                'R' -> dial + dist
                else -> error("Invalid direction: $dir")
            }

            dial = ((dial % 100) + 100) % 100

            if (dial == 0) count++
        }
        return count
    }

    fun part2(input: List<String>): Int {
        return input.size
    }



    // Read the input from the `src/Day01.txt` file.
    val input = readInput("../input/day01")
    println(input)
    part1(input).println()
//    part2(input).println()
//    println("The result of part 1 is: ${part1(input)}")

}


// Test if implementation meets criteria from the description, like:
//    check(part1(listOf("test_input")) == 1)

// Or read a large test input from the `src/Day01_test.txt` file:
//    val testInput = readInput("Day01_test")
//    check(part1(testInput) == 1)