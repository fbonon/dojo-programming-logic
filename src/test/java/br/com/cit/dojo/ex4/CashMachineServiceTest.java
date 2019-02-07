package br.com.cit.dojo.ex4;

import org.apache.commons.collections4.CollectionUtils;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class CashMachineServiceTest {

    @Before
    public void setup() {
    }

    @Test
    public void shouldGetNotesCorrectly() {
        List<Integer> notes1 = CashMachineService.getNotes(0);
        List<Integer> notes2 = CashMachineService.getNotes(20);
        List<Integer> notes3 = CashMachineService.getNotes(49);
        List<Integer> notes4 = CashMachineService.getNotes(166);
        List<Integer> notes5 = CashMachineService.getNotes(201);

        List<Integer> correctAnswer1 = Arrays.asList(0, 0, 0, 0);
        List<Integer> correctAnswer2 = Arrays.asList(0, 2, 0, 0);
        List<Integer> correctAnswer3 = Arrays.asList(0, 4, 1, 4);
        List<Integer> correctAnswer4 = Arrays.asList(3, 1, 1, 1);
        List<Integer> correctAnswer5 = Arrays.asList(4, 0, 0, 1);

        assertTrue(CollectionUtils.isEqualCollection(notes1, correctAnswer1));
        assertTrue(CollectionUtils.isEqualCollection(notes2, correctAnswer2));
        assertTrue(CollectionUtils.isEqualCollection(notes3, correctAnswer3));
        assertTrue(CollectionUtils.isEqualCollection(notes4, correctAnswer4));
        assertTrue(CollectionUtils.isEqualCollection(notes5, correctAnswer5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldNotGetNotesIfNegativeValue() {
        CashMachineService.getNotes(-1);
    }
}
