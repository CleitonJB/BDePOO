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
public class registro_de_jogos {

    /**
     * @return the plataforma
     */
    public String getPlataforma() {
        return plataforma;
    }

    /**
     * @param plataforma the plataforma to set
     */
    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    /**
     * @return the cod_informacao
     */
    public int getCod_informacao() {
        return cod_informacao;
    }

    /**
     * @param cod_informacao the cod_informacao to set
     */
    public void setCod_informacao(int cod_informacao) {
        this.cod_informacao = cod_informacao;
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
     * @return the desenvolvedora
     */
    public String getDesenvolvedora() {
        return desenvolvedora;
    }

    /**
     * @param desenvolvedora the desenvolvedora to set
     */
    public void setDesenvolvedora(String desenvolvedora) {
        this.desenvolvedora = desenvolvedora;
    }

    /**
     * @return the lancamento
     */
    public String getLancamento() {
        return lancamento;
    }

    /**
     * @param lancamento the lancamento to set
     */
    public void setLancamento(String lancamento) {
        this.lancamento = lancamento;
    }

    /**
     * @return the modo
     */
    public String getplataforma() {
        return getPlataforma();
    }

    /**
     * @param modo the modo to set
     */
    public void setplataforma(String modo) {
        this.setPlataforma(modo);
    }

    /**
     * @return the imagem
     */
    public String getImagem() {
        return imagem;
    }

    /**
     * @param imagem the imagem to set
     */
    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    /**
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the classificacao_idade
     */
    public String getClassificacao_idade() {
        return classificacao_idade;
    }

    /**
     * @param classificacao_idade the classificacao_idade to set
     */
    public void setClassificacao_idade(String classificacao_idade) {
        this.classificacao_idade = classificacao_idade;
    }

    /**
     * @return the historia
     */
    public String getHistoria() {
        return historia;
    }

    /**
     * @param historia the historia to set
     */
    public void setHistoria(String historia) {
        this.historia = historia;
    }

    /**
     * @return the novidades
     */
    public String getNovidades() {
        return novidades;
    }

    /**
     * @param novidades the novidades to set
     */
    public void setNovidades(String novidades) {
        this.novidades = novidades;
    }

    /**
     * @return the informacoes
     */
    private int cod_informacao;
    private int cod_usuario;
    private String nome;
    private String desenvolvedora;
    private String lancamento;
    private String plataforma;
    private String imagem;
    private String categoria;
    private String classificacao_idade;
    private String historia;
    private String novidades;
}
