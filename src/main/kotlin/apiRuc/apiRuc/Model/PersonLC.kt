package apiRuc.apiRuc.Model

import jakarta.persistence.*

@Entity
@Table(name="listas_control")
class PersonLC {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lic_codigo")
    var code: Long? = null;

    @Column(name = "lic_identificacion")
    var identification:String="N/A";

    @Column(name = "lic_apellido")
    var tipoLista:String="N/A";

    @Column(name = "lic_nombre")
    var name:String="N/A";

}