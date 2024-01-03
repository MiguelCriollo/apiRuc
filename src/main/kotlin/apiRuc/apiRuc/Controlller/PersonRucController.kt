package apiRuc.apiRuc.Controlller

import apiRuc.apiRuc.Service.PersonRucService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.DELETE])
@RequestMapping("/personRuc")
class PersonRucController {
    @Autowired
    lateinit var personRucService: PersonRucService

    @GetMapping("/{id}")
    fun list(@PathVariable("id")numeroRuc:String):ResponseEntity<*>{
        return ResponseEntity(personRucService.list(numeroRuc),HttpStatus.OK)
    }

    @GetMapping("/name/{name}")
    fun listName(@PathVariable("name")razonSocial:String):ResponseEntity<*>{
        return ResponseEntity(personRucService.listName(razonSocial),HttpStatus.OK)
    }
}