public class TestProgrammer {
    public static void main(String[] args) {
        Programmer programmer1 = new Programmer();
        Programmer programmer2 = new Programmer();

        programmer1.name = "John";
        programmer1.age = 30;
        programmer1.wearsGlasses = false;

        programmer1.drinkCoffe();
        programmer1.printDetails();

        programmer2.name = "Roberta";
        programmer2.age = 26;
        programmer2.wearsGlasses = true;

        programmer2.printDetails();
        programmer2.hasGlasses();
    }
}