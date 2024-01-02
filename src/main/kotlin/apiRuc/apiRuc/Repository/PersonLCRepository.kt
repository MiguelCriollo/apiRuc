package apiRuc.apiRuc.Repository

import apiRuc.apiRuc.Model.PersonLC
import apiRuc.apiRuc.Model.PersonRuc
import org.springframework.data.jpa.repository.JpaRepository

interface PersonLCRepository: JpaRepository<PersonLC, String?> {
    fun findByIdentification(identification:String):List<PersonLC>

    fun findByName(name: String):List<PersonLC>
}