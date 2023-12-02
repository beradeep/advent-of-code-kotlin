import kotlin.math.max

fun main() {
    val r = 12
    val g = 13
    val b = 14
    fun part1(input: List<String>): Int {
        var sum = 0
        val pattern = Regex("[0-9]+")
        for (str in input) {
            var bool = true
            val s = str.substringAfter(":")
            val list = s.split(";", ",")
            for (color in list) {
                val match = pattern.find(color)?.value!!.toInt()
                if (color.contains("red") && match > r) {
                    bool = false
                }
                if (color.contains("blue") && match > b) {
                    bool = false
                }
                if (color.contains("green") && match > g) {
                    bool = false
                }
            }
            if (bool) sum += pattern.find(str)?.value!!.toInt()
            sum.println()
        }
        return sum
    }

    fun part2(input: List<String>): Int {
        var sum = 0
        val pattern = Regex("[0-9]+")
        for (str in input) {
            var red = 0
            var blue = 0
            var green = 0
            val s = str.substringAfter(":")
            val list = s.split(";", ",")
            for (color in list) {
                val match = pattern.find(color)?.value!!.toInt()
                if (color.contains("red")) {
                    red = max(red, match)
                }
                if (color.contains("blue")) {
                    blue = max(blue, match)
                }
                if (color.contains("green")) {
                    green = max(green, match)
                }
            }
            sum += red * blue * green
            sum.println()
        }
        return sum
    }

    val input = readInput("Day02")
    part1(input).println()
    part2(input).println()
}