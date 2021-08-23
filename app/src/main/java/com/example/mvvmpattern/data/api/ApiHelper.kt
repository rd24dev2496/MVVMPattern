package com.example.mvvmpattern.data.api


class ApiHelper(private val apiService: ApiService) {

    fun getUsers() = apiService.getUsers()

}