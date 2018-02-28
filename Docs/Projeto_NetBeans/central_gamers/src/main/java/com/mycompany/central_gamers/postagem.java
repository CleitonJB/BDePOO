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
public class postagem {

    /**
     * @return the codUsuario
     */
    public int getCodUsuario() {
        return codUsuario;
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
    public int getCod_usuario() {
        return getCodUsuario();
    }

    /**
     * @param cod_usuario the cod_usuario to set
     */
    public void setCodUsuario(int codUsuario) {
        this.codUsuario = codUsuario;
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
    private int codPostagem;
    private int codUsuario;
    private int codForum;
    private String titulo;
    private String conteudo;
}
