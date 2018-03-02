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
public class notificacao {

    /**
     * @return the cod_notificacao
     */
    public int getCodNotificacao() {
        return codNotificacao;
    }

    /**
     * @param cod_notificacao the cod_notificacao to set
     */
    public void setCodNotificacao(int codNotificacao) {
        this.codNotificacao = codNotificacao;
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
     * @return the tipo_de_aviso
     */
    public String getTipoAviso() {
        return tipoAviso;
    }

    /**
     * @param tipo_de_aviso the tipo_de_aviso to set
     */
    public void setTipoAviso(String tipoAviso) {
        this.tipoAviso = tipoAviso;
    }

    /**
     * @return the recebimento
     */
    public boolean isRecebimento() {
        return recebimento;
    }

    /**
     * @param recebimento the recebimento to set
     */
    public void setRecebimento(boolean recebimento) {
        this.recebimento = recebimento;
    }
    private int codNotificacao;
    private int codForum;
    private int codUsuario;
    private String tipoAviso;
    private boolean recebimento;
    }
