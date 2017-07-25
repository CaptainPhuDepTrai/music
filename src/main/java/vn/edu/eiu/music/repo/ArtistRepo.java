package vn.edu.eiu.music.repo;

import org.springframework.data.repository.CrudRepository;
import vn.edu.eiu.music.entity.Artist;


/**
 * Created by Acer on 18/07/2017.
 */
public interface ArtistRepo extends CrudRepository<Artist, Integer> {
}
