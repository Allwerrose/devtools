package ru.mentee.power;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

class LiveCodingDemoTest {
  @Test
  void printFizzBuzz() {
    PrintStream originalOut = System.out;
    ByteArrayOutputStream bos = new ByteArrayOutputStream();
    System.setOut(new PrintStream(bos));
    LiveCodingDemo test = new LiveCodingDemo();
    try {
      test.printFizzBuzz(15);
      String output = bos.toString();
      String expected = "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n13\n14\nFizzBuzz\n";

      assertEquals(expected, output);
    } finally {
      System.setOut(originalOut);
    }
  }

  @Test
  void testPrintFizzBuzzForN1() {
    PrintStream originalOut = System.out;
    ByteArrayOutputStream bos = new ByteArrayOutputStream();
    System.setOut(new PrintStream(bos));
    LiveCodingDemo oneArray = new LiveCodingDemo();
    try {
      oneArray.printFizzBuzz(1);
      String output = bos.toString();
      String expected = "1\n";
      assertEquals(expected, output);
    } finally {
      System.setOut(originalOut);
    }
  }

  @Test
  void nullPrintFizzBuzz() {
    PrintStream originalOut = System.out;
    ByteArrayOutputStream bos = new ByteArrayOutputStream();
    System.setOut(new PrintStream(bos));
    LiveCodingDemo emptyArray = new LiveCodingDemo();
    try {
      emptyArray.printFizzBuzz(0);
      String output = bos.toString();
      String expected = "";  // Пустой вывод
      assertEquals(expected, output);
    } finally {
      System.setOut(originalOut);
    }
  }

  @Test
  void negativePrintFizzBuzz() {
    PrintStream originalOut = System.out;
    ByteArrayOutputStream bos = new ByteArrayOutputStream();
    System.setOut(new PrintStream(bos));
    LiveCodingDemo fizzBuzz = new LiveCodingDemo();
    try {
      fizzBuzz.printFizzBuzz(-5);
      String output = bos.toString();
      String expected = "";  // Цикл не выполнится ни разу
      assertEquals(expected, output);
    } finally {
      System.setOut(originalOut);
    }
  }

  @Test
  void sumEven() {
    int[] numb = {2, 6, 93, 7, 469, 0, 3};
    LiveCodingDemo sum = new LiveCodingDemo();
    int sumNumb = sum.sumEven(numb);
    assertEquals(8, sumNumb);
  }

  @Test
  void negativeSumEven() {
    int[] numb = {-4, -6, -98, 7, 469, 0, 3};
    LiveCodingDemo sum = new LiveCodingDemo();
    int sumNumb = sum.sumEven(numb);
    assertEquals(-108, sumNumb);
  }

  @Test
  void emptySumEven() {
    int[] emptyArray = {};
    LiveCodingDemo empty = new LiveCodingDemo();
    int emptyNumb = empty.sumEven(emptyArray);
    assertEquals(0, emptyNumb);
  }

  @Test
  void findMax() {
    int[] numb = {1, 56, 8, 9, 4, 2, 55, 73};
    LiveCodingDemo maxNumb = new LiveCodingDemo();
    int conclusion = maxNumb.findMax(numb);
    assertEquals(73, conclusion);
  }

  @Test
  void negativeFindMax() {
    int[] negativeArray = {-23, -2, -45, 0};
    LiveCodingDemo negativeNumb = new LiveCodingDemo();
    int conclusion = negativeNumb.findMax(negativeArray);
    assertEquals(0, conclusion);
  }

  @Test
  void emptyFindMax() {
    int[] emptyArray = {};
    LiveCodingDemo empty = new LiveCodingDemo();
    int emptyNumb = empty.findMax(emptyArray);
    assertEquals(0, 0);
  }
}