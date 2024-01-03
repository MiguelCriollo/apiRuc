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
        val response=personRucService.list(numeroRuc)
        val status= if (response.isEmpty()) "Sucess" else "No Data"
        return ResponseEntity.ok(mapOf("status" to status,"data" to response))
    }

    @GetMapping("/name/{name}")
    fun listName(@PathVariable("name")razonSocial:String):ResponseEntity<*>{
        val response=personRucService.listName(razonSocial)
        val status= if (response.isEmpty()) "Sucess" else "No Data"
        return ResponseEntity.ok(mapOf("status" to status,"data" to response))
    }
}