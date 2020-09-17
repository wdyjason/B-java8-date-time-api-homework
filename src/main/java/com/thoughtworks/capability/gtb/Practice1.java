package com.thoughtworks.capability.gtb;

import java.time.LocalDate;

/**
 * 计算任意日期与下一个劳动节相差多少天
 *
 * @author itutry
 * @create 2020-05-15_16:33
 */
public class Practice1 {

  public static long getDaysBetweenNextLaborDay(LocalDate date) {
    int year = date.getYear();
    LocalDate laborDayThisYear = LocalDate.of(year, 5, 1);
    if (date.isEqual(laborDayThisYear)) return 0;
    if (date.isAfter(laborDayThisYear)) {
      LocalDate laborDayNextYear = LocalDate.of(year + 1, 5, 1);
      return laborDayNextYear.toEpochDay() - date.toEpochDay();
    }
    return laborDayThisYear.toEpochDay() - date.toEpochDay();
  }
}
