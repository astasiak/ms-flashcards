package astasiak.ms1.flashcardsservice;

import astasiak.ms1.flashcardsservice.model.Flashcard;

import java.util.List;

public interface FlashcardsRepository {

    void addFlashcard(Flashcard card);

    List<Flashcard> listFlashcards();
}
