package ru.mentee.power;

/**
 * Объект менти, с переданными данными.
 *
 * @param name Имя
 * @param city Город
 * @param goal Цель обучающегося, например "Midle developer"
 * @param completedLessons Завершенные уроки на платформе
 * @param totalLessons Общее количество уроков на платформе
 */
public record Mentee (String name, String city, String goal,
                      int completedLessons, int totalLessons) {
  /**
   * Проверка валидности данных.
   *
   * @param name Имя студента
   * @param city Город студента
   * @param goal Цель студента
   * @param completedLessons Завершенные уроки на платформе
   * @param totalLessons Общее количество уроков на платформе
   */
  public Mentee {
    if (completedLessons < 0 || totalLessons <= 0 || completedLessons > totalLessons) {
      throw new IllegalArgumentException("Некорректные значения прогресса");
    }
  }
}
