import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Primary_TaskKtTest {

    @Test
    fun should_ReturnCorrectAverage_When_HasCorrectLowerCaseCharacterInsideTheList(){
        val list: MutableList<String> = mutableListOf("a","b","b")
        assertEquals(0.3333333333333333, averageOfCharacterRepetition(`mutable list` = list))
    }

    @Test
    fun should_ReturnCorrectAverage_When_HasCorrectUpperCaseCharacterInsideTheList(){
        val list: MutableList<String> = mutableListOf("A","B","B")
        assertEquals(0.3333333333333333, averageOfCharacterRepetition(`mutable list` = list))
    }

    @Test
    fun should_ReturnMinus1_When_HasAnEmptyList(){
        val list: MutableList<String> = mutableListOf()
        assertEquals(-1.0, averageOfCharacterRepetition(`mutable list` = list))
    }

    @Test
    fun should_ReturnMinus1_When_HasNoCharacterInsideTheList(){
        val list: MutableList<String> = mutableListOf("Apple","3","Banana","2","Orange","4")
        assertEquals(-1.0, averageOfCharacterRepetition(`mutable list` = list))
    }

    @Test
    fun should_ReturnMinus1_When_HasAtLeastOneWrongCharacterInsideTheList(){
        val list: MutableList<String> = mutableListOf("a","b","c")
        assertEquals(-1.0, averageOfCharacterRepetition(`mutable list` = list))
    }
}