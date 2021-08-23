package com.example.mvvmpattern.data.api

import com.example.mvvmpattern.data.model.User
import com.rx2androidnetworking.Rx2AndroidNetworking
import io.reactivex.Single


class ApiServiceImpl : ApiService {

   /* override fun getUsers(): Single<List<User>> {
        return Rx2AndroidNetworking.get(" https://newsapi.org/v2/everything?q=keyword&apiKey=9a66cdfee3be400d91804e6bc3aa2a1c")
            .build()
            .getObjectListSingle(User::class.java)
    }*/

    override fun getUsers(): Single<List<User>> {
        return Rx2AndroidNetworking.get("https://5e510330f2c0d300147c034c.mockapi.io/users")
            .build()
            .getObjectListSingle(User::class.java)
    }
}
