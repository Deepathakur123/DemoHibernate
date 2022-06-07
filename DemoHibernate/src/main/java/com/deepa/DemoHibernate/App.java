package com.deepa.DemoHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.BootstrapServiceRegistryBuilder;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AlienName alienName = new AlienName();
    	alienName.setFname("Deepa");
    	alienName.setMname("Onkar");
    	alienName.setLname("Thakur");
 Alien alien = new Alien();
 alien.setAid(105);
 alien.setAname(alienName);
 alien.setColor("Green");

 
 Configuration cfg  = new Configuration().configure().addAnnotatedClass(Alien.class);
 
 ServiceRegistry service = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
SessionFactory sf = cfg.buildSessionFactory(service);
 
 Session session = sf.openSession();
Transaction tx = session.beginTransaction();

session.save(alien);
tx.commit();
  }
}
