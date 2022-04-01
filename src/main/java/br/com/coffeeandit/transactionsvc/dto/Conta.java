package br.com.coffeeandit.transactionsvc.dto;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Getter
@Setter
@ToString
public class Conta implements  Serializable{


    private static final long serialVersionUID = 3667962669030152948L;

    @NotNull(message = "Informar o codigo da Agência")
    private Long codigoAgencia;

    @NotNull(message = "Informar o codigo da conta.")
    private Long codigoConta;
}
