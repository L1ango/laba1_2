class Cabinet extends AbstractFurniture {
    private double width;
    private double depth;
    private double height;

    public Cabinet(String manufacturer, double price, String material, double width, double depth, double height) {
        super(manufacturer, price, material);
        this.width = width;
        this.depth = depth;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getDepth() {
        return depth;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String info() {
        return super.info() + ", Width: " + width + ", Depth: " + depth + ", Height: " + height;
    }

    @Override
    public void print() {
        System.out.println(info());
    }
}
