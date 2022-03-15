package com.jordanschreier.lifewaychallenge.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Model representing the output response for Word Count.
 *
 * @author Jordan Schreier
 */
@Data
@AllArgsConstructor
public class WordCountResponse {
    private int count;
}
