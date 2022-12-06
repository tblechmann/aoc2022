fun main() {
    fun part1(input: List<String>): Int {
        val scores = mapOf(
            "A X" to 3 + 1,
            "A Y" to 6 + 2,
            "A Z" to 0 + 3,
            "B X" to 0 + 1,
            "B Y" to 3 + 2,
            "B Z" to 6 + 3,
            "C X" to 6 + 1,
            "C Y" to 0 + 2,
            "C Z" to 3 + 3,
        )
        return input.map { scores[it] }.sumOf { it!! }
    }

    fun part2(input: List<String>): Int {
        val scores = mapOf(
            "A X" to 0 + 3, /* Rock - Scissor */
            "A Y" to 3 + 1, /* Rock - Rock */
            "A Z" to 6 + 2, /* Rock - Paper */
            "B X" to 0 + 1, /* Paper - Rock */
            "B Y" to 3 + 2, /* Paper - Paper */
            "B Z" to 6 + 3, /* Paper - Scissor */
            "C X" to 0 + 2, /* Scissor - Paper */
            "C Y" to 3 + 3, /* Scissor - Scissor */
            "C Z" to 6 + 1, /* Scissor - Rock */
        )
        return input.map { scores[it] }.sumOf { it!! }
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day02_test")
    check(part1(testInput) == 15)
    check(part2(testInput) == 12)

    val input = readInput("Day02")
    println(part1(input))
    println(part2(input))
}
