package ch.acme.car.dto

import java.util.*

data class CarDto(val id: UUID = UUID.randomUUID(), val color: String, val brand: String)
