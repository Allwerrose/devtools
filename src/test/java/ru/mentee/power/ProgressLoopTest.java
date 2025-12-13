package ru.mentee.power;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Тестирование ProgressTracker")
class ProgressLoopTest {

    @Test
    @DisplayName("Должен корректно вычислить суммарный прогресс когда передан массив mentee")
    void shouldCalculateTotalProgress_whenMultipleMentees() {
        // given - подготовка данных
        ProgressTracker tracker = new ProgressTracker();
        Mentee[] mentees = {
                new Mentee("Алена", "Екатеринбург", "Backend", 13, 69),
                new Mentee("Иван", "Москва", "Frontend", 1, 69),
                new Mentee("Дима", "Сочи", "Full-stack", 30, 69)
        };

        // when - выполнение действия
        String result = tracker.calculateTotalProgress(mentees);

        // then - проверка результата с assertJ
        assertThat(result)
                .contains("пройдено 44 из 207 уроков")
                .contains("осталось 163 уроков");
    }

    @Test
    @DisplayName("Должен корректно обработать массив когда все mentee завершили курс")
    void shouldCalculateTotalProgress_whenAllMenteesCompleted() {
        // given
        ProgressTracker tracker = new ProgressTracker();
        Mentee[] mentees = {
                new Mentee("Алена", "Екатеринбург", "Backend", 69, 69),
                new Mentee("Иван", "Москва", "Frontend", 69, 69),

        };

        // when
        String result = tracker.calculateTotalProgress(mentees);

        // then
        assertThat(result)
                .contains("пройдено 138 из 138º уроков")
                .contains("осталось 0 уроков");
    }
}