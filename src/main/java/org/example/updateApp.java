package org.example;

import org.example.entity.Song;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class updateApp {
    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

        if(sessionFactory != null){

            Session session = sessionFactory.openSession();
        // '1', 'Not afraid', 'Eminem'
        Song song = session.get(Song.class, 5);
            session.beginTransaction();
            System.out.println(song);
            song.setSongName("Nothing to Say");
            session.update(song);
        session.getTransaction().commit();
            System.out.println(" UPDATED ");

        }

    }

}
