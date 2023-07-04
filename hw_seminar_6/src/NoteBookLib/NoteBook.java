package NoteBookLib;

public class NoteBook {

    // объявляем поля класса
    private String cpu;
    private int numOfCores;
    private int frequency;
    private int hdd;
    private int ram;
    private int weight;
    private Double screen;
    private long id;

    // создаем конструктор
    public NoteBook(String cpu, int numOfCores, int frequency, int hdd, int ram, int weight, Double screen, long id) {
        this.cpu = cpu;
        this.numOfCores = numOfCores;
        this.frequency = frequency;
        this.hdd = hdd;
        this.ram = ram;
        this.weight = weight;
        this.screen = screen;
        this.id = id;
    }

    // метод изменения
    public boolean update()
    {
        return true;
    }

    //метод удаления
    public boolean delete()
    {
        return true;
    }
// метод добавления в корзину
    public boolean addToCart()
    {
        return true;
    }

    // переопределяем метод toString
    @Override
    public String toString() {
        return "NoteBook [cpu=" + cpu + ", numOfCores=" + numOfCores + ", frequency=" + frequency + ", hdd=" + hdd
                + ", ram=" + ram + ", weight=" + weight + ", screen=" + screen + ", id=" + id + "]";
    }

    // переопределяем метод hashCode, специально сделал различие между hashCode и equals, чтобы посмотреть как работает
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        // result = prime * result + ((cpu == null) ? 0 : cpu.hashCode());
        // result = prime * result + numOfCores;
        // result = prime * result + frequency;
        // result = prime * result + hdd;
        // result = prime * result + ram;
        // result = prime * result + weight;
        // result = prime * result + ((screen == null) ? 0 : screen.hashCode());
        result = prime * result + (int) (id ^ (id >>> 32));
        return result;
    }

    // переопределяем метод equals, специально сделал различие между equals и hashCode, чтобы посмотреть как работает
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        NoteBook other = (NoteBook) obj;
        if (cpu == null) {
            if (other.cpu != null)
                return false;
        } else if (!cpu.equals(other.cpu))
            return false;
        if (numOfCores != other.numOfCores)
            return false;
        if (frequency != other.frequency)
            return false;
        if (hdd != other.hdd)
            return false;
        if (ram != other.ram)
            return false;
        if (weight != other.weight)
            return false;
        if (screen == null) {
            if (other.screen != null)
                return false;
        } else if (!screen.equals(other.screen))
            return false;
        // if (id != other.id)
        //     return false;
        return true;
    }

}
