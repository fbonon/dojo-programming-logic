package br.com.cit.dojo.ex4;

import java.util.ArrayList;
import java.util.List;

public class CashMachineService {

    public static List<Integer> getNotes(int value) {
        if(value < 0){
            throw new IllegalArgumentException("Não foi permitido");
        }
        List<Integer> notes = new ArrayList<>();

        notes.add(value / 50);
        value = value - (notes.get(0) * 50);
        notes.add(value / 10);
        value = value - (notes.get(1) * 10);
        notes.add(value / 5);
        value = value - (notes.get(2) * 5);
        notes.add(value / 1);
        return notes;
    }
}
