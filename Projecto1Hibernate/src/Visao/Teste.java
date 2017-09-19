/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Modelo.HibernateUtil;
import Modelo.Participante;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Helpdesk_Izzy
 */
public class Teste {
    
    public static void main(String[] args) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        
        Participante p = new Participante();
        
        p.setNome(" Salvador");
        p.setDepartamento(" Informatica");
        p.setEmail("Salvadorjuliao7@gmail.com");
        p.setTelefone("845372887");

        Transaction tx = session.beginTransaction();
        
        session.saveOrUpdate(p);
        
        tx.commit();
        
        session.flush();
        
        session.close(); 
    }
    
}
