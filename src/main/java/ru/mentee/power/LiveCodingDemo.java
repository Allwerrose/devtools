package ru.mentee.power;

/**
 * Класс для подготовки к live coding.
 */
public class LiveCodingDemo {
  /**
   * Метод printFizzBuzz.
   *
   * @param n - число для проверки
   */
  public static void printFizzBuzz(int n) {
    for (int i = 1; i <= n; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        System.out.println("FizzBuzz");
      } else if (i % 3 == 0) {
        System.out.println("Fizz");
      } else if (i % 5 == 0) {
        System.out.println("Buzz");
      } else {
        System.out.println(i);
      }
    }
  }

  /**
   * Метод sumEven.
   *
   * @param numbers массив чисел
   * @return сумма чисел
   */
  public static int sumEven(int[] numbers) {
    if (numbers.length != 0) {
      int count = 0;
      for (int i : numbers) {
        if (i % 2 == 0) {
          count += i;
        }
      }
      System.out.println(count);
      return count;
    } else {
      System.out.println("Пустой массив");
      return 0;
    }

  }

  /**
   * Метод findMax.
   *
   * @param numbers массив чисел
   * @return Наибольшее число
   */
  public static int findMax(int[] numbers) {
    int max = 0;
    if (numbers.length != 0) {
      for (int i : numbers) {
        if (i > max) {
          max = i;
        }
      }
      System.out.println(max);
    } else {
      System.out.println("Пустой массив");
      return 0;
    }
    return max;
  }
}