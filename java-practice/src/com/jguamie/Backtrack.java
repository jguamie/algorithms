package com.jguamie;

import java.util.ArrayList;
import java.util.List;

/*
     a         b          c
    / \       / \        / \
   ab ac     ba bc      ca cb
  /     \   /     \    /     \
abc    acb  bac  bca  cba    cab
 */
public class Backtrack {
    public static void main(String[] args) {
        Backtrack backtrack = new Backtrack();
        for (String p : backtrack.permutations("abc")) {
            System.out.println(p);
        }
    }

    List<String> permutations(String input) {
        List<String> retVal = new ArrayList<>();
        permutations(retVal, input.toCharArray(), 0, input.length() - 1);
        return retVal;
    }

    private void permutations(List<String> result, char[] input, int lhs, int rhs) {
        if (lhs == rhs)
            result.add(new String(input));
        else {
            for (int i = lhs; i <= rhs; i++) {
                swap(input, lhs, i);
                permutations(result, input, lhs + 1, rhs);
                swap(input, lhs, i);
            }
        }
    }

    void swap(char[] arr, int lhs, int rhs) {
        char lc = arr[lhs];
        arr[lhs] = arr[rhs];
        arr[rhs] = lc;
    }
}
