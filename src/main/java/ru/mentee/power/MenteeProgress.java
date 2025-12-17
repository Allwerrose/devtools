package ru.mentee.power;

/**
 * Проверяет не превышает ли минимум часов, формирует готовую строку с данными.
 *
 * @param menteeName Имя студента
 * @param sprintNumber Номер спринта
 * @param plannedHoursPerWeek План часов на неделю
 */
public record MenteeProgress(String menteeName, int sprintNumber, int plannedHoursPerWeek) {
  /**
   * Проверяет, что количество часов >= 3.
   *
   * @return вернет true если количество часов превышает либо равно 3
   */
  public boolean readyForSprint() {
    return plannedHoursPerWeek >= 3;
  }

  /**
   * Заполнение шаблона строки.
   *
   * @return Шаблонная строка, с подставленными значениями
   */
  public String summary() {
    return "Sprint %d -> %s: planned %d h".formatted(sprintNumber, menteeName, plannedHoursPerWeek);
  }
}
