/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socialnetwork;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.Double.parseDouble;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 *
 * @author srinivas
 */
class desgine{

public List fileLoading(String path) throws FileNotFoundException, IOException{
 
 BufferedReader in = null;
      StringTokenizer token=null;
      String c;
      List users = new ArrayList();
      in = new BufferedReader(new FileReader(path));
        while ((c = in.readLine()) != null) {
             token= new StringTokenizer(c, "\n");
          while (token.hasMoreElements()){
           users.add(token.nextElement());
        }
    }
return  users;
 }

public List communityExtraction() throws IOException{
   
    BufferedReader in = null;
    StringTokenizer token=null;
   
    
    List nomarized_data = new ArrayList();
    List communityData=  new ArrayList();
    List userdata= fileLoading("/home/srinivas/Desktop/rounded_values.csv");
    List circledata=fileLoading("/home/srinivas/Desktop/circles.csv");
    
    
    int i=0;
           while(i<circledata.size()){
               System.out.println("c1");
               String c[] = circledata.get(i).toString().split(",");
                  int j=0;
                  while(j<c.length){
                      //System.out.println(c);
                      int k=0;
                   while(k<userdata.size()){
                       //System.out.println(c[j]);
                        String b[] = userdata.get(k).toString().split(",");
                       
                       if((c[j]).toString().trim().equalsIgnoreCase(b[0].toString())){
                       System.out.println(userdata.get(k));
                       }
                  k++;
                  }
                      j++;
                  }
           //System.out.println();
         i++;
           }


return communityData;
}




}


public class Community {
    public static void main(String args[]) throws IOException{
    
    desgine obj = new desgine();
           obj.communityExtraction();
    
    }
    
}
