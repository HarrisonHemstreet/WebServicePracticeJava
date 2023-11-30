package com.HarrisonHemstreet;

import java.awt.Point;

/**
 * Hello world!
 *
 */
public class App {
  public static void main(String[] args) {
    Point point1 = new Point(1, 1);
    Point point2 = point1;
    point2.x = 2;
    System.out.println("point1:" + point1);
    System.out.println("point2:" + point2);
  }
}
