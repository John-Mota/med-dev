package med.group.medicos;

import jakarta.validation.constraints.NotNull;
import med.group.endereco.DadosEndereco;

public record DadosAtualizacoesMedico(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco
    ) {
}
