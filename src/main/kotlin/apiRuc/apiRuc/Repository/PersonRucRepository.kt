package apiRuc.apiRuc.Repository

import apiRuc.apiRuc.Model.PersonRuc
import org.springframework.data.jpa.repository.JpaRepository

interface PersonRucRepository: JpaRepository<PersonRuc, String?>{
    fun findByNumeroRuc(numeroRuc:String):List<PersonRuc>

    fun findByRazonSocial(razonSocial:String):List<PersonRuc>
}