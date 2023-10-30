package org.example;

import org.example.entity.Song;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class createApp {
    public static void main(String[] args) {


        /* How to implemenet hibernate
        1. Create configration object
        2. do confgration file, that include all connected to data base.
        3.
         */
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

        //Session factory-- mean data source// Data source: mean how you will be contact the DB.
        //TODO-- initialize the session object
       try {
           Session session = sessionFactory.openSession();
           Song song1 = new Song();

           //song1.setId(2);
           song1.setSongName("Mohammed Abdo");
           song1.setArtist("SomeOne like me");

           //create transaction to save data in db
           session.beginTransaction();
           session.save(song1);
           session.getTransaction().commit();

           System.out.println("data is save");
           session.close();
       }
       catch (Exception e){
           e.printStackTrace();
       }
    }
}