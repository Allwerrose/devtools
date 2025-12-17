package ru.mentee.power;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class MenteeProgressTest {

  @Test
  void shouldFormatSummary_whenProgressCreated() {
    MenteeProgress progress = new MenteeProgress("Алена", 2, 8);

    String result = progress.summary();

    assertThat(result).isEqualTo("Sprint 2 -> Алена: planned 8 h");
  }

  @Test
  void shouldDetectReadiness_whenHoursAboveThreshold() {
    MenteeProgress progress = new MenteeProgress("Алена", 2, 4);

    assertThat(progress.readyForSprint()).isTrue();
  }

  @Test
  void shouldDetectLackOfReadiness_whenHoursBelowThreshold() {
    MenteeProgress progress = new MenteeProgress("Алена", 2, 2);

    assertThat(progress.readyForSprint()).isFalse();
  }
}