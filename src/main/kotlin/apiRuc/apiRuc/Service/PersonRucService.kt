package apiRuc.apiRuc.Service

import apiRuc.apiRuc.Mapper.ContribuyenteMapper
import apiRuc.apiRuc.Model.PersonRuc
import apiRuc.apiRuc.Repository.PersonLCRepository
import apiRuc.apiRuc.Repository.PersonRucRepository
import apiRuc.apiRuc.dto.Contribuyente
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class PersonRucService {
    @Autowired
    lateinit var personRucRepository: PersonRucRepository
    @Autowired
    lateinit var personLCRepository: PersonLCRepository


    fun list(numeroRuc:String): List<Contribuyente> {
        var listPersonRuc=personRucRepository.findByNumeroRuc(numeroRuc);
        var listPersonLC=personLCRepository.findByIdentification(numeroRuc);

        return ContribuyenteMapper.mapToContribuyente(listPersonRuc,listPersonLC);
    }

    fun listName(razonSocial:String): List<Contribuyente> {
        var listPersonRuc=personRucRepository.findByRazonSocial(razonSocial);
        var listPersonLC=personLCRepository.findByName(razonSocial);

        return ContribuyenteMapper.mapToContribuyente(listPersonRuc,listPersonLC);
    }
}