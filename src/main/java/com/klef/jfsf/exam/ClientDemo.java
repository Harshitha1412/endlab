package com.klef.jfsf.exam;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class ClientDemo {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        // Insert Device
        Device device = new Device();
        device.setBrand("Generic Brand");
        device.setModel("Generic Model");
        device.setPrice(150.0);
        session.persist(device);

        // Insert Smartphone
        Smartphones smartphone = new Smartphones();
        smartphone.setBrand("Apple");
        smartphone.setModel("iPhone 15");
        smartphone.setPrice(1200.0);
        smartphone.setOperatingSystem("iOS");
        smartphone.setCameraResolution("48 MP");
        session.persist(smartphone);

        // Insert Tablet
        Tablet tablet = new Tablet();
        tablet.setBrand("Samsung");
        tablet.setModel("Galaxy Tab S9");
        tablet.setPrice(900.0);
        tablet.setScreenSize("11 inches");
        tablet.setBatteryLife("12 hours");
        session.persist(tablet);

        transaction.commit();
        session.close();
        HibernateUtil.getSessionFactory().close();

        System.out.println("Records inserted successfully!");
    }
}
