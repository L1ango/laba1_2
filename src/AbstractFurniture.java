aaa
abstract class AbstractFurniture implements Furniture, Object {
    protected String manufacturer;
    protected double price;
    protected String material;

    public AbstractFurniture(String manufacturer, double price, String material) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.material = material;
    }

    @Override
    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getMaterial() {
        return material;
    }

    @Override
    public String info() {
        return "Manufacturer: " + manufacturer + ", Price: " + price + ", Material: " + material;
    }

    @Override
    public abstract void print();
}
