package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;
import static org.junit.jupiter.api.Assertions.*;

public class PosterManagerTestEmpty {
    private PosterManager manager = new PosterManager(2);
    private Movie first = new Movie(1, "first", "Drama", "www.firstURL.ru");
    private Movie second = new Movie(2, "second", "Comedy", "www.secondURL.ru");
    private Movie third = new Movie(3, "third", "Crime", "www.thirdURL.ru");
    private Movie fourth = new Movie(4, "fourth", "Horror", "www.fourthURL.ru");


    @Test
    void addToEmpty() {
        manager.add(second);
        Movie[] actual = manager.getLastFilms();
        Movie[] expected= new Movie[]{second};
        assertArrayEquals(expected,actual);

    }


    @Test
    void getLastEmpty() {
        Movie[] actual = manager.getLastFilms();
        Movie[] expected = new Movie[]{};
        assertArrayEquals(expected, actual);
    }
}
