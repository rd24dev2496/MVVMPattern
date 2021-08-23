package com.example.mvvmpattern.data.repository

import com.example.mvvmpattern.data.api.ApiHelper
import com.example.mvvmpattern.data.model.User
import io.reactivex.Single


class MainRepository(private val apiHelper: ApiHelper) {

    fun getUsers(): Single<List<User>> {
        return apiHelper.getUsers()
    }

}