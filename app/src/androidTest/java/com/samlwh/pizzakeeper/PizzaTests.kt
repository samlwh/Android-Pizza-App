package com.samlwh.pizzakeeper

import android.arch.persistence.room.Room
import android.support.test.InstrumentationRegistry
import android.support.test.runner.AndroidJUnit4
import com.samlwh.pizzakeeper.data.Pizza
import com.samlwh.pizzakeeper.data.PizzaDatabase

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import java.util.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class PizzaTests {



    val testPizza = Pizza(0,  "Hawaiian", Date())
    val testToppingIds = listOf(1,7)



    @Test
    fun useAppContext() {
        // Context of the app under test.

        //Adding Pizza
        val appContext = InstrumentationRegistry.getTargetContext()
        val db = Room.databaseBuilder(appContext, PizzaDatabase::class.java, "PizzaDatabase").build()
        
        //clear our database before start the test
        db.clearAllTables()
        db.pizzaDao().insert(testPizza)
        val returnedPizza = db.pizzaDao().getPizzaById(testPizza.id)
        assertEquals(testPizza, returnedPizza)


    }
}
