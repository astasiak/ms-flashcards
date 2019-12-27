DROP TABLE IF EXISTS flashcards;

CREATE TABLE flashcards (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  front_side VARCHAR(250) NOT NULL,
  back_side VARCHAR(250) NOT NULL
);

INSERT INTO flashcards (front_side, back_side) VALUES
  ('Okno', 'La finestra'),
  ('Ogień', 'Il fuoco');
