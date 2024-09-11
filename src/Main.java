public class Main {
    public static void main(String[] args) {
        Cabinet cabinet = new Cabinet("IKEA", 150.0, "Wood", 100.0, 50.0, 200.0);
        Table table = new Table("IKEA", 120.0, "Metal", 4, 1.5);
        Stool stool = new Stool("IKEA", 30.0, "Wood");
        BarStool barStool = new BarStool("IKEA", 75.0, "Metal", true, 1.2);

        cabinet.print();
        table.print();
        stool.print();
        barStool.print();
    }
}
