package br.edu.cerqueira.adailton.microservices.user.convert;

import br.edu.cerqueira.adailton.microservices.user.model.User;

import br.edu.cerqueira.adailton.microservices.dto.UserDTO;


public class DTOConvert {
    public static UserDTO convert(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setName(user.getName());
        userDTO.setCpf(user.getCpf());
        userDTO.setEmail(user.getEmail());
        userDTO.setPasswd(user.getPasswd());
        userDTO.setCreatedAt(user.getCreatedAt());
        return userDTO;
    }
}
