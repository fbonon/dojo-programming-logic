package br.com.cit.dojo.ex6.model;

public class Container {
    private int weight;
    private boolean reefer;

    public Container(int weight, boolean reefer) {
        this.weight = weight;
        this.reefer = reefer;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isReefer() {
        return reefer;
    }

    public void setReefer(boolean reefer) {
        this.reefer = reefer;
    }

    @Override
    public String toString() {
        String containerName = String.valueOf(this.getWeight());

        if (this.isReefer()) {
            containerName = containerName.concat("R");
        }

        return containerName;
    }
}
