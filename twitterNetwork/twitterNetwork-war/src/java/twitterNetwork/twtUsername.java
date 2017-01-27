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
import twitter4j.ResponseList;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.User;
import twitter4j.conf.ConfigurationBuilder;
import twitterNetwork.Follower;
/**
 *
 * @author srinivas
 */
class extractUser{
    public static String consumerKey1 = "i98lWOVZ6DLARCIIQlx5VFOuC";
	    public static String consumerSecret1 = "AUUpp6zwJf2DvVo0vk6w1BMrpFPGH7YY22YA4kNq5DQ4Hyrtcb";
	    public static String twitterToken1 = "1493129694-lDWmDcfz1CGmTbs79hbGHykxTgfqOYlXBGofMfi";
	    public static String twitterSecret1 = "NbIUCMsZ5WDEwQFHhUq6AvM10qimq2k9NEy46I35fos85";

	    public static String consumerKey2 = "C2H4dwpT2ErAYBEyTKCmgwZ7G";
	    public static String consumerSecret2 = "1991VfQPnFLKyveZ7I3jsVc2Z1aqmMXp0hBAPUkzEGyz0Ar0Bb";
	    public static String twitterToken2 = "782967513550245888-PJygr7JOoZaYgNAUzv4EoLW5J40I85h";
	    public static String twitterSecret2 = "MP6GlXUOgjh7ryO7GgdSkRN4nGLWkbUeqt36qPuQE9Aga";

	    public static String consumerKey3 = "20FAzMZybVstsw63kQa8ZteHJ";
	    public static String consumerSecret3 = "Zcl8eaQA941CcCIMAXuZonF5YO65vxLyOnIX5YA1GIBzHOMq1b";
	    public static String twitterToken3 = "782967513550245888-dhq5g2Kv8VzdbWtlAaBov3o4niz8AEz";
	    public static String twitterSecret3 = "ej3Bowpn6eamyUulzWfHshnnLpm0Y6EMJnGWQyGpfTrnM";

	    public static String consumerKey4 = "BVac9nwEMtCHzHyw20whl4uDs";
	    public static String consumerSecret4 = "P2wasCnZ5LmvZ0UHsM8zIe5NGtBT7Ks6aetz3nT6OOJJuTOXkl";
	    public static String twitterToken4 = "782967513550245888-d9bYbPRyY6HVjA1r8GFkJixlhtDRLV0";
	    public static String twitterSecret4 = "a1OM1M9FHDMd7tczBfWSJMDqaTwYtxl7tG9TA4M13ez1i";

	    public static String consumerKey5 = "MzOKxEs58SZCE2WF2bxpkUc6h";
	    public static String consumerSecret5 = "sPojZMrfA8Z4oUwKsCOFMr2YT3O2SVssruarkXpcG0sj6ywHYR";
	    public static String twitterToken5 = "1952264970-4m0FrljMSc6mVhewNPlBX8odLZnLFg5TPpG6iHh";
	    public static String twitterSecret5 = "FPAYcegFSD0WV0rN3NxvbJ6xnAB3KvvL2m1EESKQOXpb5";

	    public static String consumerKey6 = "femNtVmoTNOJDnp1y7qqAMkOK";
	    public static String consumerSecret6 = "nmuSJHyN1hezcwVfZVz0uxOso5PgtAs5YThwspoNQfxdeCimTu";
	    public static String twitterToken6 = "1952264970-zoLRBDT08fAYsCKjO7oemmkGs05D2dici08m3TA";
	    public static String twitterSecret6 = "v6Z3n5lRvuTPqgpHTsN7iuS4zWMzxGeZAVAKOfvDnhPWj";

	    public static String consumerKey7 = "KJxpW9WiW2FBL2DMBEvpznGmn";
	    public static String consumerSecret7 = "87Jk7AqHJ1SjOiAlttWmrtVYiBMMPh0zz9pSYUM4plv7qiSPrS";
	    public static String twitterToken7 = "1952264970-s0kQXbsPsiN2C1VaVxFWUwcWY6wd14qozmDjzSn";
	    public static String twitterSecret7 = "4AaaB4OalScIr3nV9TFqsvkvEQ0Qf6gZHJXiQJEdP72uP";

	    public static String consumerKey8 = "G3XKzZc2wdk00be88F8F0rcFp";
	    public static String consumerSecret8 = "X7bzValwWWH38J7UnC9CFCl4usLBhampk1D6DgvSLACj3jsBkZ";
	    public static String twitterToken8 = "1493129694-qjSILLROjfzqOZv0kdbRDoXRNY23NYjFafqvrHW";
	    public static String twitterSecret8 = "TdpJ3Wzxa678qWKSwxDpzD0hqOQm3yKtoMoP4S7IdcaRo";

