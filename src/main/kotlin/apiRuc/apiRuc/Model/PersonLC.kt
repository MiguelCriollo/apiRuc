package apiRuc.apiRuc.Model

import jakarta.persistence.*

@Entity
@Table(name="listas_control")
class PersonLC {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo")
    var code: Long? = null;

    @Column(name = "lc_identificacion")
    var identification:String="N/A";

    @Column(name = "lc_tipo_lista")
    var tipoLista:String="N/A";

    @Column(name = "lc_nombres")
    var name:String="N/A";

}