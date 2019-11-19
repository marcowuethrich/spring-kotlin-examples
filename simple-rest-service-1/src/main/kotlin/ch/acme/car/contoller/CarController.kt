package ch.acme.car.contoller

import ch.acme.car.client.ResellerClient
import ch.acme.car.dto.CarDto
import mu.KotlinLogging
import org.springframework.beans.factory.annotation.Value
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.web.bind.annotation.*

@RefreshScope
@RequestMapping("/cars")
@RestController
class CarController(
        private val resellerClient: ResellerClient
) {

    @Value("\${custom.cars.default.color}")
    lateinit var defaultColor: String;
    @Value("\${custom.cars.default.brand}")
    lateinit var defaultBrand: String;

    private val log = KotlinLogging.logger { CarController::class.java }

    @GetMapping("/build-default-car")
    fun buildRandomCar(): CarDto {
        val dto = CarDto(brand = defaultColor.toLowerCase().capitalize(), color = defaultBrand.toLowerCase().capitalize())
        log.info("Build new random Car: $dto")
        return dto;
    }

    @GetMapping("/build-new-car/{brand}/{color}")
    fun buildCar(@PathVariable brand: String, @PathVariable color: String) = resellerClient.getCar(brand, color)
}
