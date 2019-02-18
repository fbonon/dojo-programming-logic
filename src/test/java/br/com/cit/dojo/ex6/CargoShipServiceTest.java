package br.com.cit.dojo.ex6;

import br.com.cit.dojo.ex6.model.Container;
import br.com.cit.dojo.ex6.service.CargoShipService;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CargoShipServiceTest {

    @Before
    public void setup() {
    }

    @Test
    public void shouldOrderContainersCorrectly() {
        List<Container> containers = new ArrayList<Container>();
        List<Container> finalContainers = new ArrayList<Container>();

        Container c1 = new Container(150, false);
        Container c2 = new Container(60, false);
        Container c3 = new Container(420, false);
        Container c4 = new Container(150, true);
        Container c5 = new Container(300, true);
        Container c6 = new Container(540, false);

        containers.add(c1);
        containers.add(c2);
        containers.add(c3);
        containers.add(c4);
        containers.add(c5);
        containers.add(c6);

        containers = CargoShipService.prepareContainersforShipping(containers);

        assertEquals(c5, containers.get(0));
        assertEquals(c4, containers.get(1));
        assertEquals(c6, containers.get(2));
        assertEquals(c3, containers.get(3));
        assertEquals(c1, containers.get(4));
        assertEquals(c2, containers.get(5));
        assertEquals(6, containers.size());
    }

    @Test
    public void shouldWorkForEmptyList() {
        List<Container> containers = new ArrayList<Container>();

        containers = CargoShipService.prepareContainersforShipping(containers);

        assertEquals(0, containers.size());
    }
}
