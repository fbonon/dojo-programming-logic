package br.com.cit.dojo.ex4;

import java.util.ArrayList;
import java.util.List;

public class CashMachineService {

    public static final int[] MACHINE_NOTES = new int[]{50, 10, 5, 1};

    public static List<Integer> getNotes(int value) {
        List<Integer> cashOutNotes = new ArrayList<Integer>();

        if (value >= 0) {
            int remainingValue = value;

            for (int bankNote : MACHINE_NOTES) {
                cashOutNotes.add(remainingValue / bankNote);
                remainingValue %= bankNote;
            }
        } else {
            throw new IllegalArgumentException("O valor a ser sacado não pode ser negativo");
        }

        return cashOutNotes;
    }
}
