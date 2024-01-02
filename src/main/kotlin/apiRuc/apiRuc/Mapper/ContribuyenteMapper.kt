package apiRuc.apiRuc.Mapper

import apiRuc.apiRuc.Model.PersonLC
import apiRuc.apiRuc.Model.PersonRuc
import apiRuc.apiRuc.dto.Contribuyente

object ContribuyenteMapper {
    fun mapToContribuyente(listPersonRuc: List<PersonRuc>,listPersonLC: List<PersonLC>): List<Contribuyente>{
        val listContribuyentes:MutableList<Contribuyente> = mutableListOf()
        listPersonLC.forEach{
            listContribuyentes.add(Contribuyente(it.name,it.identification))
        }
        listPersonRuc.forEach{
            listContribuyentes.add(Contribuyente(it.razonSocial,it.numeroRuc))
        }
        return listContribuyentes
    }
}