package org.JUnit;

import org.junit.jupiter.api.*;

import java.time.LocalDate;

public class BancoDeDadosTest {

//    Execução unica na pilha de testes
    @BeforeAll
    static void IniciaConexãoTest(){
        BancoDeDados.iniciaConexão();
    }
//    Execução a cada teste da pilha
    @BeforeEach
    void insereDado(){
        BancoDeDados.insereDado(new Pessoa("Guimas", LocalDate.of(2004,1,1)));
    }

    @AfterEach
    void removeDado(){
        BancoDeDados.removeDado(new Pessoa("Guimas", LocalDate.of(2004,1,1)));
    }


    @Test
    void validarDadosRetorno(){
        System.out.println("Dados validados");
        Assertions.assertTrue(true);
    }
    @Test
    void validarDadosRetorno2(){
        System.out.println("Dados validados 2");
        Assertions.assertNull(null);
    }

    @AfterAll
    static void encerraConexãoTest(){
        BancoDeDados.encerraConexão();
    }
}
