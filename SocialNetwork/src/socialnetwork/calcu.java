/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socialnetwork;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class calcu {
	static String str="";
	static String[] split;
	static ArrayList al = new ArrayList<>();
	private static final String COMMA_DELIMITER = ",";
	static String[] values;
	
	public  void file_reads(String fname) throws FileNotFoundException, IOException 
    {    
		 int oneCountAc = 0;
		 int zeroCountAc = 0;
		 int oneCountBe = 0;
		 int zeroCountBe = 0;
		 int oneCountCo = 0;
		 int zeroCountCo = 0;
		 int oneCountHe = 0;
		int zeroCountHe = 0;
		int oneCountPo = 0;
		int zeroCountPo = 0;
		int oneCountSe = 0;
		int zeroCountSe = 0;
		int oneCountSd = 0;
		int zeroCountSd = 0;
		int oneCountSt = 0;
		int zeroCountSt = 0;
		int oneCountTr = 0;
		int zeroCountTr = 0;
		int oneCountUn = 0;
		int zeroCountUn = 0;
                int minEntroValue=0;
		double entropyAc = 0;
		double entropyBe = 0;
		double entropyCo = 0;
		double entropyHe = 0;
		double entropyPo = 0;
		double entropySe = 0;
		double entropySd = 0;
		double entropySt = 0;
		double entropyTr = 0;
		double entropyUn = 0;
                String commName="";
                BufferedReader in = null;
                BufferedWriter out= null;
                BufferedWriter out1= null;
      StringTokenizer token=null;
      ArrayList Minentropy= new ArrayList();
      String c;
		
        String fileName = "/home/srinivas/Desktop/comm/"+fname;
        String WritePath ="/home/srinivas/Desktop/comm_output/"+fname;
        //String WritePath1 ="/home/srinivas/Desktop/comm_output2/"+fname;
         ArrayList communitydata= new ArrayList();
      in = new BufferedReader(new FileReader(fileName));
        while ((c = in.readLine()) != null) {
             token= new StringTokenizer(c, "\n");
          while (token.hasMoreElements()){
             String tokens=token.nextElement().toString();
             if(tokens.length()>2){
             communitydata.add(tokens);
             }
           }
         }
              int i=0;
            while (i<communitydata.size()) {
              
                // use comma as separator
                values = communitydata.get(i).toString().split(",");
               
               
          //Achievement
               //System.out.println(values[1]);
               if(values[1].contentEquals("1")){
            	   oneCountAc++;
                }
                else{
                   zeroCountAc++;
                }
           //Benevolence
               //System.out.println(values[2]);
               if(values[2].contentEquals("1")){
            	   oneCountBe++;
                }
                else{
                   zeroCountBe++;
                }
            
           //Conformity
           // System.out.println(values[3]);
            if(values[3].contentEquals("1")){
         	   oneCountCo++;
             }
             else{
                zeroCountCo++;
             }
           //Hedonism
           // System.out.println(values[4]);
            if(values[4].contentEquals("1")){
         	   oneCountHe++;
             }
             else{
                zeroCountHe++;
             }
            //Power
            //System.out.println(values[5]);
            if(values[5].contentEquals("1")){
         	   oneCountPo++;
             }
             else{
                zeroCountPo++;
             }
            //Security
           // System.out.println(values[6]);
            if(values[6].contentEquals("1")){
         	   oneCountSe++;
             }
             else{
                zeroCountSe++;
             }
            //Self-Direction
            //System.out.println(values[7]);
            if(values[7].contentEquals("1")){
         	   oneCountSd++;
             }
             else{
                zeroCountSd++;
             }
            //Stimulation
           // System.out.println(values[8]);
            if(values[8].contentEquals("1")){
         	   oneCountSt++;
             }
             else{
                zeroCountSt++;
             }
            //Tradition
          //  System.out.println(values[9]);
            if(values[9].contentEquals("1")){
         	   oneCountTr++;
             }
             else{
                zeroCountTr++;
             }
            //Universalism
           // System.out.println(values[10]);
            if(values[10].contentEquals("1")){
         	   oneCountUn++;
             }
             else{
                zeroCountUn++;
             }
            i++;
            }
       
	//entropy value calculation
		//Achievement
	int total = communitydata.size();
        entropyAc= entropy(oneCountAc,zeroCountAc,total);
        Minentropy.add(entropyAc);
        //Benevolence
        entropyBe = entropy(oneCountBe,zeroCountBe,total);
        Minentropy.add(entropyBe);
        //Conformity
        entropyCo = entropy(oneCountCo,zeroCountCo,total);
        Minentropy.add(entropyCo);
        //Hedonism	
        entropyHe = entropy(oneCountHe,zeroCountHe,total);
         Minentropy.add(entropyHe);
        //Power
        entropyPo = entropy(oneCountPo,zeroCountPo,total);
         Minentropy.add(entropyPo);
        //Security
        entropySe = entropy(oneCountSe,zeroCountSe,total);
         Minentropy.add(entropySe);
        //SelfDirection
        entropySd = entropy(oneCountSd,zeroCountSd,total);
         Minentropy.add(entropySd);
        //Stimulation
        entropySt = entropy(oneCountSt,zeroCountSt,total);
         Minentropy.add(entropySt);
        //Tradition
        entropyTr = entropy(oneCountTr,zeroCountTr,total);
         Minentropy.add(entropyTr);
        //Universalism
        entropyUn = entropy(oneCountUn,zeroCountUn,total);
         Minentropy.add(entropyUn);
         
         Object minent = Collections.min(Minentropy);
         //System.out.println("min value"+minent);
        minEntroValue= Minentropy.indexOf(minent);
        
        if(minEntroValue==0){
            commName="Achievement";
        }else if(minEntroValue==1){
            commName="Benevolence";
        }else if(minEntroValue==2){
            commName="Conformity";
        }else if(minEntroValue==3){
            commName="Hedonism";
        }else if(minEntroValue==4){
            commName="Power";
        }else if(minEntroValue==5){
            commName="Security";
        }else if(minEntroValue==6){
            commName="SelfDirection";
        }else if(minEntroValue==7){
            commName="Stimulation";
        }else if(minEntroValue==8){
            commName="Tradition";
        }else if(minEntroValue==9){
            commName="Universalism";
        }
        Minentropy.clear();
        
        
         
       //****************** file Writing process**************************
       
//       out = new BufferedWriter(new FileWriter(WritePath));
//       int j=0;
//       while(j<communitydata.size()){
//       out.write(communitydata.get(j).toString());
//       out.newLine();
//       j++;
//       }
//       out.write("Entropy_Values ,"+entropyAc+","+entropyBe+","+entropyCo+","+entropyHe+","+entropyPo+","+entropySd+","+entropySe+","
//                		+entropySt+","+entropyTr+","+entropyUn);
//       out.close();
      
      //**********************file writing with little modification*************
    String WritePath1 ="/home/srinivas/Desktop/comm_output2/"+commName+fname;
      out1 = new BufferedWriter(new FileWriter(WritePath1));
       int j=0;
       while(j<communitydata.size()){
       out1.write(communitydata.get(j).toString());
       out1.newLine();
       j++;
       }
       //out1.write("Entropy_Values ,"+entropyAc+","+entropyBe+","+entropyCo+","+entropyHe+","+entropyPo+","+entropySd+","+entropySe+","
                		//+entropySt+","+entropyTr+","+entropyUn);
        //out1.newLine();
      // out1.write(commName+":"+minent);
       out1.close();
      
       //*********************************
     }
        public double entropy(int oneCount,int zeroCount,int total ){
        double entropyvalue=0.0;
        if(oneCount==0 && zeroCount==0){
            entropyvalue=0;
        }else if(zeroCount==0){
            entropyvalue= -((double)oneCount/total)*(Math.log10((double)oneCount/total));
            if(entropyvalue == -0.0){
                entropyvalue=0.0;
            }
         }else if(oneCount==0){
            entropyvalue = -((double)zeroCount/total)*(Math.log10((double)zeroCount/total));
            if(entropyvalue == -0.0){
                entropyvalue=0.0;
            }
            }else{
            entropyvalue=-(((double)zeroCount/total)*Math.log10((double)zeroCount/total))+((-((double)oneCount/total)*Math.log10((double)oneCount/total)));
          if(entropyvalue == -0.0){
                entropyvalue=0.0;
            } 
         }
        return entropyvalue ;
        }
        
        
	
	 public void listFilesAndFilesSubDirectories(String directoryName) throws FileNotFoundException, IOException{
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
	 
	 
	 
	public static void main(String args[]) throws FileNotFoundException, IOException{
		String directoryName = "/home/srinivas/Desktop/comm";
		calcu ec =new calcu();
		ec.listFilesAndFilesSubDirectories(directoryName);
		//ec.file_read();
		//ec.calculate_entropy();
		//ec.file_append(path);
	}
}
