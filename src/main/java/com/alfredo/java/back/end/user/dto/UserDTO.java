package com.alfredo.java.back.end.user.dto;



import java.util.Date;

import com.alfredo.java.back.end.user.model.User;





public class UserDTO {

        private String nome;
        private String cpf;
        private String endereco;
        private String email;
        private String telefone;
        private Date dataCadastro;




        public String getNome() {
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
        public String getCpf() {
            return cpf;
        }
        public void setCpf(String cpf) {
            this.cpf = cpf;
        }
        public String getEndereco() {
            return endereco;
        }
        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }
        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        public void setTelefone(String telefone) {
            this.telefone = telefone;
        }
        public String getTelefone() {
            return telefone;
        }
        public Date getDataCadastro() {
            return dataCadastro;
        }
        public void setDataCadastro(Date dataCadastro) {
            this.dataCadastro = dataCadastro;
        }

        @Override
        public String toString() {
            return "UserDTO{" +
                    "nome='" + nome + '\'' +
                    ", cpf='" + cpf + '\'' +
                    ", endereco='" + endereco + '\'' +
                    ", email='" + email + '\'' +
                    ", telefone='" + telefone + '\'' +
                    ", dataCadastro=" + dataCadastro +
                    '}';
        }
        
        //Metodo para converter instancia da classe UserDTO para
        // instancia da entidade User
        public static UserDTO convert(User user) {
            UserDTO userDTO = new UserDTO();
            userDTO.setNome(user.getNome());
            userDTO.setEndereco(user.getEndereco());
            userDTO.setCpf(user.getCpf());
            userDTO.setEmail(user.getEmail());
            userDTO.setTelefone(user.getTelefone());
            userDTO.setDataCadastro(user.getDataCadastro());
            return userDTO;
           }

        

           

        


}
