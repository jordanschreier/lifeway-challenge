package com.jordanschreier.lifewaychallenge.jpa;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * JPA word count entity for the H2 database. This defines the table and columns in the database. For this
 * challenge, we only really need an ID and a word count.
 *
 * @author Jordan Schreier
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class WordCount {

    @Id
    private int id;
    private int count;
}
