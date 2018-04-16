package guru.springframework.jokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class JokeServiceTest {

    private JokeService jokes;

    @Before
    public void setUp(){
        this.jokes = new JokeService(new ChuckNorrisQuotes());
    }

    @Test
    public void testJoke(){

        String joke = this.jokes.getQuote();

        assertTrue( !joke.isEmpty() );
    }
}
