package drugstore;

public  abstract class Component implements Comparable<Component> {
    private String title;
    private Double weight;
    private  Integer power;

    public Component(String title, Double weight, Integer power) {
        this.title = title;
        this.weight = weight;
        this.power = power;
    }

    public Integer getPower() {
        return power;
    }
    public Double getWeight (){
        return weight;
    }
    public Double getVolume (){
        return power * weight;
    }

    @Override
    public String toString() {
        return String.format("Title = %s, power = %s , weight = %s, volume = %.2f \n", title, power, weight, power*weight);
    }

    @Override
    public int compareTo(Component o) {
        return this.getVolume().compareTo(o.getVolume());
    }
    //второй способ
//        if (this.power < o.power) return -1;
//        else if (this.power > o.power) return 1;
//        else return 0;
}