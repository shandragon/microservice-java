package br.edu.cerqueira.adailton.microservices.dto;

import org.hibernate.validator.constraints.br.CPF;

public class ProfileDTO {

    @CPF
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
