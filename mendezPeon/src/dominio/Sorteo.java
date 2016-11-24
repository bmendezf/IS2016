/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.io.Serializable;
import java.util.ArrayList;
//import java.util.Properties;
//import javax.mail.Message;
//import javax.mail.MessagingException;
//import javax.mail.PasswordAuthentication;
//import javax.mail.Session;
//import javax.mail.Transport;
//import javax.mail.internet.InternetAddress;
//import javax.mail.internet.MimeMessage;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

/**
 *
 * @author bruno
 */
public class Sorteo implements Serializable {

    private String premio;
    private int cantidadGanadores;
    private ArrayList<Persona> ganadores;

    public Sorteo() {
        premio = "";
        cantidadGanadores = 0;
        ganadores = new ArrayList();
    }

    public String getPremio() {
        return premio;
    }

    public void setPremio(String premio) {
        this.premio = premio;
    }

    public int getCantidadGanadores() {
        return cantidadGanadores;
    }

    public void setCantidadGanadores(int cantidadGanadores) {
        this.cantidadGanadores = cantidadGanadores;
    }

    public ArrayList<Persona> getGanadores() {
        return ganadores;
    }

    public void setGanadores(ArrayList<Persona> ganadores) {
        this.ganadores = ganadores;
    }

    public Persona getGanador(int numeroGanador) {
        return ganadores.get(numeroGanador);
    }

    public void addGanador(Persona ganador) {
        this.ganadores.add(ganador);
    }

    public void notificarGanadores() {

        Properties props = new Properties();

        // Nombre del host de correo, es smtp.gmail.com
        props.setProperty("mail.smtp.host", "smtp.gmail.com");

        // TLS si está disponible
        props.setProperty("mail.smtp.starttls.enable", "true");

        // Puerto de gmail para envio de correos
        props.setProperty("mail.smtp.port","587");

        // Nombre del usuario
        props.setProperty("mail.smtp.user", "zesulove@gmail.com");

        // Si requiere o no usuario y password para conectarse.
        props.setProperty("mail.smtp.auth", "true");

        // Obtenemos la sesión por defecto
        Session session = Session.getDefaultInstance(props);
        //session.setDebug(true);

        try{
          // Creamos un objeto mensaje tipo MimeMessage por defecto.
          MimeMessage message = new MimeMessage(session);

          // Quien envia el correo
          message.setFrom(new InternetAddress("zesulove@gmail.com"));
          // Asignamos el asunto
          message.setSubject("GANASTE!!!!!!");

          // Asignamos el mensaje como tal
          String text = "Usted se ha ganado un " + this.premio + ", lo estaremos esperando. <br> Saludos.";
          message.setText(text,"ISO-8859-1","html");


          for (int i = 0; i < this.ganadores.size(); i++) {
              // A quien va dirigido
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(this.ganadores.get(i).getMail()));
          }
          // Enviamos el correo
          Transport t = session.getTransport("smtp");
          t.connect("zesulove@gmail.com","nwwkbzucwfxsupsb");
          t.sendMessage(message,message.getAllRecipients());
          t.close();


          System.out.println("Mensaje enviado");
        } catch (MessagingException e) {
          e.printStackTrace();
        }
    }
}
