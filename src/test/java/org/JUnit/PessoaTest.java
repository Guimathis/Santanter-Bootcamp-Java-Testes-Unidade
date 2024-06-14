package org.JUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTest {
    @Test
    void validarCalculoIdade(){
        Pessoa pessoa = new Pessoa("Guimas", LocalDate.of(2004,12,17));

        Assertions.assertEquals(19, pessoa.getIdade());
        Assertions.assertTrue(pessoa.ehMaiorDeidade());

    }
}
