package com.kotlin.mvc_demo.controller

import android.content.Context
import android.util.Log
import com.kotlin.mvc_demo.model.PixabayResponseDO
import com.kotlin.mvc_demo.view.ImagesActivity
import com.kotlin.mvc_demo.webservices.ApiClient
import com.kotlin.mvc_demo.webservices.ApiInterface
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ImageListPresenter(var context: Context, var view: ImagesActivity) {

    fun fetchImages() {

        val apiService = ApiClient.client!!.create(ApiInterface::class.java)
        val call = apiService.getImages(
            "13745654-0d7421681193bbdba054b8959",
            "flowers",
            true,
            100,
            1
        )

        call.enqueue(object : Callback<PixabayResponseDO> {
            override fun onResponse(
                call: Call<PixabayResponseDO>,
                response: Response<PixabayResponseDO>
            ) {
                response.body()?.getImages()?.let { view.setValues(it) }
                Log.e("Result", response.body()?.getImages()?.size.toString())

            }

            override fun onFailure(call: Call<PixabayResponseDO>, t: Throwable) {
            }
        })
    }
}