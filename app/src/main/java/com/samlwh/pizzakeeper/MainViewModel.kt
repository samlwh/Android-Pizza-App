package com.samlwh.pizzakeeper

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.ViewModel
import com.samlwh.pizzakeeper.data.Pizza

class MainViewModel :ViewModel(){
    private var pizzas: LiveData<List<Pizza>>? = null
    fun getPizzas(): LiveData<List<Pizza>> {
        if (pizzas == null) {
            pizzas = db.pizzaDao().getAll()
        }
        return pizzas!!
    }
}