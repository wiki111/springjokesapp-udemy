package wikira.jokesappudemy.sources;


import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Component;

@Component
public class ChuckNorrisJokeSource implements JokeSource {

    public String getJoke() {
        ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();
        return chuckNorrisQuotes.getRandomQuote();
    }
}
