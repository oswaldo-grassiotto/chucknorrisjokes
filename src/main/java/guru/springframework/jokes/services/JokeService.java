package guru.springframework.jokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JokeService {

    private ChuckNorrisQuotes quotes;


    @Autowired
    public JokeService(ChuckNorrisQuotes quotes){
        this.quotes = quotes;
    }

    public String getQuote(){
        return this.quotes.getRandomQuote();
    }
}
