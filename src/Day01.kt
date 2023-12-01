fun main() {

    fun part1(input: List<String>): Int {
        var sum = 0

        for (str in input) {
            var num = 0
            var i = 0

            while (i <= str.length - 1) {
                val c = str[i]
                if (c in '0'..'9') {
                    num = c - '0'
                    break
                }
                i++
            }

            i = str.length - 1
            while (i >= 0) {
                val c = str[i]
                if (c in '0'..'9') {
                    num = num * 10 + (c - '0')
                    break
                }
                i--
            }

            sum += num
        }

        return sum
    }

    fun part2(input: List<String>): Int {

        var sum = 0

        for (str in input) {
            var num = 0
            var i = 0
            var b = false

            while (i <= str.length - 1) {
                val c = str[i]
                if (c in '0'..'9') {
                    num = c - '0'
                    break
                }
                for (j in 3 until str.length - i + 1) {
                    when (str.substring(i, i + j)) {
                        "zero" -> {
                            num = 0
                            b = true
                        }

                        "one" -> {
                            num = 1
                            b = true
                        }

                        "two" -> {
                            num = 2
                            b = true
                        }

                        "three" -> {
                            num = 3
                            b = true
                        }

                        "four" -> {
                            num = 4
                            b = true
                        }

                        "five" -> {
                            num = 5
                            b = true
                        }

                        "six" -> {
                            num = 6
                            b = true
                        }

                        "seven" -> {
                            num = 7
                            b = true
                        }

                        "eight" -> {
                            num = 8
                            b = true
                        }

                        "nine" -> {
                            num = 9
                            b = true
                        }
                    }
                    if (b) {
                        break
                    }
                }
                if (b) {
                    break
                }
                i++
            }

            i = str.length - 1
            b = false

            while (i >= 0) {
                val c = str[i]
                if (c in '0'..'9') {
                    num = num * 10 + (c - '0')
                    break
                }
                for (j in 3 until str.length - i + 1) {
                    when (str.substring(i, i + j)) {
                        "zero" -> {
                            num = num * 10 + 0
                            b = true
                        }

                        "one" -> {
                            num = num * 10 + 1
                            b = true
                        }

                        "two" -> {
                            num = num * 10 + 2
                            b = true
                        }

                        "three" -> {
                            num = num * 10 + 3
                            b = true
                        }

                        "four" -> {
                            num = num * 10 + 4
                            b = true
                        }

                        "five" -> {
                            num = num * 10 + 5
                            b = true
                        }

                        "six" -> {
                            num = num * 10 + 6
                            b = true
                        }

                        "seven" -> {
                            num = num * 10 + 7
                            b = true
                        }

                        "eight" -> {
                            num = num * 10 + 8
                            b = true
                        }

                        "nine" -> {
                            num = num * 10 + 9
                            b = true
                        }
                    }
                    if (b) {
                        break
                    }
                }
                if (b) {
                    break
                }
                i--
            }

            sum += num
        }

        return sum
    }

    val input = readInput("Day01")
    part1(input).println()
    part2(input).println()
}
