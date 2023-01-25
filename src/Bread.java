public class Bread implements Baked{
    @Override
    public void Backed() {
        System.out.println("Baked bread");
    }

    @Override
    public String toString() {
        return "Bread";
    }
}
