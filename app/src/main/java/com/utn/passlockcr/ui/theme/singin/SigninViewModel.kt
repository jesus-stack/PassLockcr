package com.utn.passlockcr.ui.theme.singin

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.utn.passlockcr.data.ItemsRepository
import kotlinx.coroutines.launch

class SigninViewModel(private val itemsRepository: ItemsRepository) : ViewModel() {
    private val auth: FirebaseAuth = Firebase.auth
    private val _loading = MutableLiveData(false)

    fun signInWithEmailAndPassword(email: String, password:String, home:
        ()-> Unit)
            = viewModelScope.launch {
        try {
            auth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener { task->
                    if (task.isSuccessful){
                        Log.d("Inventario", "signInWithEmailAndPassword logueado")
                        home()
                    }
                    else{
                        Log.d("Inventario", "signInWithEmailAndPassword:${task.result.toString()}")
                    }
                }
        }
        catch (ex:Exception){
            Log.d("Inventario", "signInWithEmailAndPassword:${ex.message}")
        }
    }
    fun createUserWithEmailAndPassword(
        email: String,
        password: String,
        home: () -> Unit
    ){
        if (_loading.value == false){
            _loading.value = true
            auth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener { task->
                    if (task.isSuccessful){
                        home()
                    }
                    else{
                        Log.d("Inventario", "createUserWithEmailAndPassword:${task.result.toString()}")
                    }
                    _loading.value = false
                }
        }
    }
}
