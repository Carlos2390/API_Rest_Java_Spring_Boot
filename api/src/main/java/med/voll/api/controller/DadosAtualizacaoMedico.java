package med.voll.api.controller;

import jakarta.validation.constraints.NotNull;
import med.voll.api.endereco.DadosEndereco;

public record DadosAtualizacaoMedico(
    @NotNull
    long id,
    String nome,
    String telefone,
    DadosEndereco endereco) {
}
