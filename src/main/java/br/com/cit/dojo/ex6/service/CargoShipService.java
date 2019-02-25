package br.com.cit.dojo.ex6.service;

import br.com.cit.dojo.ex6.model.Container;
import org.apache.commons.collections4.ListUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CargoShipService {

    public static List<Container> prepareContainersforShipping(List<Container> containers) {
        List<Container> reeferList = new ArrayList<>();
        List<Container> noReeferList = new ArrayList<>();

        for (Container container : containers) {
            if (container.isReefer()) {
                reeferList.add(container);
            }
            if (!container.isReefer()) {
                noReeferList.add(container);
            }
        }
        Collections.sort(reeferList, (Container c1, Container c2) -> c2.getWeight() - c1.getWeight());
        Collections.sort(noReeferList, (Container c1, Container c2) -> c2.getWeight() - c1.getWeight());
        return ListUtils.union(reeferList, noReeferList);
    }
}
