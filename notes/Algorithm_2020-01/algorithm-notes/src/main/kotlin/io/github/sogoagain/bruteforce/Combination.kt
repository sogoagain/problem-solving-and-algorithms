package io.github.sogoagain.bruteforce

object Combination {
    fun pickMFromN(N: Int, M: Int): List<List<Int>> {
        val totalCombination: MutableList<List<Int>> = mutableListOf()
        val picked: MutableList<Int> = mutableListOf()

        pick(totalCombination, N, M, picked)

        return totalCombination
    }

    private fun pick(result: MutableList<List<Int>>, N: Int, M: Int, picked: MutableList<Int>) {
        if (M == 0) {
            result.add(picked.toList())
            return
        }

        val smallest = if (picked.isEmpty()) 1 else picked[picked.lastIndex] + 1

        for (next in smallest..N) {
            picked.add(next)
            pick(result, N, M - 1, picked)
            picked.removeAt(picked.lastIndex)
        }
    }
}