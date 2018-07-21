package netherwulf.springframework.jokesapp.services;

import org.springframework.stereotype.Service;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeServiceImpl implements JokeService {

    private ChuckNorrisQuotes chuckNorrisQuotes;

    JokeServiceImpl(){
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String sayJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
