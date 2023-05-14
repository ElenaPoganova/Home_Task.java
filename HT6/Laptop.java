package HT6;

public class Laptop {
    String model;
    Integer random_acces_memory;
    Integer hard_disk;
    String operating_system;
    Integer battery;
    Integer weight;
    Double screen_diagonal;
    String color;
    Integer price;
    Boolean is_good;

    public Laptop(String model, Integer random_acces_memory, Integer hard_disk, String operating_system,
    Integer battery, Integer weight, Double screen_diagonal, String color, Integer price, Boolean is_good) {
        this.model = model;
        this.random_acces_memory = random_acces_memory;
        this.hard_disk = hard_disk;
        this.operating_system = operating_system;
        this.battery = battery;
        this.weight = weight;
        this.screen_diagonal = screen_diagonal;
        this.color = color;
        this.price = price;
        this.is_good = is_good;    
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getRandom_acces_memory() {
        return random_acces_memory;
    }

    public void setRandom_acces_memory(Integer random_acces_memory) {
        this.random_acces_memory = random_acces_memory;
    }

    public Integer getHard_disk() {
        return hard_disk;
    }

    public void setHard_disk(Integer hard_disk) {
        this.hard_disk = hard_disk;
    }

    public String getOperating_system() {
        return operating_system;
    }

    public void setOperating_system(String operating_system) {
        this.operating_system = operating_system;
    }

    public Integer getBattery() {
        return battery;
    }

    public void setBattery(Integer battery) {
        this.battery = battery;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Double getScreen_diagonal() {
        return screen_diagonal;
    }

    public void setScreen_diagonal(Double screen_diagonal) {
        this.screen_diagonal = screen_diagonal;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Boolean getIs_good() {
        return is_good;
    }

    public void setIs_good(Boolean is_good) {
        this.is_good = is_good;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + ((random_acces_memory == null) ? 0 : random_acces_memory.hashCode());
        result = prime * result + ((hard_disk == null) ? 0 : hard_disk.hashCode());
        result = prime * result + ((operating_system == null) ? 0 : operating_system.hashCode());
        result = prime * result + ((battery == null) ? 0 : battery.hashCode());
        result = prime * result + ((weight == null) ? 0 : weight.hashCode());
        result = prime * result + ((screen_diagonal == null) ? 0 : screen_diagonal.hashCode());
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        result = prime * result + ((price == null) ? 0 : price.hashCode());
        result = prime * result + ((is_good == null) ? 0 : is_good.hashCode());
        return result;
    }

}
@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    Laptop other = (Laptop) obj;
    if (model == null) {
        if (other.model != null)
            return false;
    } else if (!model.equals(other.model))
        return false;
    if (random_acces_memory == null) {
        if (other.random_acces_memory != null)
            return false;
    } else if (!random_acces_memory.equals(other.random_acces_memory))
        return false;
    if (hard_disk == null) {
        if (other.hard_disk != null)
            return false;
    } else if (!hard_disk.equals(other.hard_disk))
        return false;
    if (operating_system == null) {
        if (other.operating_system != null)
            return false;
    } else if (!operating_system.equals(other.operating_system))
        return false;
    if (battery == null) {
        if (other.battery != null)
            return false;
    } else if (!battery.equals(other.battery))
        return false;
    if (weight == null) {
        if (other.weight != null)
            return false;
    } else if (!weight.equals(other.weight))
        return false;
    if (screen_diagonal == null) {
        if (other.screen_diagonal != null)
            return false;
    } else if (!screen_diagonal.equals(other.screen_diagonal))
        return false;
    if (color == null) {
        if (other.color != null)
            return false;
    } else if (!color.equals(other.color))
        return false;
    if (price == null) {
        if (other.price != null)
            return false;
    } else if (!price.equals(other.price))
        return false;
    if (is_good == null) {
        if (other.is_good != null)
            return false;
    } else if (!is_good.equals(other.is_good))
        return false;
    return true;
}



