public class Hufflepuff extends Hogwarts{
    private int hardWork;
    private int loyalty;
    private int honesty;
    public Hufflepuff(String name, String surname) {
        super(name,surname);
        this.hardWork = getRnd().nextInt(101);
        this.loyalty = getRnd().nextInt(101);
        this.honesty = getRnd().nextInt(101);
        this.setFaculty("Пуффендуй");
    }
    public int getSumOfFacultyProp() {
        return getHardWork() + getHonesty() + getLoyalty();
    }

    public int getHardWork() {
        return hardWork;
    }

    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nТрудолюбие:  " + hardWork +
                " Преданость: " + loyalty +
                " Честность: " + honesty;
    }
}
