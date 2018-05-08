package movies;

import java.util.HashMap;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MovieController {
  @RequestMapping(value = "movies/{id}", method = RequestMethod.GET)
  public Movie getMovie(@PathVariable long id) {
    HashMap<Long, Movie> movies = new HashMap<>();
    Movie ironMan = new Movie(1,"Iron Man","Jon Favreau","Robert Downey Jr., Terrence Howard, Jeff Bridges, Shaun Toub, Gwyneth Paltrow");
    Movie glory = new Movie(2,"Glory","Edward Zwick","Matthew Broderick, Denzel Washington, Cary Elwes, Morgan Freeman");
    Movie evilDead = new Movie(3,"Evil Dead","Sam Raimi","Bruce Campbell, Ellen Sandweiss, Hal Delrich, Betsy Baker, Sarah York");
    movies.put(ironMan.getId(), ironMan);
    movies.put(glory.getId(), glory);
    movies.put(evilDead.getId(), evilDead);
    Movie movie = (Movie)movies.get(id);
    return movie;
  }
}
