package vn.edu.eiu.music.repo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;



import static org.junit.Assert.assertEquals;

/**
 * Created by Acer on 18/07/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ArtistRepoTest {
    @Autowired
    private ArtistRepo artistRepo;

    @Test
    public void count(){
        assertEquals(3,artistRepo.count());
    }
}
