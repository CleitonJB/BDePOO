/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.central_gamers;

import java.io.File;
import java.util.Date;

/**
 *
 * @author aluno
 */
public class Usuario {

    /**
     * @return the cod_usuario
     */
    public int getCod_usuario() {
        return cod_usuario;
    }

    /**
     * @param cod_usuario the cod_usuario to set
     */
    public void setCod_usuario(int cod_usuario) {
        this.cod_usuario = cod_usuario;
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the cpf
     */
    public int getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the rg
     */
    public int getRg() {
        return rg;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(int rg) {
        this.rg = rg;
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
     * @return the data_nascimento
     */
    public Date getData_nascimento() {
        return data_nascimento;
    }

    /**
     * @param data_nascimento the data_nascimento to set
     */
    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    /**
     * @return the foto
     */
    public File getFoto() {
        return foto;
    }

    /**
     * @param foto the foto to set
     */
    public void setFoto(File foto) {
        this.foto = foto;
    }

    /**
     * @return the cod_indicador
     */
    public int getCod_indicador() {
        return cod_indicador;
    }

    /**
     * @param cod_indicador the cod_indicador to set
     */
    public void setCod_indicador(int cod_indicador) {
        this.cod_indicador = cod_indicador;
    }

    /**
     * @return the administrador
     */
    public boolean isAdministrador() {
        return administrador;
    }

    /**
     * @param administrador the administrador to set
     */
    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }
    private int cod_usuario;
    private String login;
    private String senha;
    private int cpf;
    private int rg;
    private String email;
    private Date data_nascimento;
    private File foto;
    private int cod_indicador;
    private boolean administrador;
}
