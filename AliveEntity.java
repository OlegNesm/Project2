public abstract class AliveEntity {

    public int population;
    public int getPopulation() {
        return population;
    }
    public void setPopulation(int population) {
        this.population = population;
    }

    public float chance;

    public float getChance() {
        return chance;
    }
    public void setChance(float chance) {
        this.chance = chance;
    }
    public abstract void Reproduce();
}
