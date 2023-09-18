public class Main {
    public static void separator() {
        System.out.println("===============");
    }
    public static void main(String[] args) {
        Hogwarts harry = new Gryffindor("Гарри", "Поттер");
        Hogwarts ron = new Gryffindor("Рон", "Уизли");
        Hogwarts hermiona = new Gryffindor("Гермиона", "Грейнджер");
        Hogwarts zahariya = new Hufflepuff("Захария", "Смит");
        Hogwarts sedric = new Hufflepuff("Седрик", "Дигори");
        Hogwarts dzhastin = new Hufflepuff("Джастин", "Финч-Флетчли");
        Hogwarts chzhou = new Ravenclaw("Чжоу", "Чанг");
        Hogwarts padma = new Ravenclaw("Падма", "Патил");
        Hogwarts markus = new Ravenclaw("Марукс", "Белби");
        Hogwarts drako = new Slytherin("Драко", "Малфой");
        Hogwarts grakham = new Slytherin("Грэхэм", "Монтегю");
        Hogwarts gregery = new Slytherin("Грегери", "Гоил");
        ron.printStudent();
        separator();
        sedric.printStudent();
        separator();
        markus.printStudent();
        separator();
        drako.printStudent();
        separator();
        grakham.studEquals(gregery);
        separator();
        drako.studEquals(harry);
    }

}