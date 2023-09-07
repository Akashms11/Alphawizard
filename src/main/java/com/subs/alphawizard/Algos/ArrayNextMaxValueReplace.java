package com.subs.alphawizard.Algos;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Stack;

public class ArrayNextMaxValueReplace {
        public static int[] nextGreaterElements(int[] arr) {
            int n = arr.length;
            int[] result = new int[n];
            Arrays.fill(result, -1);
            Deque<Integer> stack = new ArrayDeque<>();

            for (int i = 0; i < n; i++) {
                while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
                    result[stack.pop()] = arr[i];
                }
                stack.push(i);
            }

            return result;
        }

        public static void main(String[] args) {
            int[] inputArray = {4, 5, 2, 10, 8};
            int[] outputArray = nextGreaterElements(inputArray);

            for (int num : outputArray) {
                System.out.print(num + " ");
            }
            // Output: 5 10 10 -1 -1
        }
    }
