package wikira.jokesappudemy.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wikira.jokesappudemy.sources.JokeSource;

@Service
public class ChuckNorrisJokeService implements JokeService {

    private JokeSource jokeSource;

    public ChuckNorrisJokeService(JokeSource jokeSource) {
        this.jokeSource = jokeSource;
    }

    @Override
    public String sayJoke() {
        return jokeSource.getJoke();
    }

}
