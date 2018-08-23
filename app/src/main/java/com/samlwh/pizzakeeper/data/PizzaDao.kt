package com.samlwh.pizzakeeper.data

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query

@Dao
interface PizzaDao {
    @Query( value = "select * from pizza")
    fun getAll(): LiveData<List<Pizza>>

    @Query( value = "select * from pizza where id =:id")
    fun getPizzaById(id : Int): Pizza

    @Insert
    fun insert(pizza: Pizza): Long

    @Query(value = "delete from pizza where id =:id")
    fun deletePizzaById(id : Int)
}