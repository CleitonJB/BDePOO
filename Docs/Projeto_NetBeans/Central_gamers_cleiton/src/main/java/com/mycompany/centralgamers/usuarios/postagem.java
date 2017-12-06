/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.centralgamers.usuarios;

/**
 *
 * @author aluno
 */
public class postagem {

    /**
     * @return the cod_postagem
     */
    public int getCod_postagem() {
        return cod_postagem;
    }

    /**
     * @param cod_postagem the cod_postagem to set
     */
    public void setCod_postagem(int cod_postagem) {
        this.cod_postagem = cod_postagem;
    }

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
     * @return the cod_forum
     */
    public int getCod_forum() {
        return cod_forum;
    }

    /**
     * @param cod_forum the cod_forum to set
     */
    public void setCod_forum(int cod_forum) {
        this.cod_forum = cod_forum;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the conteudo
     */
    public String getConteudo() {
        return conteudo;
    }

    /**
     * @param conteudo the conteudo to set
     */
    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
    private int cod_postagem;
    private int cod_usuario;
    private int cod_forum;
    private String titulo;
    private String conteudo;
}
