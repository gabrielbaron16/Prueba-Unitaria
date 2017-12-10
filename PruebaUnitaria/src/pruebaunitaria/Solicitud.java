/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaunitaria;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;
public class Solicitud {
    String Nombreusuario;
    twitter4j.Twitter twitter;
    
    public Solicitud(String Nombreusuario, Twitter twitter) {
        this.Nombreusuario = Nombreusuario;
        this.twitter = twitter;
    }
    public void GetData() throws TwitterException{
        try{ 
         System.out.println(this.twitter.showUser(this.Nombreusuario));
      }catch(TwitterException e){
          throw e;
      }
    }
}
