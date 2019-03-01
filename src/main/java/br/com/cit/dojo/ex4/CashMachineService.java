package br.com.cit.dojo.ex4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CashMachineService {

    public static List<Integer> getNotes(int value) {

        List<Integer> cash = new ArrayList<>();
        List<Integer> notes = new ArrayList<>(Arrays.asList(50, 10, 5, 1));

        if (value < 0) {
            throw new IllegalArgumentException("Este valor não é permitido!");
        }

        for (Integer note : notes) {
            cash.add(value / note);
            value = value % note;
        }

        return cash;
    }
}
