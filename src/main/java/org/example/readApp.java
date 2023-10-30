package org.example;
import org.example.entity.Song;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class readApp {
    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
        Session session = sessionFactory.openSession();

        Song song = session.get(Song.class, 1);
        System.out.println(song);

    }

}
