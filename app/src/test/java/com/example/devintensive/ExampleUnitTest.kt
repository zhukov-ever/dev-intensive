package com.example.devintensive

import com.example.devintensive.models.User
import org.junit.Test

import org.junit.Assert.*
import java.util.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun test_instance() {
        val user = User(1)
//        val user2 = User("2", "John", "Kek")
//        val user3 = User("3", "John", "Wick", null, lastVisit = Date(), isOnline = true)

        user.printMe()
//        user2.printMe()
//        user3.printMe()

    }

    @Test
    fun test_factory() {
        val user1 = User.makeUser("Jogn Sin")
        val user2 = User.makeUser("Jogn Sin")
        val user3 = User.makeUser(null)

        user1.printMe()
    }

}