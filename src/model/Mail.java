/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author danie
 */
public class Mail {
    
    private final String mail;
    
    public Mail (String mail) {
        this.mail = mail;
    }
    
    public String getDomain () {
        return mail.substring(mail.indexOf("@")+1);
    }
    
    public static boolean isMail (String line) {
        return line.matches("[^@]+@[^@]+\\.[a-zA-Z]{2,}");
    }
}
