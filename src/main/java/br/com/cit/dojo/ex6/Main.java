package br.com.cit.dojo.ex6;

import br.com.cit.dojo.ex6.model.Container;
import br.com.cit.dojo.ex6.service.CargoShipService;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Container> containers = new ArrayList<Container>();

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

        System.out.println("Before: " + containers);
        containers = CargoShipService.prepareContainersforShipping(containers);
        System.out.println("After: " + containers);
    }
}
