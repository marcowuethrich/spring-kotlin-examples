package ch.acme.supplier.dto

import java.util.*

data class CarDto(val id: UUID = UUID.randomUUID(), val color: String, val brand: String)
