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
public class comentario {

    /**
     * @return the cod_comentario
     */
    public int getCodComentario() {
        return codComentario;
    }

    /**
     * @param cod_comentario the cod_comentario to set
     */
    public void setCodComentario(int cod_comentario) {
        this.codComentario = cod_comentario;
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
    private int codComentario;
    private int codUsuario;
    private int codPostagem;
    private String conteudo;
}
