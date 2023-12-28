package apiRuc.apiRuc.Service

import apiRuc.apiRuc.Model.PersonRuc
import apiRuc.apiRuc.Repository.PersonRucRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class PersonRucService {
    @Autowired
    lateinit var personRucRepository: PersonRucRepository

    fun list(numeroRuc:String): List<PersonRuc> {
        var hello=personRucRepository.findByNumeroRuc(numeroRuc);
        return hello;
    }

    fun listName(razonSocial:String): List<PersonRuc>? {
        return personRucRepository.findByRazonSocial(razonSocial);
    }
}