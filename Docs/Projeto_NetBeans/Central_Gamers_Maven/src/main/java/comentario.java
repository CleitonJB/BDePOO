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
    public int getCod_comentario() {
        return cod_comentario;
    }

    /**
     * @param cod_comentario the cod_comentario to set
     */
    public void setCod_comentario(int cod_comentario) {
        this.cod_comentario = cod_comentario;
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
    private int cod_comentario;
    private int cod_usuario;
    private int cod_postagem;
    private String conteudo;
}
