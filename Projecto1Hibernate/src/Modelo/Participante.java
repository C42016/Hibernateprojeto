/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Helpdesk_Izzy
 */
@Entity
@Table(name = "Participante")
public class Participante implements Serializable{
    @Id
    private long id;
    @Column
    private String nome;
    @Column
    private String departamento;
    @Column
    private String email;
    @Column
    private String telefone;

    public Participante() {
    }

    public Participante(long id, String nome, String departamento, String email, String telefone) {
        this.id = id;
        this.nome = nome;
        this.departamento = departamento;
        this.email = email;
        this.telefone = telefone;
    }

    
    
    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the departamento
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * @param departamento the departamento to set
     */
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Participante{" + "id=" + id + ", nome=" + nome + ", departamento=" + departamento + ", email=" + email + ", telefone=" + telefone + '}';
    }
    
    
   
}
