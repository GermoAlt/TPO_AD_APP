package com.ad.grupo10.gestionbarrial.rest

import com.ad.grupo10.gestionbarrial.model.Usuario
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class UsuarioController: Callback<List<Usuario>> {

    val BASE_URL: String = "localhost:8080/api/"

    override fun onResponse(call: Call<List<Usuario>>, response: Response<List<Usuario>>) {
        TODO("Not yet implemented")
    }

    override fun onFailure(call: Call<List<Usuario>>, t: Throwable) {
        t.printStackTrace()
    }
}