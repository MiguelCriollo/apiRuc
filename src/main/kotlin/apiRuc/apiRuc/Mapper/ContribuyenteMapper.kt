package apiRuc.apiRuc.Mapper

import apiRuc.apiRuc.Model.PersonLC
import apiRuc.apiRuc.Model.PersonRuc
import apiRuc.apiRuc.dto.Contribuyente

object ContribuyenteMapper {
    fun mapToContribuyente(listPersonRuc: List<PersonRuc>,listPersonLC: List<PersonLC>): List<Contribuyente>{
        val listContribuyentes:MutableList<Contribuyente> = mutableListOf()
        listPersonLC.forEach{
            listContribuyentes.add(Contribuyente(it.identification,it.name))
        }
        listPersonRuc.forEach{
            listContribuyentes.add(Contribuyente(it.numeroRuc,it.razonSocial))
        }
        return listContribuyentes
    }
}