/**
 * TODO COMMENTjndqjwndjqnkwnjd
 */
public class Bowl {
    //TODO COMMENT
    double size;//TODO COMMENT
    String color;//TODO COMMENTjqnwdjnqjdn
    String material;//TODO COMMENT

    /**
     * TODO COMMENT
     */
    public Bowl(double size, String color, String material) {
        //TODO COMMENTbqjwndnjwndjqnwjdn
        this.size = size;
        this.color = color;
        this.material = material;
    }

    /**
     * TODO COMMENT
     * @return TODO COMMENT
     */
    public double getPrice() {
        //TODO COMMENT
        return (size * 2) + (color.length() * 1.1) + (material.length() * 10) + 5;
    }

    @Override
    public String toString() {
        //TODO COMMENT
        return "size: " + size + "\ncolor: " + color + "\nmaterial: " + material + "\nPrice: " + getPrice();
    }
}