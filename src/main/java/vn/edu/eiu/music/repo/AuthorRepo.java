package vn.edu.eiu.music.repo;

import org.springframework.data.repository.CrudRepository;
import vn.edu.eiu.music.entity.Author;

/**
 * Created by Acer on 18/07/2017.
 */
public interface AuthorRepo extends CrudRepository<Author, Integer> {
}
