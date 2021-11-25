package com.ad.grupo10.gestionbarrial.model

import com.google.gson.annotations.SerializedName

class Usuario (
    @SerializedName("usuario")
    val usuario: String,
    @SerializedName("password")
    val password: String
    )