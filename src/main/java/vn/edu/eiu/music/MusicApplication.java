package vn.edu.eiu.music;

import com.fasterxml.jackson.databind.util.ArrayIterator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import vn.edu.eiu.music.entity.Artist;
import vn.edu.eiu.music.entity.ArtistType;
import vn.edu.eiu.music.entity.Author;
import vn.edu.eiu.music.repo.ArtistRepo;
import vn.edu.eiu.music.repo.AuthorRepo;

@SpringBootApplication
public class MusicApplication implements CommandLineRunner {
	@Autowired // dependency injection
	private AuthorRepo authorRepo;
	@Autowired
	private ArtistRepo artistRepo;

	public static void main(String[] args) {
		SpringApplication.run(MusicApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		authorRepo.save(new Author("Author First Name 1", "Author Last Name 1"));
		authorRepo.save(new Author("Author First Name 2", "Author Last Name 2"));
		authorRepo.save(new Author("Author First Name 3", "Author Last Name 3"));

		artistRepo.save(new Artist("Artist First Name 1", "Artist Last Name 1", ArtistType.SINGLE));
		artistRepo.save(new Artist("Artist First Name 2", "Artist Last Name 2", ArtistType.SINGLE));
		artistRepo.save(new Artist("Band Name 1", "", ArtistType.BAND));

	}
}
