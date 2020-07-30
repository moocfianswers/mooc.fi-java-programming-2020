
public class HealthStation {

    private int weighings;

    public HealthStation() {
        this.weighings = 0;
    }

    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        this.weighings = this.weighings + 1;
        return person.getWeight();
    }

    public void feed(Person person) {
        int initialWeight = person.getWeight();
        person.setWeight(initialWeight + 1);
    }

    public int weighings() {
        return weighings;
    }
}
