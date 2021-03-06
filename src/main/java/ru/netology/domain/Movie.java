package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
public class Movie {
    private int id;
    private String name;
    private String genre;
    private String url;
}
