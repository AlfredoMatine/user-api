package com.alfredo.java.back.end.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.alfredo.java.back.end.user.dto.UserDTO;
import com.alfredo.java.back.end.user.service.UserService;

import jakarta.annotation.PostConstruct;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class UserController {


    @Autowired
    private UserService userService;   
    public static List<UserDTO> usuarios = new ArrayList<UserDTO>();

    @PostConstruct
    public void initiateList() {
        UserDTO userDTO = new UserDTO();
        userDTO.setNome("Eduardo");
        userDTO.setCpf("123");
        userDTO.setEndereco("Rua A");
        userDTO.setEmail("eduar@email.com");
        userDTO.setTelefone("123-3454");
        userDTO.setDataCadastro(new Date());

        UserDTO userDTO2 = new UserDTO();
        userDTO2.setNome("Filipe");
        userDTO2.setCpf("345");
        userDTO2.setEndereco("Rua B");
        userDTO2.setEmail("filipe@email.com");
        userDTO2.setTelefone("123-6543");
        userDTO2.setDataCadastro(new Date());

        UserDTO userDTO3 = new UserDTO();
        userDTO3.setNome("Paulo");
        userDTO3.setCpf("987");
        userDTO3.setEndereco("Rua C");
        userDTO3.setEmail("paulo@email.com");
        userDTO3.setTelefone("231-516");
        userDTO3.setDataCadastro(new Date());

        usuarios.add(userDTO);
        usuarios.add(userDTO2);
        usuarios.add(userDTO3);
    }

    //Metodo que Retorna a lista de usuarios
    @GetMapping("/user")
    public List<UserDTO> getUser() { 
        List<UserDTO> usuarios = userService.getAll();
        return usuarios;
    }

    //Metodo que busca o usuario pelo Id
     
    @GetMapping("/user/{id}")
    UserDTO findById(@PathVariable Long id) {
        return userService.findById(id);
    }
 

    //metodo que busca o usuario por CPF
   @GetMapping("/user/cpf/{cpf}")
   UserDTO findByCpf (@PathVariable String cpf){

        return userService.findByCpf(cpf);
   }
    //Salvar/ inserir um novo usuario na lista de usuarios

    @PostMapping("/user")
    UserDTO newUser(@RequestBody UserDTO userDTO) {

        return userService.save(userDTO);
    }

    

    //Exluir um usuario pelo id

    @DeleteMapping("/user/{id}")
    UserDTO delete (@PathVariable Long id){

        return userService.delete(id);
    }

    @GetMapping("/user/search")
    public List<UserDTO> queryByName(
        @RequestParam(name="nome", required = true)
        String nome) {
        return userService.queryByName(nome);
    }
    
    
}



