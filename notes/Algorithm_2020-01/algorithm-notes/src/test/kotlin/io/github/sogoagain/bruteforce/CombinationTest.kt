package io.github.sogoagain.bruteforce

import assertk.assertThat
import assertk.assertions.isIn
import org.junit.Test

class CombinationTest {
    @Test
    fun pickMFromN() {
        // given, when
        val result = Combination.pickMFromN(5, 2)

        // assert
        assertThat(result).isIn(
            listOf(
                listOf(1, 2),
                listOf(1, 3),
                listOf(1, 4),
                listOf(1, 5),
                listOf(2, 3),
                listOf(2, 4),
                listOf(2, 5),
                listOf(3, 4),
                listOf(3, 5),
                listOf(4, 5)
            )
        )
    }
}