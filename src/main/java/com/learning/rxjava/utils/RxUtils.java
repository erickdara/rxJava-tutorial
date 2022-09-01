package com.learning.rxjava.utils;

import com.learning.rxjava.models.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RxUtils {

    /**
     * Generate List of positive numbers
     *
     * @param n
     * @return
     */
    public static List<Integer> positiveNumbers(Integer n) {
        //List to hold positiveNumbers of size n
        List<Integer> positiveNumbers = new ArrayList<>(n);

        //Iterate over n elements and add to list
        for (int i = 1; i <= n; i++) {
            positiveNumbers.add(i);
        }
        return positiveNumbers;
    }

    /**
     * List  of positive numbers
     *
     * @param n
     * @return
     */
    public static List<Shape> shapes(Integer n) {
        //List to hold shapes of size n
        List<Shape> shapes = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            shapes.add(new Shape(randomShape(), randomColor()));
        }
        return shapes;
    }

    private static String randomColor() {
        Random random = new Random();
        String[] colors = {"blue", "green", "red", "yellow", "pink"};
        return colors[random.nextInt(getRandomNumberInRange(1, 4))];
    }

    private static String randomShape() {
        Random random = new Random();
        String[] shape = {"square", "triangle", "circle", "pentagon", "hexagon", "stars"};
        return shape[random.nextInt(getRandomNumberInRange(1, 6))];
    }

    private static int getRandomNumberInRange(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
