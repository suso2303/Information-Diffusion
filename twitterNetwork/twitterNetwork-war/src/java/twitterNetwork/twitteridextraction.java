/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twitterNetwork;

/**
 *
 * @author srinivas
 */
import twitter4j.IDs;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.User;
import twitter4j.conf.ConfigurationBuilder;
import static twitterNetwork.Follower.consumerKey1;
import static twitterNetwork.Follower.consumerSecret1;
import static twitterNetwork.Follower.twitterSecret1;
import static twitterNetwork.Follower.twitterToken1;
public class twitteridextraction {
            public static String consumerKey2 = "C2H4dwpT2ErAYBEyTKCmgwZ7G";
	    public static String consumerSecret2 = "1991VfQPnFLKyveZ7I3jsVc2Z1aqmMXp0hBAPUkzEGyz0Ar0Bb";
	    public static String twitterToken2 = "782967513550245888-PJygr7JOoZaYgNAUzv4EoLW5J40I85h";
	    public static String twitterSecret2 = "MP6GlXUOgjh7ryO7GgdSkRN4nGLWkbUeqt36qPuQE9Aga";
    public static void main(String args[]) throws TwitterException{
        ConfigurationBuilder cb1=new ConfigurationBuilder();
			cb1.setOAuthConsumerKey(consumerKey2);
			cb1.setOAuthConsumerSecret(consumerSecret2);
			cb1.setOAuthAccessToken(twitterToken2);
			cb1.setOAuthAccessTokenSecret(twitterSecret2);
     
    Twitter twitter =new TwitterFactory(cb1.build()).getInstance();
    User user = twitter.showUser(5108161);
    System.out.println(user.getName());
    System.out.println("<h3>Displaying user id of user "+ user.getScreenName()+ "</h3><br/>");
    System.out.println(user.getId());
    
    
    }
    
}
