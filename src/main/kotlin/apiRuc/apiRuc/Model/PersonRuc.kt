package apiRuc.apiRuc.Model

import jakarta.persistence.*

@Entity
@Table(name="datoscontribuyente")
class PersonRuc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numero_ruc")
    var numeroRuc: String? = null;
    @Column(name = "razon_social")
    var razonSocial: String? = null;
}