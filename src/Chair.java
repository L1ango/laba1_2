abstract class Chair implements Furniture, Object {
    protected String manufacturer;
    protected double price;
    protected String material;
    protected boolean adjustableBackrest;

    public Chair(String manufacturer, double price, String material, boolean adjustableBackrest) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.material = material;
        this.adjustableBackrest = adjustableBackrest;
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

    public boolean isAdjustableBackrest() {
        return adjustableBackrest;
    }

    @Override
    public abstract String info();

    @Override
    public abstract void print();
}

class Stool extends Chair {
    public Stool(String manufacturer, double price, String material) {
        super(manufacturer, price, material, false);
    }

    @Override
    public String info() {
        return "Stool - Manufacturer: " + manufacturer + ", Price: " + price + ", Material: " + material;
    }

    @Override
    public void print() {
        System.out.println(info());
    }
}

class BarStool extends Chair {
    private double seatHeight;

    public BarStool(String manufacturer, double price, String material, boolean adjustableBackrest, double seatHeight) {
        super(manufacturer, price, material, adjustableBackrest);
        this.seatHeight = seatHeight;
    }

    public double getSeatHeight() {
        return seatHeight;
    }

    @Override
    public String info() {
        return "BarStool - Manufacturer: " + manufacturer + ", Price: " + price + ", Material: " + material +
                ", Adjustable Backrest: " + adjustableBackrest + ", Seat Height: " + seatHeight;
    }

    @Override
    public void print() {
        System.out.println(info());
    }
}
