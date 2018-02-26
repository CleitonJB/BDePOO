package com.mycompany.central_gamers;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author aluno
 */
public class forum {

    /**
     * @return the cod_comentario
     */
    public int getCodComentario() {
        return codComentario;
    }

    /**
     * @param cod_comentario the cod_comentario to set
     */
    public void setCodComentario(int codComentario) {
        this.codComentario = codComentario;
    }

    /**
     * @return the cod_forum
     */
    public int getCodForum() {
        return codForum;
    }

    /**
     * @param cod_forum the cod_forum to set
     */
    public void setCodForum(int codForum) {
        this.codForum = codForum;
    }

    /**
     * @return the cod_postagem
     */
    public int getCodPostagem() {
        return codPostagem;
    }

    /**
     * @param cod_postagem the cod_postagem to set
     */
    public void setCodPostagem(int codPostagem) {
        this.codPostagem = codPostagem;
    }

    /**
     * @return the cod_usuario
     */
    public int getCodUsuario() {
        return codUsuario;
    }

    /**
     * @param cod_usuario the cod_usuario to set
     */
    public void setCodUsuario(int codUsuario) {
        this.codUsuario = codUsuario;
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
     * @return the assunto
     */
    public String getAssunto() {
        return assunto;
    }

    /**
     * @param assunto the assunto to set
     */
    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }
    private int codForum;
    private int codPostagem;
    private int codComentario;
    private int codUsuario;
    private String titulo;
    private String assunto;
}
