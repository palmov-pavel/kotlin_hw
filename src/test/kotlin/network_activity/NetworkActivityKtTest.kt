package network_activity

import org.junit.Test

import org.junit.Assert.*

class NetworkActivityKtTest {

    @Test
    // Проверка, что метод вернет  "... минуту назад"
    fun minutesToText_result1() {
        // arrange
        val activityTime = 60

        // act
        val result = MinutesToText(activityTime)

        // assert
        assertEquals("1 минуту назад", result)
    }

    @Test
    // Проверка, что метод вернет  "... минуты назад"
    fun minutesToText_result2() {
        // arrange
        val activityTime = 120

        // act
        val result = MinutesToText(activityTime)

        // assert
        assertEquals("2 минуты назад", result)
    }

    @Test
    // Проверка, что метод вернет  "... минут назад"
    fun minutesToText_result3() {
        // arrange
        val activityTime = 600

        // act
        val result = MinutesToText(activityTime)

        // assert
        assertEquals("10 минут назад", result)
    }

}