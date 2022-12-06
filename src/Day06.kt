fun main() {
    fun part1(input: String, windowLength: Int = 4): Int {
        var slidingWindowEnd = windowLength
        var slidingWindowStart = 0

        while (input
                .substring(slidingWindowStart, slidingWindowEnd)
                .toCharArray()
                .distinct().size < windowLength) {
            slidingWindowStart++
            slidingWindowEnd++
        }

        return slidingWindowEnd
    }

    fun part2(input: String): Int {
        return part1(input, 14)
    }

    // test if implementation meets criteria from the description, like:
    check(part1("mjqjpqmgbljsphdztnvjfqwrcgsmlb") == 7)
    check(part1("bvwbjplbgvbhsrlpgdmjqwftvncz") == 5)
    check(part1("nppdvjthqldpwncqszvftbrmjlhg") == 6)
    check(part1("nznrnfrfntjfmvfwmzdfjlvtqnbhcprsg") == 10)
    check(part1("zcfzfwzzqfrljwzlrfnpqdbhtmscgvjw") == 11)

    //check(part2(testInput) == 45000)
    check(part2("mjqjpqmgbljsphdztnvjfqwrcgsmlb") == 19)
    check(part2("bvwbjplbgvbhsrlpgdmjqwftvncz") == 23)
    check(part2("nppdvjthqldpwncqszvftbrmjlhg") == 23)
    check(part2("nznrnfrfntjfmvfwmzdfjlvtqnbhcprsg") == 29)
    check(part2("zcfzfwzzqfrljwzlrfnpqdbhtmscgvjw") == 26)
    val input = readInput("Day06")
    println(part1(input[0]))
    println(part2(input[0]))
}
