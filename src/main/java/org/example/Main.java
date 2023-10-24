package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }

    public int[] singleNumber(int[] nums) {
        List<Integer> list = Arrays.stream(nums).boxed().toList();
        return list.stream().filter(f->list.indexOf(f)==list.lastIndexOf(f)).mapToInt(Integer::intValue).toArray();
    }
}