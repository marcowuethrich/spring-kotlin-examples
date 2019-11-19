package ch.acme.reseller.contoller

import ch.acme.reseller.client.SupplierClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/reseller")
@RestController
class ResellerController(
        private val supplierClient: SupplierClient
) {

    @GetMapping("/get-car/{brand}/{color}")
    fun getCar(@PathVariable brand: String, @PathVariable color: String) = supplierClient.buyCar(brand, color)

}
