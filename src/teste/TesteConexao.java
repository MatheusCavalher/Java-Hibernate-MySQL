package teste;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import dominio.Aluno;
import conf.HibernateUtil;

public class TesteConexao {

	public static void main(String[] args) {

		
		Configuration cfg = new Configuration();
		
		cfg.configure("hibernate.cfg.xml");
		
        Transaction transaction = null;
        
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student objects
            a1.setNome("Ricardo Tafarel");
    		a1.setMatricula("800034567");
    		a1.setCPF("808056789");
    		a2.setNome("Neymar Jr");
    		a2.setMatricula("900034567");
    		a2.setCPF("909056789");
    		session.save(a1); 
    		session.save(a2);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }

	}

}
