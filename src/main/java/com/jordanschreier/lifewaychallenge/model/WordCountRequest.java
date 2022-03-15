package com.jordanschreier.lifewaychallenge.model;

import lombok.Data;

/**
 * Model representing the input request for Word Count.
 *
 * @author Jordan Schreier
 */
@Data
public class WordCountRequest {
    private String id;
    private String message;
}
