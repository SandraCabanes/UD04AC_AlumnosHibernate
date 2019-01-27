/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import model.Alumne;
import model.Grup;
import model.Nivell;
import model.Sexe;
import model.Telefono;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Sandra
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int op;
        //CREAMOS CONEXION
        //SessionFactory sessionFactory;
        //Configuration configuration = new Configuration();
        //configuration.configure();
        //sessionFactory = configuration.buildSessionFactory();
        SessionFactory factory = new Configuration().configure().buildSessionFactory();

        do {
            menu();
            op = teclado.nextInt();

            //CREAR UNA SESION
            Session session = factory.openSession();
            switch (op) {

                case 1:
                    session.beginTransaction();
                    //Grup grup=new Grup("B2ME", Nivell.CF, new Alumne());
                    
                    Alumne alum=new Alumne("Pepa", new Telefono(2221457), Sexe.MUJER, Calendar.getInstance().getTime(), 2, new Grup("B11M ", Nivell.CF, new Alumne()));
                    
                    session.save(alum);
                    session.getTransaction().commit();
                    session.close();
                    break;

                case 2:
                    session.beginTransaction();

                    break;

                case 3:
                    session.beginTransaction();

                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;
            }
            //CERRAR CONEXION
            factory.close();
        } while (op != 0);

        /*
        Profesor profesor2 = (Profesor) session.get(Profesor.class, 1);
        System.out.println(profesor2);

        profesor.setNombre("Manola");
        session.update(profesor);

        //session.saveOrUpdate(profesor);*/
    }

    private static void menu() {
        System.out.print("--MENU--\t"
                + "1. Crear objeto\n"
                + "2. Borrar objeto\n"
                + "3. Modificar objeto\n"
                + "4. Consultas\n"
                + "Elige una opción: ");
    }

}
