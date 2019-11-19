package ch.acme.car.client

import ch.acme.car.dto.CarDto
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping

@FeignClient("simple-rest-service-2")
@RequestMapping("/reseller")
interface ResellerClient {

    @GetMapping("/get-car/{brand}/{color}")
    fun getCar(@PathVariable brand: String, @PathVariable color: String): CarDto
}
