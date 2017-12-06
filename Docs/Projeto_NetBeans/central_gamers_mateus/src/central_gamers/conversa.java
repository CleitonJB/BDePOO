/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package central_gamers;

import java.util.Date;

/**
 *
 * @author aluno
 */
public class conversa {

    /**
     * @return the cod_mensagem
     */
    public int getCod_mensagem() {
        return cod_mensagem;
    }

    /**
     * @param cod_mensagem the cod_mensagem to set
     */
    public void setCod_mensagem(int cod_mensagem) {
        this.cod_mensagem = cod_mensagem;
    }

    /**
     * @return the cod_usuario_origem
     */
    public int getCod_usuario_origem() {
        return cod_usuario_origem;
    }

    /**
     * @param cod_usuario_origem the cod_usuario_origem to set
     */
    public void setCod_usuario_origem(int cod_usuario_origem) {
        this.cod_usuario_origem = cod_usuario_origem;
    }

    /**
     * @return the cod_usuario_destino
     */
    public int getCod_usuario_destino() {
        return cod_usuario_destino;
    }

    /**
     * @param cod_usuario_destino the cod_usuario_destino to set
     */
    public void setCod_usuario_destino(int cod_usuario_destino) {
        this.cod_usuario_destino = cod_usuario_destino;
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
    public Date getData_hora() {
        return data_hora;
    }

    /**
     * @param data_hora the data_hora to set
     */
    public void setData_hora(Date data_hora) {
        this.data_hora = data_hora;
    }
   private int cod_mensagem;
   private int cod_usuario_origem;
   private int cod_usuario_destino;
   private String texto;
   private Date data_hora;
}
