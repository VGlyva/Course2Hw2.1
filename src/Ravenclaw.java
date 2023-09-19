public class Ravenclaw extends Hufflepuff{
    private int mind;
    private int wisdom;
    private int wit;
    private int creation;
    public Ravenclaw(String name, String surname) {
        super(name, surname);
        this.mind = getRnd().nextInt(101);
        this.wisdom = getRnd().nextInt(101);
        this.wit = getRnd().nextInt(101);
        this.creation = getRnd().nextInt(101);
        this.setFaculty("Когтевран");
    }

    public int getSumOfFacultyProp() {
        return getMind() + getCreation() + getWisdom() + getWit();
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nУм: " + mind +
                " Мудрость: " + wisdom +
                " Остроумие: " + wit +
                " Творчество : " + creation;
    }
}
