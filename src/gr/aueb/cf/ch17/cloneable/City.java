package gr.aueb.cf.ch17.cloneable;

import java.util.Objects;

/**
 * Represents a city.
 * <p>
 * This class encapsulates the attributes and behavior of a city,
 * including its name.
 * </p>
 * <p>
 * The class implements the {@link Cloneable} interface to support cloning.
 * </p>
 */
public class City implements Cloneable{
    private String name;

    public City() {}

    public City(String name) {
        this.name = name;
    }

    public City(City city) {
        this.name = city.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    protected City clone() throws CloneNotSupportedException {
        return (City) super.clone(); // Object.clone()
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        City city = (City) other;

        return Objects.equals(name, city.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
