/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaunitaria;
import twitter4j.TwitterException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

/**
 *
 * @author GABRIEL BARON
 */
public class SolicitudTest {
    public SolicitudTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of GetData method, of class Solicitud.
     */
    @Test
    public void testGetData() {
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
      }catch(TwitterException e){// TODO review the generated test code and remove the default call to fail.
            System.out.println("Usuario No Existe");;
        }
    }
    
}
