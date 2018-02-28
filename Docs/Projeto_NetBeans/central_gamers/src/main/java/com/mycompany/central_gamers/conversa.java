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
     * @param cod_mensagem the cod_mensagem to set
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
     * @param cod_usuario_origem the cod_usuario_origem to set
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
    public Date getDataHora() {
        return dataHora;
    }

    /**
     * @param data_hora the data_hora to set
     */
    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }
   private int codMensagem;
   private int codUsuarioOrigem;
   private int codUsuarioDestino;
   private String texto;
   private Date dataHora;
}