	    public static String consumerKey9 = "uuRfN1Nls8ctJe0cOTPohvllc";
	    public static String consumerSecret9 = "s47mZT2Loic41pYvg6gl8LeykHgHOpGfndzfW0snCB5IjsP1eg";
	    public static String twitterToken9 = "1493129694-3DyYUlXuZoQhwmvGZMDA5EbY6xtGTKCjQMH6Urg";
	    public static String twitterSecret9 = "0dlgzewDBx3hbbco6IVbuTW1b4fdRyoiRtap0b20xfAVV";
            
public void fileloading() throws FileNotFoundException, IOException, Exception {
    FileInputStream fstream = new FileInputStream("/home/srinivas/Desktop/uniqueuserid");
    BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
    ArrayList userName = new ArrayList();
    //ArrayList userID = new ArrayList();
    String strLine;
    //Read File Line By Line
    while ((strLine = br.readLine()) != null)   {
           System.out.println(strLine);
           userName.add(strLine);
          }
    dataextraction(userName,0,1);
}
 /*****token*/
public void dataextraction(ArrayList userName,int k, int l){
  
/*****/
    ConfigurationBuilder cb1 = new ConfigurationBuilder();
    cb1.setOAuthConsumerKey(consumerKey1);
    cb1.setOAuthConsumerSecret(consumerSecret1);
    cb1.setOAuthAccessToken(twitterToken1);
    cb1.setOAuthAccessTokenSecret(twitterSecret1);
    ConfigurationBuilder cb2 = new ConfigurationBuilder();
    cb2.setOAuthConsumerKey(consumerKey2);
    cb2.setOAuthConsumerSecret(consumerSecret2);
    cb2.setOAuthAccessToken(twitterToken2);
    cb2.setOAuthAccessTokenSecret(twitterSecret2);
    ConfigurationBuilder cb3 = new ConfigurationBuilder();
    cb3.setOAuthConsumerKey(consumerKey3);
    cb3.setOAuthConsumerSecret(consumerSecret3);
    cb3.setOAuthAccessToken(twitterToken3);
    cb3.setOAuthAccessTokenSecret(twitterSecret3);

    Twitter twitter1 = new TwitterFactory(cb1.build()).getInstance();
    Twitter twitter2 = new TwitterFactory(cb2.build()).getInstance();
    Twitter twitter3 = new TwitterFactory(cb3.build()).getInstance();

    ConfigurationBuilder cb4 = new ConfigurationBuilder();
    cb4.setOAuthConsumerKey(consumerKey4);
    cb4.setOAuthConsumerSecret(consumerSecret4);
    cb4.setOAuthAccessToken(twitterToken4);
    cb4.setOAuthAccessTokenSecret(twitterSecret4);
    ConfigurationBuilder cb5 = new ConfigurationBuilder();
    cb5.setOAuthConsumerKey(consumerKey5);
    cb5.setOAuthConsumerSecret(consumerSecret5);
    cb5.setOAuthAccessToken(twitterToken5);
    cb5.setOAuthAccessTokenSecret(twitterSecret5);
    ConfigurationBuilder cb6 = new ConfigurationBuilder();
    cb6.setOAuthConsumerKey(consumerKey6);
    cb6.setOAuthConsumerSecret(consumerSecret6);
    cb6.setOAuthAccessToken(twitterToken6);
    cb6.setOAuthAccessTokenSecret(twitterSecret6);
    ConfigurationBuilder cb7 = new ConfigurationBuilder();
    cb7.setOAuthConsumerKey(consumerKey7);
    cb7.setOAuthConsumerSecret(consumerSecret7);
    cb7.setOAuthAccessToken(twitterToken7);
    cb7.setOAuthAccessTokenSecret(twitterSecret7);
    ConfigurationBuilder cb8 = new ConfigurationBuilder();
    cb8.setOAuthConsumerKey(consumerKey8);
    cb8.setOAuthConsumerSecret(consumerSecret8);
    cb8.setOAuthAccessToken(twitterToken8);
    cb8.setOAuthAccessTokenSecret(twitterSecret8);
    Twitter twitter4 = new TwitterFactory(cb4.build()).getInstance();
    Twitter twitter5 = new TwitterFactory(cb5.build()).getInstance();
    Twitter twitter6 = new TwitterFactory(cb6.build()).getInstance();
    Twitter twitter7 = new TwitterFactory(cb7.build()).getInstance();
    Twitter twitter8 = new TwitterFactory(cb8.build()).getInstance();



System.out.println("k"+k+"l"+l);
int j=k;
       Follower obj = new Follower();
       User user1 = null;
        while (j < userName.size()) {
             try{
             // System.out.println(userName.get(j));
            int name=Integer.parseInt(userName.get(j).toString());
             if(l==1){
              user1 = twitter7.showUser(name);
             }else if(l==2){
            user1 = twitter2.showUser(name);
             }else if(l==3){
              user1 = twitter3.showUser(name);
             }else if(l==4){
              user1 = twitter4.showUser(name);
             }else if(l==5){
              user1 = twitter5.showUser(name);
             }else if(l==6){
             user1 = twitter6.showUser(name);
             }else if(l==7){
                 user1 = twitter1.showUser(name);
            
             }else if(l==8){
             user1 = twitter8.showUser(name);
             }else{
             l=1;
             dataextraction(userName,j,l);
             }
             
             //System.out.println(userName.get(j)+"---"+j);
             if(user1.getRateLimitStatus().getRemaining() >2){
                 System.out.println(userName.get(j)+","+user1.getScreenName());
             }else{
                 
                 System.out.println("rate2");
                 //System.out.println(l+1+"---"+j);
                 int m=l+1;
                 if(m==9){
                 m=1;
                 }
                 dataextraction(userName,j,m);
             
             }
             }catch(Exception e){
             System.out.println(e.getMessage());
             }
            j++;
        }

}
}


public class twtUsername {
    public static void main(String args[]) throws IOException, Exception{
    extractUser obj = new extractUser();
    obj.fileloading();
    
    }
    
}
