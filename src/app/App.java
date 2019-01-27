/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import model.Alumne;
import model.Grup;
import model.Nivell;
import model.Sexe;
import model.Telefono;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

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
        Alumne alum = null;
        Grup grup = null;
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
                    //CREAR OBJETO
                    session.beginTransaction();

                    alum = new Alumne("Juana", new Telefono(2221457), Sexe.MUJER, Calendar.getInstance().getTime(), 4, null);
                    /*grup = new Grup("2ESO", Nivell.CF, alum);
                    Set<Alumne> listaAlumnes = new HashSet<>();
                    listaAlumnes.add(alum);
                    grup.setAlumnes(listaAlumnes);*/

                    session.save(alum);
                    //session.save(grup);
                    session.getTransaction().commit();
                    break;

                case 2:
                    //BORRAR OBJETO ALUMNO
                    session.beginTransaction();
                    session.delete(alum);
                    session.getTransaction().commit();
                    break;

                case 3:
                    session.beginTransaction();
                    grup=new Grup("2ESO", Nivell.BATXILLERAT, alum);
                    session.saveOrUpdate(grup);
                    session.getTransaction().commit();
                    break;
                    
                case 4:
                    
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    session.close();
                    factory.close();
                    break;
            }
        } while (op != 0);
    }

    private static void menu() {
        System.out.print("--MENU--\n"
                + "1. Crear objeto\n"
                + "2. Borrar objeto\n"
                + "3. Modificar objeto\n"
                + "4. Consultas\n"
                + "Elige una opción: ");
    }

}
