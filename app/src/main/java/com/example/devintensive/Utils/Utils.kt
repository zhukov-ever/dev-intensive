package com.example.devintensive.Utils

object Utils {
    fun parseFullName(fullName: String?):Pair<String?, String?> {
        val parts: List<String>? = fullName?.split(" ")
        val firstName = parts?.getOrNull(0)
        val lastName = parts?.getOrNull(1)

        return firstName to lastName
    }
}