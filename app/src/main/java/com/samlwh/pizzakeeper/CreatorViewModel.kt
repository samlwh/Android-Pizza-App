package com.samlwh.pizzakeeper


import android.arch.lifecycle.ViewModel
import com.samlwh.pizzakeeper.data.Topping

class CreatorViewModel : ViewModel(){
    var pizzaName = "New Pizza"
    val switchStates = mutableMapOf<Topping, Boolean>()

}