public class Grass extends AliveEntity {
    @Override
    public Grass Reproduce() {
        return new Grass();
    }
}
