/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vazio;

import com.mycompany.central_gamers.Usuario;
import com.mycompany.centralgamers.SessaoHibernate;
import org.hibernate.Session;

/**
 *
 * @author aluno
 */
public class TesteHibernate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Session sessao = SessaoHibernate.nova();
        
        Usuario user = new Usuario();
        user.setEmail("cleitonbraga56@gmail.com");
        user.setNome("Cleiton");
        user.setSenha("123");
        user.setSobrenome("Braga");
        user.setUsername("ThePunisher");
        
        sessao.save(user);
        sessao.close();
    }
    
}
