package com.samlwh.pizzakeeper.data

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query

@Dao
interface ToppingDao {

    @Query(value = "select * from topping")
    fun getAll(): List<Topping>

    @Query(value = "select * from topping where id =:id")
    fun getToppingById(id: Int): Topping

    @Insert
    fun insert(topping: Topping)
}