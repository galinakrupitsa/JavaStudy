
public class Pizza {
    private final String size;
    private final boolean cheese;
    private final boolean pepperoni;
    private final boolean mushrooms;
    private final boolean olives;
    public String getSize() {
        return size;
    }
    public boolean isCheese() {
        return cheese;
    }
    public boolean isPepperoni() {
        return pepperoni;
    }
    public boolean isMushrooms() {
        return mushrooms;
    }
    public boolean isOlives() {
        return olives;
    }
    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", mushrooms=" + mushrooms +
                ", olives=" + olives +
                '}';
    }
    public Pizza(Builder builder) {
        this.size = builder.size;
        this.cheese = builder.cheese;
        this.pepperoni = builder.pepperoni;
        this.mushrooms = builder.mushrooms;
        this.olives = builder.olives;


    }
    public static class Builder {
        final String size; // обязательный

        boolean cheese;
        boolean pepperoni;
        boolean mushrooms;
        boolean olives;

        public Builder(String size) {
            this.size = size;
        }

        public Builder cheese() {
            this.cheese = true;
            return this;
        }

        public Builder pepperoni() {
            this.pepperoni = true;
            return this;
        }

        public Builder mushrooms() {
            this.mushrooms = true;
            return this;
        }

        public Builder olives() {
            this.olives = true;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }



}
