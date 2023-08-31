package Model;

public class Toy {

    private long id;
    private String name;
    private int count;
    private byte weight;

    public Toy(long id, String name, int count, byte weight) {
        this.id = id;
        this.name = name;
        this.count = count;
        this.weight = weight;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public byte getWeight() {
        return weight;
    }

    public void setWeight(byte weight) {
        this.weight = weight;
    }

}