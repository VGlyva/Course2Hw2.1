public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;
    public Slytherin(String name, String surName) {
        super(name, surName);
        this.cunning = getRnd().nextInt(101);
        this.determination = getRnd().nextInt(101);
        this.ambition = getRnd().nextInt(101);
        this.resourcefulness = getRnd().nextInt(101);
        this.lustForPower = getRnd().nextInt(101);
        this.setFaculty("Слизерин");
    }
    public int getSumOfFacultyProp() {
        return getCunning() + getDetermination() + getAmbition() + getResourcefulness() + getLustForPower();
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nХитрость: " + cunning +
                " Решительность: " + determination +
                " Амбициозность: " + ambition +
                "\nНаходчивость : " + resourcefulness +
                " Жажда Власти: " + lustForPower;
    }
}