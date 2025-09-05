package com.example.simplechat2

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform