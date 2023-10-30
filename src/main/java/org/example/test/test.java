package org.example.test;

import org.example.HibernateUtils;
import org.hibernate.SessionFactory;

public class test {
    public static void main(String[] args) {
        SessionFactory sessionFactory1 = HibernateUtils.getSessionFactory();
        SessionFactory sessionFactory2 = HibernateUtils.getSessionFactory();
        if(sessionFactory1 == sessionFactory2){
            System.out.println("Two session factory work together. ");
        }
        System.out.println(sessionFactory1 + " _ "+ sessionFactory2);
    }
}
