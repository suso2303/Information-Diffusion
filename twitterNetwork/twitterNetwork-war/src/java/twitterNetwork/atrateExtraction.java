/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twitterNetwork;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.ArrayList;




/**
 *
 * @author srinivas
 */
class twitter{
            
            public ArrayList userID = new ArrayList();
            
    public void fileloading() throws FileNotFoundException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException, Exception{
    FileInputStream fstream = new FileInputStream("/home/srinivas/Desktop/12.txt");
    BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
    ArrayList userName = new ArrayList();
    //ArrayList userID = new ArrayList();
    String strLine;
    //Read File Line By Line
    while ((strLine = br.readLine()) != null)   {
      
     if((strLine.contains("@"))&& !(strLine.contains("tweet:RT"))){
               String atrate[] = strLine.split(" ");
               int j=0;
               while(j<atrate.length){
               //System.out.println(atrate[j]);
               if(atrate[j].contains("@"))
                   //System.out.println(atrate[j]);
                   userName.add(atrate[j].replace("@","").replace("tweet:", "").replace("!","").
                            replace(".","").replace("'s","").replace(",", "").replace(")", "").replace("(", "").replace("?", "").replace(",", "").replace(":",""));
                    j++;
               }
               
       
     
     }
    }     
        
      //storing obj = new storing();
      //obj.selectData("12",userID);
      //System.out.println("size"+userID.size());      
      int k=0;
      while(k<userID.size()){
      System.out.println("12,"+userID.get(k));
      
      k++;
      }
    
    }

   

}
public class atrateExtraction {
    public static void main(String args[]) throws IOException, FileNotFoundException,  ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException, Exception{
    twitter obj = new twitter();
    obj.fileloading();
    
    
    }
    
}
