package com.devsuperior.demo.dto;

import com.devsuperior.demo.entities.Role;
import com.devsuperior.demo.entities.User;

import java.util.HashSet;
import java.util.Set;

public class UserDTO {

    private Long id;

    private String name;
    private String email;
    private String password;

    private Set<RoleDTO> roleDTOS = new HashSet<>();

    public UserDTO() {}

    public UserDTO(Long id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public UserDTO(User entity) {
        id = entity.getId();
        name = entity.getName();
        email = entity.getEmail();
        password = entity.getPassword();

        for (Role r : entity.getRoles()) {
            roleDTOS.add(new RoleDTO(r));
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<RoleDTO> getRoleDTOS() {
        return roleDTOS;
    }


}
