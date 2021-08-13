package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MovieInfo {
    private int id;
    private int movieId;
    private String movieName;
    private String genre;
    private String picture;
    private boolean premier;
}