package org.example;

import org.example.entity.Song;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class deleteApp {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

        Session session = sessionFactory.openSession();
        // load the object that I wanna delete
        Song song = session.get(Song.class, 3);
        session.beginTransaction();
        // delete the object that I have just loaded
        session.delete(song);
        session.getTransaction().commit();


    }

}
