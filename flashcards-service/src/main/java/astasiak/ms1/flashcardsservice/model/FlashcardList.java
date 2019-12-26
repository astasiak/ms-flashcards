package astasiak.ms1.flashcardsservice.model;

import lombok.Value;

import java.util.List;

@Value
public class FlashcardList {
    private final List<Flashcard> cards;
}
