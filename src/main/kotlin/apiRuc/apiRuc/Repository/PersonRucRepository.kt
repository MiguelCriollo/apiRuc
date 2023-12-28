package apiRuc.apiRuc.Repository

import apiRuc.apiRuc.Model.PersonRuc
import org.springframework.data.jpa.repository.JpaRepository

interface PersonRucRepository: JpaRepository<PersonRuc, String?>{
    fun findById(numeroRuc:String?):PersonRuc?

    fun findByRazonSocial(razonSocial:String?):PersonRuc?
}