package org.example;

import org.example.entity.Song;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
    private static SessionFactory sessionFactory = null;
    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            //how to create session factory? -- > create configuration
            Configuration configuration = new Configuration(); // <---- this class help to bootstrap hibernate.
            configuration.configure("hibernate.cfg.xml");
            configuration.addAnnotatedClass(Song.class);

            //create session factory
            sessionFactory = configuration.buildSessionFactory();
        }
        return sessionFactory;
    }
}
