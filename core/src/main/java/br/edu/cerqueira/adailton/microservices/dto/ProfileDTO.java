package br.edu.cerqueira.adailton.microservices.dto;

import java.util.UUID;

public class ProfileDTO {

    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
