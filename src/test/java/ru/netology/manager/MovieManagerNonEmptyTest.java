package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.MovieInfo;
import ru.netology.manager.MovieManager;

import static org.junit.jupiter.api.Assertions.*;

public class MovieManagerNonEmptyTest {
    MovieManager manager = new MovieManager();
    private MovieInfo movie1 = new MovieInfo(1, 11111, "Бладшот", "боевик", "picture11111", false);
    private MovieInfo movie2 = new MovieInfo(2, 22222, "Вперед", "мультфильм", "picture22222", false);
    private MovieInfo movie3 = new MovieInfo(3, 33333, "Отель Белград", "комедия", "picture33333", false);
    private MovieInfo movie4 = new MovieInfo(4, 44444, "Джентльмены", "боевик", "picture44444", false);
    private MovieInfo movie5 = new MovieInfo(5, 55555, "Человек-невидимка", "ужасы", "picture55555", false);
    private MovieInfo movie6 = new MovieInfo(6, 66666, "Тролли. Мировой тур", "мультфильм", "picture66666", true);
    private MovieInfo movie7 = new MovieInfo(7, 77777, "Номер один", "комедия", "picture77777", true);
    private MovieInfo movie8 = new MovieInfo(8, 88888, "Назад в будущее", "фантастика", "picture88888", false);
    private MovieInfo movie9 = new MovieInfo(9, 99999, "Пятый элемент", "фантастика", "picture99999", false);
    private MovieInfo movie10 = new MovieInfo(10, 101010, "Дюна", "фантастика", "picture101010", false);
    private MovieInfo movie11 = new MovieInfo(11, 111111, "Вспомнить все", "фантастика", "111111", false);

    @Test
    public void shouldAddMovie() {
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);
        manager.addMovie(movie6);
        MovieInfo[] actual = manager.getLatest();
        MovieInfo[] expected = new MovieInfo[]{movie6, movie5, movie4, movie3, movie2, movie1};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSetMoviesLengthToDefault() {
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);
        manager.addMovie(movie6);
        manager.addMovie(movie7);
        manager.addMovie(movie8);
        manager.addMovie(movie9);
        manager.addMovie(movie10);
        manager.addMovie(movie11);

        MovieInfo[] actual = manager.getLatest();
        MovieInfo[] expected = new MovieInfo[]{movie11, movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2};
        assertArrayEquals(expected, actual);
    }
}

//    @Test
//    public void shouldRemoveIfExists() {
//        MovieManager manager = new MovieManager();
////        int idToRemove = 1;
//        MovieInfo first = new MovieInfo(1, "first", 1);
//        MovieInfo second = new MovieInfo(2, "second", 2);
//        MovieInfo third = new MovieInfo(3, "third", 3);
//        manager.add(first);
//        manager.add(second);
//        manager.add(third);
//
////        manager.removeById(idToRemove);
//
//        MovieInfo[] actual = manager.getAll();
//        MovieInfo[] expected = new MovieInfo[]{third, second, first};
//
////    assertEquals(expected, actual);
//        assertArrayEquals(expected, actual);
//    }
//
//    @Test
//    public void shouldNotRemoveIfNotExists() {
//        MovieManager manager = new MovieManager();
////        int idToRemove = 4;
//        MovieInfo first = new MovieInfo(1, "first", 1);
//        MovieInfo second = new MovieInfo(2, "second", 2);
//        MovieInfo third = new MovieInfo(3,"third", 3);
//        manager.add(first);
//        manager.add(second);
//        manager.add(third);
//
////        manager.removeById(idToRemove);
//
//        MovieInfo[] actual = manager.getAll();
//        MovieInfo[] expected = new MovieInfo[]{third, second, first};
//
//        assertArrayEquals(expected, actual);
//    }
