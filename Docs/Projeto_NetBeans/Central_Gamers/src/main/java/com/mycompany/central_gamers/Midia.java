/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.central_gamers;

/**
 *
 * @author aluno
 */
public class Midia {

    /**
     * @return the cod_midia
     */
    public int getCod_midia() {
        return cod_midia;
    }

    /**
     * @param cod_midia the cod_midia to set
     */
    public void setCod_midia(int cod_midia) {
        this.cod_midia = cod_midia;
    }

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
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the qualidade
     */
    public String getQualidade() {
        return qualidade;
    }

    /**
     * @param qualidade the qualidade to set
     */
    public void setQualidade(String qualidade) {
        this.qualidade = qualidade;
    }

    /**
     * @return the tamanho
     */
    public String getTamanho() {
        return tamanho;
    }

    /**
     * @param tamanho the tamanho to set
     */
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    /**
     * @return the link
     */
    public String getLink() {
        return link;
    }

    /**
     * @param link the link to set
     */
    public void setLink(String link) {
        this.link = link;
    }
    private int cod_midia;
    private int cod_postagem;
    private String tipo;
    private String qualidade;
    private String tamanho;
    private String link;
    
}
