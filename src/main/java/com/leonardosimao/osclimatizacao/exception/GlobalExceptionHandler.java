package com.leonardosimao.osclimatizacao.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice // Diz ao Spring que esta classe cuida dos erros do projeto inteiro
public class GlobalExceptionHandler {

    @ExceptionHandler(EntidadeNaoEncontradaException.class)
    public ResponseEntity<Object> handleEntidadeNaoEncontrada(EntidadeNaoEncontradaException ex) {
        // Criamos um mapa para organizar os dados do erro em um JSON bonito
        Map<String, Object> corpoErro = new HashMap<>();
        corpoErro.put("timestamp", LocalDateTime.now());
        corpoErro.put("status", HttpStatus.NOT_FOUND.value());
        corpoErro.put("erro", "Recurso não encontrado");
        corpoErro.put("mensagem", ex.getMessage());

        // Retorna o JSON com o status HTTP 404 (Not Found)
        return new ResponseEntity<>(corpoErro, HttpStatus.NOT_FOUND);
    }
}