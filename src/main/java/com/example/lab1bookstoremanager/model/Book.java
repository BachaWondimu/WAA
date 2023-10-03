package com.example.lab1bookstoremanager.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private int id;
    private String title;
    private String isbn;
    private String author;
}

/*
@Data is a convenient annotation that combines the features of the following annotations:
◦ @ToString
◦ @EqualsAndHashCode
◦ @Getter
◦ @Setter
◦ @RequiredArgsConstructor
 */