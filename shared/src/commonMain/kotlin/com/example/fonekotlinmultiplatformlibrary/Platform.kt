package com.example.fonekotlinmultiplatformlibrary

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform