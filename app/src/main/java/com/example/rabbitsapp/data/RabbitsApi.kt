package com.example.rabbitsapp.data

import retrofit2.http.GET

interface RabbitsApi {

    @GET("/randomrabbit")
    suspend fun getRandomRabbit(): Rabbit

    companion object {
        private const val IP = "localhost" // please enter the IP address of your computer here
        const val BASE_URL = "http://$IP:8080"
    }

}