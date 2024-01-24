package med.voll.api.medico;

import med.voll.api.endereco.DadosEndereco;
import med.voll.api.medico.enums.Especialidade;

public record DadosCadastroMedico(String nome, String email, String crm, Especialidade especialidade, DadosEndereco endereco) {
}
