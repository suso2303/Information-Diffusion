/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twitterNetwork;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import twitterNetwork.dataBase;



/**
 *
 * @author srinivas
 */
class communityStoring{
int count =0;

public void listFilesAndFilesSubDirectories(String directoryName) throws FileNotFoundException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
	        File directory = new File(directoryName);
	        int count = 0;
	        //get all the files from a directory
	        File[] fList = directory.listFiles();
	        for (File file : fList){
	            if (file.isFile()){
                        count = count +1;
	            	System.out.println(file.getName()+"----"+count);
	            	file_reads(file.getName());
	            } else if (file.isDirectory()){
	                listFilesAndFilesSubDirectories(file.getAbsolutePath());
	            }
	        }
	    }


public void file_reads(String fname) throws FileNotFoundException, IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException{
 BufferedReader in = null;
 String c="";
 StringTokenizer token=null;
 
    storing obj = new storing();
   
// ConfigurationBuilder cb1=new ConfigurationBuilder();
//			cb1.setOAuthConsumerKey(consumerKey1);
//			cb1.setOAuthConsumerSecret(consumerSecret1);
//			cb1.setOAuthAccessToken(twitterToken1);
//			cb1.setOAuthAccessTokenSecret(twitterSecret1);
  String fileName = "/home/srinivas/Desktop/comm_output2/"+fname;
//  Twitter twitter =new TwitterFactory(cb1.build()).getInstance();             
  ArrayList communitydata= new ArrayList();
      in = new BufferedReader(new FileReader(fileName));
        while ((c = in.readLine()) != null) {
             token= new StringTokenizer(c, "\n");
          while (token.hasMoreElements()){
             String tokens=token.nextElement().toString();
                 count = count +1;
                 String value[] = tokens.split(",");
                 System.out.println(count+" "+value[0]+" "+fname.replaceFirst("xx[0-9]*", "")+"   "+fname);
                  obj.createConnection(count,value[0],fname.replaceFirst("xx[0-9]*", ""),fname);
          }
        }
}

public void data_store() throws FileNotFoundException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
BufferedReader in = null;
 String c="";
 StringTokenizer token=null;
   storing obj = new storing();
   String fileName = "/home/srinivas/Desktop/idandusername";
//  Twitter twitter =new TwitterFactory(cb1.build()).getInstance();             
  ArrayList communitydata= new ArrayList();
      in = new BufferedReader(new FileReader(fileName));
        while ((c = in.readLine()) != null) {
             token= new StringTokenizer(c, "\n");
          while (token.hasMoreElements()){
             String tokens=token.nextElement().toString();
                 communitydata.add(tokens);
          }
        }
        
        obj.updateData(communitydata);

}




}



public class dataBase {
    public static void main(String args[]) throws IOException, FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
    String directoryName = "/home/srinivas/Desktop/comm_output2";
		communityStoring ec =new communityStoring();
		//ec.listFilesAndFilesSubDirectories(directoryName);
                ec.data_store();
		//ec.file_read();
    
    }
    
}
