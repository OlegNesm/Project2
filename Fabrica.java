public class Fabrica extends AliveEntity{
    public static AliveEntity createEntity(String type) {
        AliveEntity aliveEntity= null;
        switch (type) {
            case "caterpillar":
                aliveEntity= new Caterpillar();
            case "grass":
                aliveEntity= new Grass();
                new Grass();
            case "wolf":
                aliveEntity= new Wolf();
                new Wolf();
            case "boa":
                aliveEntity= new Boa();
                new Boa();
            case "fox":
                aliveEntity= new Fox();
                new Fox();
            case "bear":
                aliveEntity= new Bear();
                new Bear();
            case "eagle":
                aliveEntity= new Eagle();
                new Eagle();
            case "horse":
                aliveEntity= new Horse();
                new Horse();
            case "deep":
                aliveEntity= new Deep();
                new Deep();
            case " rabbit":
                aliveEntity= new Rabbit();
                new Rabbit();
            case "mouse":
                aliveEntity= new Mouse();
                new Mouse();
            case "goat":
                aliveEntity= new Goat();
                new Goat();
            case "sheep":
                aliveEntity= new Sheep();
                new Sheep();
            case "boar":
                aliveEntity= new Boar();
                new Boar();
            case "buffalo":
                aliveEntity= new Buffalo();
                new Buffalo();
            case "duck":
                aliveEntity= new Duck();
                new Duck();
                break;
        }
        return aliveEntity;
    }

    @Override
    public AliveEntity Reproduce() {
        return null;
    }
}
