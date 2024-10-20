package com.alfredo.java.back.end.user.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alfredo.java.back.end.user.dto.UserDTO;
import com.alfredo.java.back.end.user.model.User;
import com.alfredo.java.back.end.user.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    //chama o findAll do UserRepository que retorna uma lista de 
    //usuarios, sendo instancia da entidade User.



    public List <UserDTO> getAll(){
        List <User> usuarios=userRepository.findAll();
        return usuarios
            .stream()
            .map(UserDTO::convert)
            .collect(Collectors.toList());
        
    }
    // Procura o user pelo Id
    public UserDTO findById(long userId){

        Optional <User> usuario= userRepository.findById(userId);
        if (usuario.isPresent()) {
            return UserDTO.convert(usuario.get());
            
        }
        return null;


    }
    
    //salva o user
    public UserDTO save(UserDTO userDTO){
        User user = userRepository.save(User.convert(userDTO));
        return UserDTO.convert(user);


    }


    // Exclui o user
    public UserDTO delete(long userID){
        Optional <User> user = userRepository.findById(userID);
        if (user.isPresent()) {
            userRepository.delete(user.get());
        }
        return null;


    }

    //Procura o user pelo Cpf
    public UserDTO findByCpf(String cpf) {
        User user = userRepository.findByCpf(cpf);
        if (user != null) {
        return UserDTO.convert(user);
        }
        return null;
       }

       // Pesquisa o user pelas strings que serao digitadas
       public List<UserDTO> queryByName(String name) {
        List<User> usuarios = userRepository.queryByNomeLike(name);
        return usuarios
        .stream()
        .map(UserDTO::convert)
        .collect(Collectors.toList()); 
       }
       



}
