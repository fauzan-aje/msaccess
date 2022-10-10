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
//        String dbURL = "jdbc:ucanaccess://D:/fauzan/java/MsAccess/test1-mdb2007-accdb.accdb" ; //sukses insert
//        String dbURL = "jdbc:ucanaccess://D:/fauzan/java/MsAccess/test1-mdb2000.mdb" ; //sukses insert
//        String dbURL = "jdbc:ucanaccess://D:/fauzan/java/MsAccess/test1-mdb2002-2003.mdb" ; //sukses insert
//        String dbURL = "jdbc:ucanaccess://D:/fauzan/java/MsAccess/bc20template.mdb" ; //sukses insert
        String dbURL = "jdbc:ucanaccess://C:/Users/Busdev/Documents/Database12.mdb" ; //sukses insert
        try {
            Connection conn = DriverManager.getConnection(dbURL+";memory=false;openExclusive=true;ignoreCase=true;encrypt=true","Admin","1234");
//            Connection conn = DriverManager.getConnection(dbURL+";memory=false;openExclusive=true;ignoreCase=true;encrypt=true");
            System.out.println("Sukses Konek ke Ms Access");
//            String sql = "INSERT INTO CONTACTS2 (CONTACT_ID,NAME,ADDRESS,EMAIL,PHONE) values ('2','Fauzan','Jkt','a@mail.com','081234567')";
            String sql = "INSERT INTO tblPibCon (CAR,ContNo,ContUkur,ContTipe) values ('3','Fauzan','Jk','1')";
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
