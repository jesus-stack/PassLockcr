package com.utn.passlockcr.data

import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity(tableName = "items")
data class Item(
    @PrimaryKey(autoGenerate = true)
    val id : Int,
    val correo: String,
    val contrasena: String,
    val descripcion: String,
)
