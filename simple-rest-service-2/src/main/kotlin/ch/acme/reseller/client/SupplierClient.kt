package ch.acme.reseller.client

import ch.acme.reseller.dto.CarDto
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping

@FeignClient("simple-rest-service-3")
@RequestMapping("/supplier")
interface SupplierClient {

    @GetMapping("/buy-car/{brand}/{color}")
    fun buyCar(@PathVariable brand: String, @PathVariable color: String): CarDto
}
