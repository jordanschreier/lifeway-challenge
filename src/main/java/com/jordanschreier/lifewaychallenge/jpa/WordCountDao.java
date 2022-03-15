package com.jordanschreier.lifewaychallenge.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * JPA repository interface for type {@link WordCount}.
 *
 * @author Jordan Schreier
 */
@Repository
public interface WordCountDao extends JpaRepository<WordCount, Integer> {

}
