package com.leonardosimao.osclimatizacao.exception;

// Uma exceção simples que herda de RuntimeException
public class EntidadeNaoEncontradaException extends RuntimeException {
    public EntidadeNaoEncontradaException(String mensagem) {
        super(mensagem);
    }
}