/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twitterNetwork;



import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.concurrent.TimeUnit;
import java.util.*;
import twitter4j.IDs;
//import twitter4j.IDs;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.User;
//import twitter4j.User;
import twitter4j.conf.ConfigurationBuilder;

	public class Follower
	{
		String tname;
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

	    public ArrayList<String> ar = new ArrayList();
	    public ArrayList<String> arpic = new ArrayList();

	    public void setTname(String tname) {
	        this.tname = tname;
	    }

//	    public ArrayList getFollow() throws Exception {
//	        this.getDetails();
//	        return this.ar;
//	    }
	    
	    public ArrayList getFollowPic() throws IOException, TwitterException {
	    	//this.getDetails();
	    	return this.arpic;
	    }         
		
		public void getDetails(String id) throws Exception{
			ConfigurationBuilder cb1=new ConfigurationBuilder();
			cb1.setOAuthConsumerKey(consumerKey1);
			cb1.setOAuthConsumerSecret(consumerSecret1);
			cb1.setOAuthAccessToken(twitterToken1);
			cb1.setOAuthAccessTokenSecret(twitterSecret1);
			ConfigurationBuilder cb2=new ConfigurationBuilder();
			cb2.setOAuthConsumerKey(consumerKey2);
			cb2.setOAuthConsumerSecret(consumerSecret2);
			cb2.setOAuthAccessToken(twitterToken2);
			cb2.setOAuthAccessTokenSecret(twitterSecret2);
			ConfigurationBuilder cb3=new ConfigurationBuilder();
			cb3.setOAuthConsumerKey(consumerKey3);
			cb3.setOAuthConsumerSecret(consumerSecret3);
			cb3.setOAuthAccessToken(twitterToken3);
			cb3.setOAuthAccessTokenSecret(twitterSecret3);
			
			Twitter twitter1 =new TwitterFactory(cb1.build()).getInstance();
			Twitter twitter2 =new TwitterFactory(cb2.build()).getInstance();
			Twitter twitter3=new TwitterFactory(cb3.build()).getInstance();
			
			ConfigurationBuilder cb4=new ConfigurationBuilder();
			cb4.setOAuthConsumerKey(consumerKey4);
			cb4.setOAuthConsumerSecret(consumerSecret4);
			cb4.setOAuthAccessToken(twitterToken4);
			cb4.setOAuthAccessTokenSecret(twitterSecret4);
			ConfigurationBuilder cb5=new ConfigurationBuilder();
			cb5.setOAuthConsumerKey(consumerKey5);
			cb5.setOAuthConsumerSecret(consumerSecret5);
			cb5.setOAuthAccessToken(twitterToken5);
			cb5.setOAuthAccessTokenSecret(twitterSecret5);
			ConfigurationBuilder cb6=new ConfigurationBuilder();
			cb6.setOAuthConsumerKey(consumerKey6);
			cb6.setOAuthConsumerSecret(consumerSecret6);
			cb6.setOAuthAccessToken(twitterToken6);
			cb6.setOAuthAccessTokenSecret(twitterSecret6);
			ConfigurationBuilder cb7=new ConfigurationBuilder();
			cb7.setOAuthConsumerKey(consumerKey7);
			cb7.setOAuthConsumerSecret(consumerSecret7);
			cb7.setOAuthAccessToken(twitterToken7);
			cb7.setOAuthAccessTokenSecret(twitterSecret7);
			ConfigurationBuilder cb8=new ConfigurationBuilder();
			cb8.setOAuthConsumerKey(consumerKey8);
			cb8.setOAuthConsumerSecret(consumerSecret8);
			cb8.setOAuthAccessToken(twitterToken8);
			cb8.setOAuthAccessTokenSecret(twitterSecret8);
			

			Twitter twitter4 =new TwitterFactory(cb4.build()).getInstance();
			Twitter twitter5 =new TwitterFactory(cb5.build()).getInstance();
			Twitter twitter6=new TwitterFactory(cb6.build()).getInstance();

			Twitter twitter7 =new TwitterFactory(cb7.build()).getInstance();
			Twitter twitter8 =new TwitterFactory(cb8.build()).getInstance();
			setTname(id);
			String twittername = this.tname;
	        System.out.println(twittername);
	        
			//User u=twitter.showUser(usr);
			//PrintStream out=new PrintStream(new FileOutputStream("F:\\Projects\\Twitter_Network\\out.txt"));
			int w1=1,w2=1,w3=1,w4=1,w5=1,w6=1,w7=1,w8=1;
			//long id=u.getId();
			long lCursor=-1, nextCursor=-1;
			do{
				String twitterScreenName = twitter1.getScreenName();
				IDs followersIDs = twitter1.getFollowersIDs(twitterScreenName, -1);
				lCursor=nextCursor;
				//out.println("###"+nextCursor);
				
				//label:
				
				if(w1!=16) {
				
				try{
					followersIDs=twitter1.getFollowersIDs(twitterScreenName, lCursor);
					long[] ids = followersIDs.getIDs();
					String usr = twittername;
					long[] fofIDs;
		            User user = twitter1.showUser(usr);
		            String userScreenName = user.getScreenName();
		            IDs followerIDsOfFollowers = twitter1.getFollowersIDs(user.getScreenName(), -1);
		            long[] arrl = fofIDs = followerIDsOfFollowers.getIDs();
		            int n = arrl.length;
		            int n2 = 0;
		            while (n2 < n){
		            	long subId = arrl[n2];
		            	User user1 = twitter1.showUser(subId);
		            	if(user1.getStatusesCount() > 200 && user1.getStatusesCount() < 3200 ){
		                	this.ar.add(user1.getScreenName());
		                    this.arpic.add(user1.getMiniProfileImageURL());
		            	}
		            	++n2;
		            	//TimeUnit.MINUTES.sleep(16);
		            }
				}catch(Exception e){
					e.printStackTrace();
				}
				
				/*for(long k: followersIDs.getIDs()){
					//User p=twitter.showUser(k);
					   out.println(k);
					   
					}*/ 
				nextCursor=followersIDs.getNextCursor();
				w1++;
				}
				else if(w2!=16){
					try{
						followersIDs=twitter2.getFollowersIDs(twitterScreenName, lCursor);
						long[] ids = followersIDs.getIDs();
						String usr = twittername;
						long[] fofIDs;
			            User user = twitter2.showUser(usr);
			            String userScreenName = user.getScreenName();
			            IDs followerIDsOfFollowers = twitter2.getFollowersIDs(user.getScreenName(), -1);
			            long[] arrl = fofIDs = followerIDsOfFollowers.getIDs();
			            int n = arrl.length;
			            int n2 = 0;
			            while (n2 < n){
			            	long subId = arrl[n2];
			            	User user1 = twitter2.showUser(subId);
			            	if(user1.getStatusesCount() > 200 && user1.getStatusesCount() < 3200 ){
			                	this.ar.add(user1.getScreenName());
			                    this.arpic.add(user1.getMiniProfileImageURL());
			            	}
			            	++n2;
			            	//TimeUnit.MINUTES.sleep(16);
			            }
					}catch(Exception e){
						e.printStackTrace();
					}
					
					/*for(long k: followersIDs.getIDs()){
						//User p=twitter.showUser(k);
						   out.println(k);
						   
						}*/ 
					nextCursor=followersIDs.getNextCursor();
					w2++;
					}
				else if(w3!=16){
					//IDs followerIDs = twitter3.getFollowersIDs(twitterScreenName, -1);
					try{
						followersIDs=twitter3.getFollowersIDs(twitterScreenName, lCursor);
						long[] ids = followersIDs.getIDs();
						String usr = twittername;
						long[] fofIDs;
			            User user = twitter3.showUser(usr);
			            String userScreenName = user.getScreenName();
			            IDs followerIDsOfFollowers = twitter3.getFollowersIDs(user.getScreenName(), -1);
			            long[] arrl = fofIDs = followerIDsOfFollowers.getIDs();
			            int n = arrl.length;
			            int n2 = 0;
			            while (n2 < n){
			            	long subId = arrl[n2];
			            	User user1 = twitter3.showUser(subId);
			            	if(user1.getStatusesCount() > 200 && user1.getStatusesCount() < 3200 ){
			                	this.ar.add(user1.getScreenName());
			                    this.arpic.add(user1.getMiniProfileImageURL());
			            	}
			            	++n2;
			            	//TimeUnit.MINUTES.sleep(16);
			            }
					}catch(Exception e){
						e.printStackTrace();
					}
					
					/*for(long k: followersIDs.getIDs()){
						//User p=twitter.showUser(k);
						   out.println(k);
						   
						}*/ 
					nextCursor=followersIDs.getNextCursor();
					w3++;
					}
				else if(w4!=16){
					//IDs followerIDs = twitter4.getFollowersIDs(twitterScreenName, -1);
					try{
						followersIDs=twitter4.getFollowersIDs(twitterScreenName, lCursor);
						long[] ids = followersIDs.getIDs();
						String usr = twittername;
						long[] fofIDs;
			            User user = twitter4.showUser(usr);
			            String userScreenName = user.getScreenName();
			            IDs followerIDsOfFollowers = twitter4.getFollowersIDs(user.getScreenName(), -1);
			            long[] arrl = fofIDs = followerIDsOfFollowers.getIDs();
			            int n = arrl.length;
			            int n2 = 0;
			            while (n2 < n){
			            	long subId = arrl[n2];
			            	User user1 = twitter4.showUser(subId);
			            	if(user1.getStatusesCount() > 200 && user1.getStatusesCount() < 3200 ){
			                	this.ar.add(user1.getScreenName());
			                    this.arpic.add(user1.getMiniProfileImageURL());
			            	}
			            	++n2;
			            	//TimeUnit.MINUTES.sleep(16);
			            }
					}catch(Exception e){
						e.printStackTrace();
					}
					
					/*for(long k: followersIDs.getIDs()){
						//User p=twitter.showUser(k);
						   out.println(k);
						   
						}*/ 
					nextCursor=followersIDs.getNextCursor();
					w4++;
					}
				else if(w5!=16){
					//IDs followerIDs = twitter5.getFollowersIDs(twitterScreenName, -1);
					try{
						followersIDs=twitter5.getFollowersIDs(twitterScreenName, lCursor);
						long[] ids = followersIDs.getIDs();
						String usr = twittername;
						long[] fofIDs;
			            User user = twitter5.showUser(usr);
			            String userScreenName = user.getScreenName();
			            IDs followerIDsOfFollowers = twitter5.getFollowersIDs(user.getScreenName(), -1);
			            long[] arrl = fofIDs = followerIDsOfFollowers.getIDs();
			            int n = arrl.length;
			            int n2 = 0;
			            while (n2 < n){
			            	long subId = arrl[n2];
			            	User user1 = twitter5.showUser(subId);
			            	if(user1.getStatusesCount() > 200 && user1.getStatusesCount() < 3200 ){
			                	this.ar.add(user1.getScreenName());
			                    this.arpic.add(user1.getMiniProfileImageURL());
			            	}
			            	++n2;
			            	//TimeUnit.MINUTES.sleep(16);
			            }
					}catch(Exception e){
						e.printStackTrace();
					}
					
					/*for(long k: followersIDs.getIDs()){
						//User p=twitter.showUser(k);
						   out.println(k);
						   
						}*/ 
					nextCursor=followersIDs.getNextCursor();
					w5++;
					}
				else if(w6!=16){
					//IDs followerIDs = twitter6.getFollowersIDs(twitterScreenName, -1);
					try{
						followersIDs=twitter6.getFollowersIDs(twitterScreenName, lCursor);
						long[] ids = followersIDs.getIDs();
						String usr = twittername;
						long[] fofIDs;
			            User user = twitter6.showUser(usr);
			            String userScreenName = user.getScreenName();
			            IDs followerIDsOfFollowers = twitter6.getFollowersIDs(user.getScreenName(), -1);
			            long[] arrl = fofIDs = followerIDsOfFollowers.getIDs();
			            int n = arrl.length;
			            int n2 = 0;
			            while (n2 < n){
			            	long subId = arrl[n2];
			            	User user1 = twitter6.showUser(subId);
			            	if(user1.getStatusesCount() > 200 && user1.getStatusesCount() < 3200 ){
			                	this.ar.add(user1.getScreenName());
			                    this.arpic.add(user1.getMiniProfileImageURL());
			            	}
			            	++n2;
			            	//TimeUnit.MINUTES.sleep(16);
			            }
					}catch(Exception e){
						e.printStackTrace();
					}
					
					/*for(long k: followersIDs.getIDs()){
						//User p=twitter.showUser(k);
						   out.println(k);
						   
						}*/ 
					nextCursor=followersIDs.getNextCursor();
					w6++;
					}
				else if(w7!=16){
					//IDs followerIDs = twitter7.getFollowersIDs(twitterScreenName, -1);
					try{
						followersIDs=twitter7.getFollowersIDs(twitterScreenName, lCursor);
						long[] ids = followersIDs.getIDs();
						String usr = twittername;
						long[] fofIDs;
			            User user = twitter7.showUser(usr);
			            String userScreenName = user.getScreenName();
			            IDs followerIDsOfFollowers = twitter7.getFollowersIDs(user.getScreenName(), -1);
			            long[] arrl = fofIDs = followerIDsOfFollowers.getIDs();
			            int n = arrl.length;
			            int n2 = 0;
			            while (n2 < n){
			            	long subId = arrl[n2];
			            	User user1 = twitter7.showUser(subId);
			            	if(user1.getStatusesCount() > 200 && user1.getStatusesCount() < 3200 ){
			                	this.ar.add(user1.getScreenName());
			                    this.arpic.add(user1.getMiniProfileImageURL());
			            	}
			            	++n2;
			            	//TimeUnit.MINUTES.sleep(16);
			            }
					}catch(Exception e){
						e.printStackTrace();
					}
					
					/*for(long k: followersIDs.getIDs()){
						//User p=twitter.showUser(k);
						   out.println(k);
						   
						}*/ 
					nextCursor=followersIDs.getNextCursor();
					w7++;
					}
				else if(w8!=16){
					//IDs followerIDs = twitter8.getFollowersIDs(twitterScreenName, -1);
					try{
						followersIDs=twitter8.getFollowersIDs(twitterScreenName, lCursor);
						long[] ids = followersIDs.getIDs();
						String usr = twittername;
						long[] fofIDs;
			            User user = twitter8.showUser(usr);
			            String userScreenName = user.getScreenName();
			            IDs followerIDsOfFollowers = twitter8.getFollowersIDs(user.getScreenName(), -1);
			            long[] arrl = fofIDs = followerIDsOfFollowers.getIDs();
			            int n = arrl.length;
			            int n2 = 0;
			            while (n2 < n){
			            	long subId = arrl[n2];
			            	User user1 = twitter8.showUser(subId);
			            	if(user1.getStatusesCount() > 200 && user1.getStatusesCount() < 3200 ){
			                	this.ar.add(user1.getScreenName());
			                    this.arpic.add(user1.getMiniProfileImageURL());
			            	}
			            	++n2;
			            	//TimeUnit.MINUTES.sleep(16);
			            }
					}catch(Exception e){
						e.printStackTrace();
					}
					
					/*for(long k: followersIDs.getIDs()){
						//User p=twitter.showUser(k);
						   out.println(k);
						   
						}*/ 
					nextCursor=followersIDs.getNextCursor();
					w8++;
					
					/*if(twitter8.getRateLimitStatus()!=null){
						if (twitter8.getRateLimitStatus().get("/users/lookup") != null){
						//	break label; 
						}
					}*/
				}
				else {
					try{
						TimeUnit.MINUTES.sleep(16);
					}catch(InterruptedException e){
						e.printStackTrace();
					}
					w1=1; w2=1;w3=1;w4=1;w5=1;w6=1;w7=1;w8=1;
				}
				
				
			}while(nextCursor!=0);
			
			//out.flush();
			//out.close();
			
		}
	}
	
		