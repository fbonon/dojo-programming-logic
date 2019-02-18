package br.com.cit.dojo.ex6.service;

import br.com.cit.dojo.ex6.model.Container;
import org.apache.commons.collections4.ListUtils;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CargoShipService {

    public static List<Container> prepareContainersforShipping(List<Container> containers) {
        List<Container> reefers = containers.stream().filter(Container::isReefer).collect(Collectors.toList());
        List<Container> notReefers = containers.stream().filter(c -> !c.isReefer()).collect(Collectors.toList());

        Collections.sort(reefers, (Container c1, Container c2) -> c2.getWeight() - c1.getWeight());
        Collections.sort(notReefers, (Container c1, Container c2) -> c2.getWeight() - c1.getWeight());

        return ListUtils.union(reefers, notReefers);
    }
}
