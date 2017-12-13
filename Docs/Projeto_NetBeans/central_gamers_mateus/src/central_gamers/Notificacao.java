/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package central_gamers;

/**
 *
 * @author aluno
 */
public class Notificacao {

    /**
     * @return the cod_notificacao
     */
    public int getCod_notificacao() {
        return cod_notificacao;
    }

    /**
     * @param cod_notificacao the cod_notificacao to set
     */
    public void setCod_notificacao(int cod_notificacao) {
        this.cod_notificacao = cod_notificacao;
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
     * @return the tipo_de_aviso
     */
    public String getTipo_de_aviso() {
        return tipo_de_aviso;
    }

    /**
     * @param tipo_de_aviso the tipo_de_aviso to set
     */
    public void setTipo_de_aviso(String tipo_de_aviso) {
        this.tipo_de_aviso = tipo_de_aviso;
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
    private int cod_notificacao;
    private int cod_forum;
    private int cod_usuario;
    private String tipo_de_aviso;
    private boolean recebimento;
    }
