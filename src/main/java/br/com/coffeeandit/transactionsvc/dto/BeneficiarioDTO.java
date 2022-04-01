package br.com.coffeeandit.transactionsvc.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import java.io.Serializable;


@Getter
@Setter
@ToString
public class BeneficiarioDTO implements Serializable {

    private static final long serialVersionUID = -4599083758664543337L;


    @NotNull(message = "Informar o CPF")
    private Long CPF;

    @NotNull(message = "Informar o codigo do banco de destino")
    private Long codigoBanco;

    @NotNull(message = "Informar a agência de destino")
    private String agencia;

    @NotNull(message = "Informar a conta de destino")
    private String conta;

    @NotNull(message = "Informar o nome do Favorecido")
    private String nomeFavorecido;
}
