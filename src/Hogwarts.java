import java.util.Random;
public class Hogwarts {
    private final Random rnd = new Random();
    private String name;
    private String surname;
    private String faculty;
    private int powerMagic;
    private int transgressionDistance;
    public Hogwarts(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.powerMagic = rnd.nextInt(101);
        this.transgressionDistance = rnd.nextInt(101);
    }
    public int getSumOfFacultyProp() {
        return 0;
    }

    public void studEquals(Hogwarts hg) {
        if (this.getFaculty().equals(hg.getFaculty())) {
            studEqualsPersonal(hg);
        } else {
            studEqualsHogwarts(hg);
        }
    }

    private void studEqualsHogwarts(Hogwarts hg) {
        if (this.getSumPowerMagic() > hg.getSumPowerMagic()) {
            System.out.println(this.getName() + " " + this.surname + "  обладает большей силой магии ,чем " + hg.getName() + " " + hg.surname);
        } else {
            System.out.println(hg.getName() + " " + hg.surname + " обладает большей силой магии ,чем " + this.getName() + " " + this.surname);
        }
    }

    private void studEqualsPersonal(Hogwarts hg) {
        if (this.getSumOfFacultyProp() > hg.getSumOfFacultyProp())
            System.out.println(this.getName() + " лучший студент "+ this.getFaculty() + " ,чем " + hg.getName());
        else System.out.println(hg.getName() + " лучший студент "+ hg.getFaculty() + " ,чем " + this.getName());
    }

    public int getSumPowerMagic() {
        return powerMagic + transgressionDistance;
    }
    public void printStudent() {
        System.out.println(toString());
    }


    public Random getRnd() {
        return rnd;
    }


    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getPowerMagic() {
        return powerMagic;
    }

    public void setPowerMagic(int powerMagic) {
        this.powerMagic = powerMagic;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    @Override
    public String toString() {
        return "Студент: " + getName() + " " + getSurname() +
                "\nСила магии: " + getPowerMagic() + " Трансгрессия: " + getTransgressionDistance();
    }
}