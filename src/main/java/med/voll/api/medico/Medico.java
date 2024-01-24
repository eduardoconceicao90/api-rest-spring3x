package med.voll.api.medico;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import med.voll.api.endereco.Endereco;
import med.voll.api.medico.enums.Especialidade;

@Data
@EqualsAndHashCode(of = "id")
@Table(name = "medicos")
@Entity
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String crm;

    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;

    @Embedded
    private Endereco endereco;

    public Medico(DadosCadastroMedico dados) {
        this.nome = dados.nome();
        this.email = dados.email();
        this.crm = dados.crm();
        this.especialidade = dados.especialidade();
        this.endereco = new Endereco(dados.endereco());
    }
}
