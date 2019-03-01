package br.com.cit.dojo.ex6.service;

import br.com.cit.dojo.ex6.model.Container;

import java.util.ArrayList;
import java.util.List;

public class CargoShipService {

    public static List<Container> prepareContainersforShipping(List<Container> containers) {
        List<Container> orderedContainers = new ArrayList<>();
        Container containerAux;

        for (int i = 0; i < containers.size(); i++) {
            for (int j = i + 1; j < containers.size(); j++) {
                if (containers.get(i).getWeight() < containers.get(j).getWeight()) {
                    containerAux = containers.get(i);
                    containers.set(i, containers.get(j));
                    containers.set(j, containerAux);

                }
            }
        }

        for (int i = 0; i < containers.size(); i++) {
            for (int j = i + 1; j < containers.size(); j++) {
                if (containers.get(j).isReefer()) {

                    containerAux = containers.get(i);
                    containers.set(i, containers.get(j));
                    containers.set(j, containerAux);

                } else if (containers.get(i).getWeight() < containers.get(j).getWeight()) {
                    containerAux = containers.get(i);
                    containers.set(i, containers.get(j));
                    containers.set(j, containerAux);
                }
            }
        }

        return containers;
    }
}
