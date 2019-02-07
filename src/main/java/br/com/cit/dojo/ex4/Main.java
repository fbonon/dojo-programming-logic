package br.com.cit.dojo.ex4;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> notes = CashMachineService.getNotes(166);

        System.out.println(notes);
    }
}
