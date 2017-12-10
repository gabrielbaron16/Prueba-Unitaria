/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaunitaria;

import twitter4j.Status;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class PruebaUnitaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      ConfigurationBuilder configuracion=new ConfigurationBuilder();
      configuracion.setDebugEnabled(true)
      .setOAuthConsumerKey("HbwQDyqtG0MREiSpsjRURoD8f")
      .setOAuthConsumerSecret("nPSR0tlfpsbvHGviPF01Eb63Uz17JclhseCmepTOZ6hOviM0al")
      .setOAuthAccessToken("3363520107-P2eX5nNcSH7VGUtm9fC28SFTjkE7m7rQIQ9jDWo")
      .setOAuthAccessTokenSecret("SoL5RnxRVekkrO85ZonREMFfjKarSiZwF4TXpHSANHydX");
      TwitterFactory t= new TwitterFactory(configuracion.build());
      twitter4j.Twitter twitter=t.getInstance();
      Solicitud s =new Solicitud("2010MisterChip",twitter);
      try{
      s.GetData();
      }catch(TwitterException e){
          System.out.println("Usuario No Existe");
      }
    }
    
}
