package astasiak.ms1.flashcardsservice.db;

import astasiak.ms1.flashcardsservice.FlashcardsRepository;
import astasiak.ms1.flashcardsservice.model.Flashcard;

import java.util.ArrayList;
import java.util.List;

public class FlashcardsMemoryRepository implements FlashcardsRepository {

    private List<Flashcard> list;

    public FlashcardsMemoryRepository() {
        this.list = new ArrayList<>();
    }

    public void addFlashcard(Flashcard card) {
        this.list.add(card);
    }

    public List<Flashcard> listFlashcards() {
        return new ArrayList<>(this.list);
    }
}
