package com.example.mvvmpattern.data.api

import com.example.mvvmpattern.data.model.User
import io.reactivex.Single


interface ApiService {

    fun getUsers(): Single<List<User>>


}