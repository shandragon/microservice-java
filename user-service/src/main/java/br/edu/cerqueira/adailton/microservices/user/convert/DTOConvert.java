package br.edu.cerqueira.adailton.microservices.user.convert;

import br.edu.cerqueira.adailton.microservices.user.model.User;

import br.edu.cerqueira.adailton.microservices.dto.UserDTO;


public class DTOConvert {
    public static UserDTO convert(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setName(user.getName());
        userDTO.setCpf(user.getCpf());
        userDTO.setEmail(user.getEmail());
        userDTO.setCreatedAt(user.getCreatedAt());
        userDTO.setUpdatedAt(user.getUpdatedAt());
        return userDTO;
    }
}
