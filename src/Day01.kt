fun main() {
    fun part1(input: List<String>): Int {
        val values = arrayListOf<Int>(0)
        input.forEach {
            if (it.isEmpty()) {
                values.add(0)
            } else {
                values[values.lastIndex] = values.last() + Integer.parseInt(it)
            }
        }


        return values.max()
    }

    fun part2(input: List<String>): Int {
        val values = arrayListOf<Int>(0)
        input.forEach {
            if (it.isEmpty()) {
                values.add(0)
            } else {
                values[values.lastIndex] = values.last() + Integer.parseInt(it)
            }
        }

        return values.sorted().takeLast(3).sum()
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day01_test")
    check(part1(testInput) == 24000)
    check(part2(testInput) == 45000)

    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))
}
