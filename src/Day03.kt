fun main() {
    fun part1(input: List<String>): Int {

        return input.sumOf { rucksack ->
            val leftDistinct = rucksack.take(rucksack.length / 2).toCharArray().distinct()
            val rightDistinct = rucksack.takeLast(rucksack.length / 2).toCharArray().distinct()
            val merged = leftDistinct + rightDistinct
            val mergedDistinct = merged.distinct().toMutableList().apply { add('#') }
            val difference = merged.zip(mergedDistinct).map { it.first.code - it.second.code }

            val char = difference.indexOfFirst { it != 0 }.let { merged[it!!] }
            val charValue = (char.lowercaseChar() - 'a' + 1) + (if (char.isUpperCase()) 26 else 0)
            charValue
        }

    }

    fun part2(input: List<String>): Int {
        val result = input.windowed(3, 3).sumOf { group ->
            val distinctValues = group.map { it.toCharArray().distinct() }
            val merged = distinctValues[0] + distinctValues[1] + distinctValues[2]
            val charCounter = Array<Int>(26 * 2) { 0 }
            merged.forEach {
                charCounter[(it.lowercaseChar() - 'a') + (if (it.isUpperCase()) 26 else 0)]++
            }
            val charValue = charCounter.indexOfFirst { it == 3 } + 1
            charValue
        }
        return result
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day03_test")
    check(part1(testInput) == 157)
    check(part2(testInput) == 70)

    val input = readInput("Day03")
    println(part1(input))
    println(part2(input))
}
