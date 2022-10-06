/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package msaccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Busdev
 */
public class MsAccess {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String dbURL = "jdbc:ucanaccess://D:/fauzan/java/test1.accdb" ;
        try {
            Connection conn = DriverManager.getConnection(dbURL);
            System.out.println("Sukses Konek ke Ms Access");
            String sql = "INSERT INTO CONTACTS (CONTACT_ID,NAME,ADDRESS,EMAIL,PHONE) values ('2','Fauzan','Jkt','a@mail.com','081234567')";
            Statement smt = conn.createStatement();
            int rows = smt.executeUpdate(sql);
            if(rows>0){
                System.out.println("Sukses di insert");
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
