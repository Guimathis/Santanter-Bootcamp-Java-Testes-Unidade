package org.JUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayTest {

    int[] array1 = {10, 20, 50, 20, 40};
    int[] array2 = {10, 20, 50, 20, 40};

    @Test
    void testarIgualdade(){
//        Testar se os arrays são iguais
        assertArrayEquals(array1, array2);

    }
    @Test
    void testarNaoIgualdade(){
//        Testar se os arrays são diferentes
        assertNotEquals(array1, array2);
    }

    @Test
    void validarSeObjetoEstaNulo(){
        Pessoa pessoa = null;
        assertNull(pessoa);
        pessoa = new Pessoa("Guimas", LocalDate.now());
        assertNotNull(pessoa);
    }
}
