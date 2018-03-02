package com.mycompany.central_gamers;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import org.hibernate.Session;
import org.hibernate.Transaction;

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
        
        usuario user = new usuario();
        user.setEmail("cleitonbraga56@gmail.com");
        user.setNome("Cleiton");
        user.setSenha("123");
        user.setSobrenome("Braga");
        user.setUsername("ThePunisher");
        
        System.out.println("SALVANDO USUARIO");
        Transaction tx = sessao.beginTransaction();
        sessao.save(user);
        tx.commit();
        System.out.println("USUARIO SALVO");
        sessao.close();
        System.out.println("SESSAO FECHADA");

       // TODO code application logic here
   }
}
