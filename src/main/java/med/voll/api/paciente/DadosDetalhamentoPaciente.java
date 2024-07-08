package med.voll.api.paciente;

import jakarta.persistence.Embedded;
import med.voll.api.endereco.Endereco;

public record DadosDetalhamentoPaciente(String nome,
                                        String email,
                                        String cpf,
                                        String telefone,
                                        Endereco endereco) {

    public DadosDetalhamentoPaciente(Paciente paciente){
        this(paciente.getNome(), paciente.getEmail(), paciente.getCpf(), paciente.getTelefone(), paciente.getEndereco());
    }

}
