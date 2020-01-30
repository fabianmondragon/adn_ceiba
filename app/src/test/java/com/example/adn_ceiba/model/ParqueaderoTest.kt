package com.example.adn_ceiba.model

import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.core.IsEqual.equalTo
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class ParqueaderoTest {
    lateinit var parqueadero: Parqueadero

    @Before
    fun config(){
        parqueadero = Parqueadero()
    }

    @Test
    fun calcuateCost(){
        assertThat(0.0, `is`(equalTo(parqueadero.calcuateCost())))
    }

    @Test
    fun validateParking() {
    }

    @Test
    fun freeParking() {
    }

    @Test
    fun thereIsParking() {
    }

    @Test
    fun setParking() {
    }
}