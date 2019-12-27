package astasiak.ms1.flashcardsservice.db;

import astasiak.ms1.flashcardsservice.FlashcardsRepository;
import astasiak.ms1.flashcardsservice.model.Flashcard;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;
import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Repository
@Primary
@RequiredArgsConstructor
public class FlashcardsDbRepository implements FlashcardsRepository {

    @Autowired
    private final EntityManager entityManager;

    public List<Flashcard> listFlashcards() {
        CriteriaQuery<FlashcardDbModel> cq =
                entityManager.getCriteriaBuilder().createQuery(FlashcardDbModel.class);
        CriteriaQuery<FlashcardDbModel> all = cq.select(cq.from(FlashcardDbModel.class));
        TypedQuery<FlashcardDbModel> allQuery = entityManager.createQuery(all);
        List<FlashcardDbModel> dbList = allQuery.getResultList();
        return dbList.stream().map(this::mapFromDb).collect(Collectors.toList());
    }

    @Transactional
    public void addFlashcard(Flashcard card) {
        entityManager.persist(mapToDb(card));
    }

    private Flashcard mapFromDb(FlashcardDbModel flashcardDbModel) {
        return new Flashcard(
                flashcardDbModel.getFrontSide(),
                flashcardDbModel.getBackSide());
    }

    private FlashcardDbModel mapToDb(Flashcard flashcard) {
        return new FlashcardDbModel(
                0,
                flashcard.getFrontSide(),
                flashcard.getBackSide());
    }
}
