package myday

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDate
import java.time.format.DateTimeFormatter

@RestController
class Controller {

    @GetMapping("/")
    fun progDay(@RequestParam(value = "year", defaultValue = "dd/mm/YY") dataMessage: String): Myday {
        return Myday(200, getMyday(dataMessage))
    }

    fun getMyday(dataMessage: String): String {
        val year = dataMessage.toIntOrNull()

        return if (year is Int && 999 < year && year < 10000) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
                LocalDate.of(year, 9, 12).format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
            else
                LocalDate.of(year, 9, 13).format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
        } else
            "Input error"
    }


}