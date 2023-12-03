// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Person nik = new Teacher(1, "Nikolay", "assistant Professor");
        System.out.println("Dear" + nik.getName());

        PermanentTeacher oleg = new PermanentTeacher(1, "Oleg", "assistant Professor", 10000);
        TemporaryTeacher vlad = new TemporaryTeacher(1, "Vladislav","Professor", 3, 700);
        System.out.println(oleg.getName() + " earns " + oleg.getSalary());
        System.out.println(vlad.getName() + " earns " + vlad.getSalary());

    }
}