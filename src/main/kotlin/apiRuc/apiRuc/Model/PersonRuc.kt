package apiRuc.apiRuc.Model

import jakarta.persistence.*

@Entity
@Table(name="datoscontribuyente")
class PersonRuc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null;
    @Column(name = "numero_ruc")
    var numeroRuc: String = "N/A";
    @Column(name = "razon_social")
    var razonSocial: String = "N/A";
    @Column(name = "numero_establecimiento")
    var numEstablecimiento: String="N/A";
}