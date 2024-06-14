package org.JUnit;

import java.util.logging.Logger;

public class BancoDeDados {

    private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());

    public static void iniciaConexão(){
        // inicia a conexão
        LOGGER.info("iniciou a conexão");
    }

    public static void encerraConexão(){
        // encerra a conexão
        LOGGER.info("encerrou a conexão");
    }

    public static void insereDado( Pessoa pessoa){
        // insere a pessoa
        LOGGER.info("Dado inserido");
    }

    public static void removeDado(Pessoa pessoa){
        // remove a pessoa
        LOGGER.info("Dado removido");
    }
}
