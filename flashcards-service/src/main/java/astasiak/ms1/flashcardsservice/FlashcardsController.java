package astasiak.ms1.flashcardsservice;

import astasiak.ms1.flashcardsservice.model.Flashcard;
import astasiak.ms1.flashcardsservice.model.FlashcardList;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cards")
@AllArgsConstructor
public class FlashcardsController {

    private final FlashcardsRepository repo;

    @RequestMapping("sample")
    public Flashcard getSampleCard() {
        return new Flashcard("Okno", "La finestra");
    }

    @RequestMapping("")
    public FlashcardList listCards() {
        return new FlashcardList(repo.listFlashcards());
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public Flashcard addCard(@RequestBody Flashcard card) {
        repo.addFlashcard(card);
        return card;
    }
}
