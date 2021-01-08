package com.example.devintensive.models

import com.example.devintensive.Utils.Utils
import java.util.*

class User(
    val id:Int,
    var firstName:String?,
    var lastName:String?,
    var avatar:String?,
    var rating:Int = 0,
    var respect:Int = 0,
    val lastVisit:Date? = null,
    val isOnline:Boolean = false
) {

    var introBit:String = "$firstName $lastName"

    constructor(id:Int, firstName: String?, lastName: String?) : this(
        id = id,
        firstName = firstName,
        lastName = lastName,
        avatar = null
    )

    constructor(id: Int) : this(id, firstName = "John", lastName = "Doe")

    init {

    }

    fun printMe() = println("""
            id: $id
            firstName: $firstName
            lastName: $lastName
            avatar: $avatar
            rating: $rating
            respect: $respect
            lastVisit: $lastVisit
            isOnline: $isOnline
        """.trimIndent())

    companion object Factory {
        private var lastId = -1
        fun makeUser(fullName: String?) : User {
            lastId++

            val (firstName, lastName) = Utils.parseFullName(fullName)

            return User(id = lastId, firstName = firstName, lastName = lastName)
        }

    }

}