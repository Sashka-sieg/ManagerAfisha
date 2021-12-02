package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;

import static org.junit.jupiter.api.Assertions.*;

class PosterManagerTest {
    private PosterManager manager = new PosterManager();
    private Movie first = new Movie(1, "first", "Drama", "www.firstURL.ru");
    private Movie second = new Movie(2, "second", "Comedy", "www.secondURL.ru");
    private Movie third = new Movie(3, "third", "Crime", "www.thirdURL.ru");
    private Movie fourth = new Movie(4, "fourth", "Horror", "www.fourthURL.ru");
    private Movie fifth = new Movie(5, "fifth", "Fantasy", "www.fifthURL.ru");
    private Movie sixth = new Movie(6, "sixth", "War", "www.sixthURL.ru");
    private Movie seventh = new Movie(7, "seventh", "Musical", "www.seventhURL.ru");
    private Movie eighth = new Movie(8, "eighth", "Sci-fi", "www.eighthURL.ru");
    private Movie ninth = new Movie(9, "ninth", "Western", "www.ninthURL.ru");
    private Movie tenth = new Movie(10, "tenth", "Thriller", "www.tenthURL.ru");
    private Movie eleventh = new Movie(11, "eleventh", "biography", "www.eleventhURL.ru");

    @BeforeEach
    public void setUp() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
    }


    @Test
    void getTheLastMovieMoreThanOnTheList() {
        Movie[] actual = manager.getLastFilms();
        Movie[] expected = new Movie[]{ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        assertArrayEquals(expected, actual);
    }

    @Test
    void getTheLastOneLessThanInTheList() {
        manager.add(tenth);
        manager.add(eleventh);
        Movie[] actual = manager.getLastFilms();
        Movie[] expected = new Movie[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};
        assertArrayEquals(expected, actual);
    }
}