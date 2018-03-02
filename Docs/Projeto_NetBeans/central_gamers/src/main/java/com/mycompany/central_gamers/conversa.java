/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.central_gamers;

import java.util.Date;

/**
 *
 * @author aluno
 */
public class conversa {

    /**
     * @return the dataHoraMensagem
     */
    public Date getDataHoraMensagem() {
        return dataHoraMensagem;
    }

    /**
     * @param dataHoraMensagem the dataHoraMensagem to set
     */
    public void setDataHoraMensagem(Date dataHoraMensagem) {
        this.dataHoraMensagem = dataHoraMensagem;
    }

    /**
     * @param codUsuarioDestino the codUsuarioDestino to set
     */
    public void setCodUsuarioDestino(int codUsuarioDestino) {
        this.codUsuarioDestino = codUsuarioDestino;
    }

    /**
     * @return the cod_mensagem
     */
    public int getCodMensagem() {
        return codMensagem;
    }

    /**
     * @param codMensagem the cod_mensagem to set
     */
    public void setCodMensagem(int codMensagem) {
        this.codMensagem = codMensagem;
    }

    /**
     * @return the cod_usuario_origem
     */
    public int getCodUsuarioOrigem() {
        return codUsuarioOrigem;
    }

    /**
     * @param codUsuarioOrigem the cod_usuario_origem to set
     */
    public void setCodUsuarioOrigem(int codUsuarioOrigem) {
        this.codUsuarioOrigem = codUsuarioOrigem;
    }

    /**
     * @return the cod_usuario_destino
     */
    public int getCodUsuarioDestino() {
        return codUsuarioDestino;
    }

    /**
     * @param cod_usuario_destino the cod_usuario_destino to set
     */
    public void setCod_usuario_destino(int cod_usuario_destino) {
        this.setCodUsuarioDestino(cod_usuario_destino);
    }

    /**
     * @return the texto
     */
    public String getTexto() {
        return texto;
    }

    /**
     * @param texto the texto to set
     */
    public void setTexto(String texto) {
        this.texto = texto;
    }

    /**
     * @return the data_hora
     */
    public Date getdataHoraMensagem() {
        return getDataHoraMensagem();
    }

    /**
     * @param dataHoraMensagem the data_hora to set
     */
    public void setdataHoraMensagem(Date dataHoraMensagem) {
        this.setDataHoraMensagem(dataHoraMensagem);
    }
   private int codMensagem;
   private int codUsuarioOrigem;
   private int codUsuarioDestino;
   private String texto;
   private Date dataHoraMensagem;
}
