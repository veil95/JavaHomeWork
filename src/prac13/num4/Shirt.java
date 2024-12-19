package prac13.num4;

public class Shirt {
    private String id;
    private String name;
    private String color;
    private String size;

    public Shirt(String id, String name, String color, String size) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.size = size;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Shirt Details:\n");
        sb.append("ID: ").append(id).append("\n");
        sb.append("Name: ").append(name).append("\n");
        sb.append("Color: ").append(color).append("\n");
        sb.append("Size: ").append(size).append("\n");
        return sb.toString();
    }

    // Метод для создания объекта Shirt из строки
    public static Shirt fromString(String shirtData) {
        String[] fields = shirtData.split(",");
        return new Shirt(fields[0], fields[1], fields[2], fields[3]);
    }
}
