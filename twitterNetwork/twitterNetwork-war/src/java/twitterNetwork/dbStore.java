/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twitterNetwork;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;

/**
 *
 * @author srinivas
 */
class storing {

    public void createConnection(int count, String uid, String cmmtype, String cmm) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        String dbURl;
        String tableName;
        Connection conn = null;
        Statement stmt = null;

        dbURl = "jdbc:derby://localhost:1527/sample;create=true;user=app;password=app";
        tableName = "APP.TBLTWITTER";

        Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
        //Get a connection
        conn = DriverManager.getConnection(dbURl);

        try {
            stmt = conn.createStatement();
            int id = count;
            String userid = uid;
            String cmmonitytype = cmmtype;
            String cmmonity = cmm;
            stmt.execute("insert into " + tableName + " values (" + id + ",'" + userid + "','" + cmmonitytype + "','" + cmmonity + "')");
            stmt.close();
        } catch (SQLException sqlExcept) {
            sqlExcept.printStackTrace();
        }

        conn.close();
    }

    public void selectData(String fname,ArrayList uservalues) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException, IOException {
        String dbURl;
        String tableName;
        Connection conn = null;
        Statement stmt = null;
        Statement stmt2 =null ;
        Statement stmt3=null ;
        Statement stmt4=null ;
        BufferedWriter out = null;

        dbURl = "jdbc:derby://localhost:1527/sample;create=true;user=app;password=app";
        tableName = "APP.TBLTWITTER";

        Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
        //Get a connection
        conn = DriverManager.getConnection(dbURl);

        try {
            stmt = conn.createStatement();
            
            ResultSet results = stmt.executeQuery("select * from " + tableName+" where userid = \'"+fname+"\'");
             out= new BufferedWriter(new FileWriter("/home/srinivas/Desktop/graph/node.csv"));
            while (results.next()) {
                int id = results.getInt(1);
                String userid = results.getString(2);
                String commtype = results.getString(3);
                String comm = results.getString(4);
                stmt2 = conn.createStatement();
                ResultSet resultscomm = stmt2.executeQuery("select * from " + tableName+" where comm = \'"+comm+"\'");
               
                while (resultscomm.next()) {
                 String uid= resultscomm.getString(2)+",";
                 System.out.print(uid);
                 out.append(uid);
                }
                System.out.println("\n");
                out.append("\n");
                
               // System.out.println(id +44221895 "\t\t" + userid + "\t\t" + commtype + "\t\t" + comm);
            resultscomm.close();
            stmt2.close();
            }
            
            
            stmt3 = conn.createStatement();
            ResultSet results3=null;
            int k=0;
            while(k<uservalues.size()) {
                String iduser=uservalues.get(k).toString();
            results3 = stmt3.executeQuery("select comm from APP.TBLTWITTER where userid =\'"+iduser+"\' and commtype=(select commtype from APP.TBLTWITTER where userid = \'"+fname+"\' group by commtype)");
            while (results3.next()) {
                
                String comm = results3.getString(1);
                stmt4 = conn.createStatement();
                ResultSet resultscomm1 = stmt4.executeQuery("select * from " + tableName+" where comm = \'"+comm+"\'");
               
                while (resultscomm1.next()) {
                 String uid= resultscomm1.getString(2)+",";
                 System.out.print(uid);
                 out.append(uid);
                }
                System.out.println("\n");
                out.append("\n");
                
                //System.out.println(id +44221895 "\t\t" + userid + "\t\t" + commtype + "\t\t" + comm);
            resultscomm1.close();
            stmt4.close();
            }
           k++;
          }
            
            out.close();
            results.close();
            results3.close();
            stmt3.close();
            stmt.close();
            

        } catch (SQLException sqlExcept) {
            sqlExcept.printStackTrace();
        }

        conn.close();
    }

  public void updateData(ArrayList userIdName) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        String dbURl;
        String tableName;
        Connection conn = null;
        Statement stmt = null;

        dbURl = "jdbc:derby://localhost:1527/sample;create=true;user=app;password=app";
        tableName = "APP.TBLTWITTER";

        Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
        //Get a connection
        conn = DriverManager.getConnection(dbURl);

        try {
            stmt = conn.createStatement();
            int i=0;
            while(i<userIdName.size()){
            String useridname[] =userIdName.get(i).toString().split(",");
            
            String id=useridname[0];
            String name=useridname[1];
            System.out.println(id+"----"+name);
            stmt.execute("UPDATE APP.TBLTWITTER SET UNAME='"+name+"' WHERE USERID='"+id+"'");
            i++;
            }
            stmt.close();
        } catch (SQLException sqlExcept) {
            sqlExcept.printStackTrace();
        }

        conn.close();
    }  
    
    
    
    
}

//public class dbStore {
//
//    public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException, IOException {
//
//        storing obj = new storing();
//        obj.selectData();
//
//    }
//
//}
