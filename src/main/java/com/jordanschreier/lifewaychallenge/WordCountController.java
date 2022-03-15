package com.jordanschreier.lifewaychallenge;

import com.jordanschreier.lifewaychallenge.jpa.WordCount;
import com.jordanschreier.lifewaychallenge.jpa.WordCountDao;
import com.jordanschreier.lifewaychallenge.model.WordCountRequest;
import com.jordanschreier.lifewaychallenge.model.WordCountResponse;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.StringTokenizer;

/**
 * REST Controller for the Word Count endpoint.
 *
 * @author Jordan Schreier
 */
@RestController
@RequestMapping("/wordCount")
public class WordCountController {

    @Autowired
    private WordCountDao wordCountDao;

    /**
     * Method to process a {@link WordCountRequest}. It does not save any counts for requests with an ID, in which, we
     * already have an entry for.
     *
     * @param wordCountRequest The {@link WordCountRequest} to process.
     * @return A {@link WordCountResponse} with the count of all words processed since the start of the application.
     */
    @Operation(summary = "Processes a word count request", description = "Saves the word count of a given message "
        + "only if the given ID hasn't previously processed. Returns the total running count of "
        + "words since the application started. Words should only be separated by whitespace.")
    @PostMapping
    public WordCountResponse processWordCount(@RequestBody final WordCountRequest wordCountRequest) {

        int idFromRequest = Integer.parseInt(wordCountRequest.getId());

        if (!this.wordCountDao.existsById(idFromRequest)) {
            this.wordCountDao.saveAndFlush(WordCount.builder()
                .id(idFromRequest)
                .count(new StringTokenizer(wordCountRequest.getMessage()).countTokens())
                .build());
        }

        return new WordCountResponse(this.wordCountDao.findAll().stream().mapToInt(WordCount::getCount).sum());
    }
}
