package ru.mentee.power;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Тестирование ProgressTracker")
class ProgressLoopTest {

  @Test
  @DisplayName("Должен корректно вычислить суммарный прогресс когда передан массив mentee")
  void shouldCalculateTotalProgress_whenMultipleMentees() {
    // given - подготовка данных
    ProgressTracker tracker = new ProgressTracker();
    Mentee[] mentees = {
      new Mentee("Иван", "Екатеринбург", "Backend", 5, 12),
      new Mentee("Мария", "Москва", "Frontend", 8, 12),
      new Mentee("Петр", "Сочи", "Full-stack", 12, 12)
    };

    // when - выполнение действия
    String result = tracker.calculateTotalProgress(mentees);

    // then - проверка результата с assertJ
    assertThat(result)
        .contains("пройдено 25 из 36 уроков")
        .contains("осталось 11 уроков");
  }

  @Test
  @DisplayName("Должен корректно обработать массив когда все mentee завершили курс")
  void shouldCalculateTotalProgress_whenAllMenteesCompleted() {
    // given
    ProgressTracker tracker = new ProgressTracker();
    Mentee[] mentees = {
      new Mentee("Иван", "Екатеринбург", "Backend", 12, 12),
      new Mentee("Мария", "Москва", "Frontend", 12, 12),

    };

    String result = tracker.calculateTotalProgress(mentees);

    assertThat(result)
        .contains("пройдено 24 из 24 уроков")
        .contains("осталось 0 уроков");
  }
}