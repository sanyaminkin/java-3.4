package ru.netology.manager;

import lombok.Data;
import ru.netology.domain.MovieInfo;

@Data
public class MovieManager {

    int maxLength = 10;

    private MovieInfo[] movies = new MovieInfo[0];

    public MovieManager() {
    }

    public MovieManager(int maxLengths) {

        this.maxLength = maxLength;
    }


    public void addMovie(MovieInfo movie) {
        int resultLength = movies.length + 1;
        MovieInfo[] tmp = new MovieInfo[resultLength];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;
    }

    public int setMaxLength(int newMaxLength) {
        if (newMaxLength < 0) {
            return maxLength;
        }
        maxLength = newMaxLength;
        return maxLength;
    }

    public MovieInfo[] getLatest() {

        int resultLength;
        if (movies.length > maxLength) {
            resultLength = maxLength;
        } else{
            resultLength = movies.length;
        }
        MovieInfo[] result = new MovieInfo[resultLength];
        for (int i = 0; i < resultLength; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }

}
