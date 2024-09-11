class Table extends AbstractFurniture {
    private int numberOfDrawers;
    private double workSurfaceArea;

    public Table(String manufacturer, double price, String material, int numberOfDrawers, double workSurfaceArea) {
        super(manufacturer, price, material);
        this.numberOfDrawers = numberOfDrawers;
        this.workSurfaceArea = workSurfaceArea;
    }

    public int getNumberOfDrawers() {
        return numberOfDrawers;
    }

    public double getWorkSurfaceArea() {
        return workSurfaceArea;
    }

    @Override
    public String info() {
        return super.info() + ", Number of Drawers: " + numberOfDrawers + ", Work Surface Area: " + workSurfaceArea;
    }

    @Override
    public void print() {
        System.out.println(info());
    }
}
