/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/// Normilization of values and ethics model
package socialnetwork;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 *
 * @author srinivas
 */

class entropy{
public List fileLoading() throws FileNotFoundException, IOException{
 
 BufferedReader in = null;
      StringTokenizer token=null;
      String c;
      List users = new ArrayList();
      in = new BufferedReader(new FileReader("/home/srinivas/Desktop/values.csv"));
        while ((c = in.readLine()) != null) {
             token= new StringTokenizer(c, "\n");
          while (token.hasMoreElements()){
           users.add(token.nextElement());
        }
    }
return  users;
 }

public void rounding() throws FileNotFoundException, IOException{
 
 BufferedReader in = null;
      StringTokenizer token=null;
      String c="";
      List users_data = fileLoading();
      List nomarized_data = new ArrayList();
      int i=0;
           while(i<users_data.size()){
               c= users_data.get(i).toString();
           token= new StringTokenizer(c, ",");
          while (token.hasMoreElements()){
           nomarized_data.add(token.nextElement());
        }
        
               System.out.print(nomarized_data.get(0)+",");
              if(parseDouble(nomarized_data.get(1).toString()) >= 0.698890787){
                  System.out.print(1+",");
              }else{
               System.out.print(0+",");
              }
           if(parseDouble(nomarized_data.get(2).toString()) >= 0.644076619){
                  System.out.print(1+",");
              }else{
              System.out.print(0+",");
              }
           if(parseDouble(nomarized_data.get(3).toString()) >= 0.629400238){
                  System.out.print(1+",");
              }else{
               System.out.print(0+",");
              }
           if(parseDouble(nomarized_data.get(4).toString()) >= 0.664581607){
                  System.out.print(1+",");
              }else{
              System.out.print(0+",");
              }
           if(parseDouble(nomarized_data.get(5).toString()) >= 0.481303264 ){
                  System.out.print(1+",");
              }else{
               System.out.print(0+",");
              }
           if(parseDouble(nomarized_data.get(6).toString()) >= 0.636419933 ){
                  System.out.print(1+",");
              }else{
               System.out.print(0+",");
              }
           if(parseDouble(nomarized_data.get(7).toString()) >=  0.69831202 ){
                  System.out.print(1+",");
              }else{
               System.out.print(0+",");
              }
           if(parseDouble(nomarized_data.get(8).toString()) >=  0.667198327){
                  System.out.print(1+",");
              }else{
               System.out.print(0+",");
              }
           if(parseDouble(nomarized_data.get(9).toString()) >= 0.523293327 ){
                  System.out.print(1+",");
              }else{
               System.out.print(0+",");
              }
           if(parseDouble(nomarized_data.get(10).toString()) >= 0.709014213){
                  System.out.println(1);
              }else{
               System.out.println(0);
           }
          nomarized_data.clear();
         i++;
           }
 

}

}
public class SocialNetwork {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        entropy obj = new entropy();
        obj.rounding();
    }
    
}
