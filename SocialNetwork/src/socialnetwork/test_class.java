/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socialnetwork;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class test_class {

	public void calculate_entropy() throws FileNotFoundException, IOException{
		
		
		String directoryName = "F:\\Projects\\Information_Diffusion\\check";
		
		File directory = new File(directoryName);
		String line = "";
		String values[] = null;
		int count = 0;
        //get all the files from a directory
        File[] fList = directory.listFiles();
        for (File file : fList){
            if (file.isFile()){
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
            	count++;
            	OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream("F:\\Projects\\Information_Diffusion\\test\\"+count , true), "UTF-8");
                BufferedWriter fbw = new BufferedWriter(writer);
                try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                	while ((line = br.readLine()) != null) {
                		System.out.println(file.getAbsolutePath());
                		values = line.split(",");
                		//Achievement
                        System.out.println(values[1]);
                        if(values[1].contentEquals("1")){
                     	   oneCountAc++;
                         }
                         else{
                            zeroCountAc++;
                         }
                    //Benevolence
                        System.out.println(values[2]);
                        if(values[2].contentEquals("1")){
                     	   oneCountBe++;
                         }
                         else{
                            zeroCountBe++;
                         }
                     
                    //Conformity
                     System.out.println(values[3]);
                     if(values[3].contentEquals("1")){
                  	   oneCountCo++;
                      }
                      else{
                         zeroCountCo++;
                      }
                    //Hedonism
                     System.out.println(values[4]);
                     if(values[4].contentEquals("1")){
                  	   oneCountHe++;
                      }
                      else{
                         zeroCountHe++;
                      }
                     //Power
                     System.out.println(values[5]);
                     if(values[5].contentEquals("1")){
                  	   oneCountPo++;
                      }
                      else{
                         zeroCountPo++;
                      }
                     //Security
                     System.out.println(values[6]);
                     if(values[6].contentEquals("1")){
                  	   oneCountSe++;
                      }
                      else{
                         zeroCountSe++;
                      }
                     //Self-Direction
                     System.out.println(values[7]);
                     if(values[7].contentEquals("1")){
                  	   oneCountSd++;
                      }
                      else{
                         zeroCountSd++;
                      }
                     //Stimulation
                     System.out.println(values[8]);
                     if(values[8].contentEquals("1")){
                  	   oneCountSt++;
                      }
                      else{
                         zeroCountSt++;
                      }
                     //Tradition
                     System.out.println(values[9]);
                     if(values[9].contentEquals("1")){
                  	   oneCountTr++;
                      }
                      else{
                         zeroCountTr++;
                      }
                     //Universalism
                     System.out.println(values[10]);
                     if(values[10].contentEquals("1")){
                  	   oneCountUn++;
                      }
                      else{
                         zeroCountUn++;
                      }
                     
                     //Calculate Entropy
             		double total = values[1].length();
            		//Achievement
                    entropyAc = -(zeroCountAc/total)*Math.log(zeroCountAc/total)+(-(oneCountAc/total)*Math.log(oneCountAc/total));
                    //Benevolence
                    entropyBe = -(zeroCountBe/total)*Math.log(zeroCountBe/total)+(-(oneCountBe/total)*Math.log(oneCountBe/total));
                    //Conformity
                    entropyCo = -(zeroCountCo/total)*Math.log(zeroCountCo/total)+(-(oneCountCo/total)*Math.log(oneCountCo/total));
                    //Hedonism	
                    entropyHe = -(zeroCountHe/total)*Math.log(zeroCountHe/total)+(-(oneCountHe/total)*Math.log(oneCountHe/total));
                    //Power
                    entropyPo = -(zeroCountPo/total)*Math.log(zeroCountPo/total)+(-(oneCountPo/total)*Math.log(oneCountPo/total));
                    //Security
                    entropySe = -(zeroCountSe/total)*Math.log(zeroCountSe/total)+(-(oneCountSe/total)*Math.log(oneCountSe/total));
                    //SelfDirection
                    entropySd = -(zeroCountSd/total)*Math.log(zeroCountSd/total)+(-(oneCountSd/total)*Math.log(oneCountSd/total));
                    //Stimulation
                    entropySt = -(zeroCountSt/total)*Math.log(zeroCountSt/total)+(-(oneCountSt/total)*Math.log(oneCountSt/total));
                    //Tradition
            		entropyTr = -(zeroCountTr/total)*Math.log(zeroCountTr/total)+(-(oneCountTr/total)*Math.log(oneCountTr/total));
                    //Universalism
                    entropyUn = -(zeroCountUn/total)*Math.log(zeroCountUn/total)+(-(oneCountUn/total)*Math.log(oneCountUn/total));
                    
                    
                    System.out.println("Total"+total);
                    System.out.println("ZAC"+zeroCountAc);
                  	System.out.println("OAC"+oneCountAc);
                  	System.out.println("EAC"+entropyAc);
                		fbw.write(line);
                		fbw.newLine();
                	}
                	br.close();
                	fbw.close();
                }
            }
        }
	}
	
	
	
public static void main(String args[]) throws FileNotFoundException, IOException{
		String directoryName = "F:\\Projects\\Information_Diffusion\\check";
		test_class tc = new test_class();
		//tc.listFilesAndFilesSubDirectories(directoryName);
		tc.calculate_entropy();
	}
}