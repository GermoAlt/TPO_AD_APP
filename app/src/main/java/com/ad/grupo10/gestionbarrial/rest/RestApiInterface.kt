package com.ad.grupo10.gestionbarrial.rest

import com.ad.grupo10.gestionbarrial.model.Denuncia
import com.ad.grupo10.gestionbarrial.model.Notificacion
import com.ad.grupo10.gestionbarrial.model.Reclamo
import com.ad.grupo10.gestionbarrial.model.Usuario
import retrofit2.Call
import retrofit2.http.*

interface RestApiInterface {

    /*LOGIN-----------------------------*/
    @POST("login")
    fun loginVecino(@Body user: Usuario) : Call<Usuario>

    @POST("recupero/{mail}")
    fun recuperarUsuario(@Path("mail") mail: String)

    @POST("login/registro")
    fun registrarUsuario(@Body usuario: Usuario)

    @POST("loginInspector")
    fun loginInspector(@Body user: Usuario) : Call<Usuario>

    /*VECINOS---------------------------*/
    @GET("vecinos/listar/{page}")
    fun getVecinos(@Path("page") nroPage: Int) : Call<List<Usuario>>

    /*PERFIL----------------------------*/
    @GET("perfil/{id}")
    fun getPerfil(@Path("id") id: Int) : Call<Usuario>

    @PUT("perfil/modificar")
    fun modificarPerfil(@Body usuario: Usuario)

    /*NOTIFICACIONES--------------------*/
    @GET("notificaciones/{id}")
    fun getNotificaciones(@Path("id") id: Int) : Call<List<Notificacion>>

    /*RECLAMOS--------------------------*/
    @GET("reclamos/categorias/listar")
    fun getCategoriasReclamos(): Call<List<String>>

    @GET("reclamos/{page}")
    fun getReclamos(@Path("page") nroPage: Int) : Call<List<Reclamo>>

    @GET("reclamos/{id}/{page}")
    fun getMisReclamos(@Path("id")id: Int, @Path("page")nroPage: Int): Call<List<Reclamo>>

    /*DENUNCIAS--------------------------*/
    @GET("denuncias/listar/{id}")
    fun getMisDenuncias(@Path("id")id: String) : Call<List<Denuncia>>

    @GET("denuncias/{id}")
    fun getDenuncia(@Path("id") id: String) : Call<Denuncia>

    @GET("denuncias/listar")
    fun getDenuncias(): Call<List<Denuncia>>

    @POST("denuncias/nueva")
    fun crearDenuncia(@Body denuncia: Denuncia)

    @GET("denuncias/recibidas/{id}")
    fun getDenunciasRecibidas(@Path("id")id: String)

    @PUT("denuncias/modificar")
    fun modificarDenuncia(@Body denuncia: Denuncia)

}