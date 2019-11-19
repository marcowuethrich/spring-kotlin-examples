package ch.acme.supplier.contoller

import ch.acme.supplier.dto.CarDto
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.websocket.server.PathParam

@RequestMapping("/supplier")
@RestController
class SupplierController {

    @GetMapping("/buy-car/{brand}/{color}")
    fun buyCar(@PathVariable brand: String, @PathVariable color: String)
            = CarDto(brand = brand.toLowerCase().capitalize(), color = color.toLowerCase().capitalize())

}
