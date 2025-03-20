package Stack;

import java.util.*;

public class AsteroidCollision {
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int asteroid : asteroids) {
            boolean destroyed = false;

            while (!stack.isEmpty() && asteroid < 0 && stack.peek() > 0) {
                if (Math.abs(stack.peek()) > Math.abs(asteroid)) {
                    destroyed = true;
                    break;
                } else if (Math.abs(stack.peek()) == Math.abs(asteroid)) {
                    stack.pop();
                    destroyed = true;
                    break;
                } else {
                    stack.pop();
                }
            }

            if (!destroyed) {
                stack.push(asteroid);
            }
        }

        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        int[] asteroids1 = {5, 10, -5};
        System.out.println(Arrays.toString(asteroidCollision(asteroids1))); // [5, 10]

        int[] asteroids2 = {8, -8};
        System.out.println(Arrays.toString(asteroidCollision(asteroids2))); // []

        int[] asteroids3 = {10, 2, -5};
        System.out.println(Arrays.toString(asteroidCollision(asteroids3))); // [10]
    }
}
