package astasiak.ms1.flashcardsservice;

import astasiak.ms1.flashcardsservice.model.Flashcard;

import java.util.ArrayList;
import java.util.List;

public class FlashcardsRepository {
    private List<Flashcard> list;

    public FlashcardsRepository() {
        this.list = new ArrayList<>();
    }

    public void addFlashcard(Flashcard card) {
        this.list.add(card);
    }

    public List<Flashcard> listFlashcards() {
        return new ArrayList<>(this.list);
    }
}
