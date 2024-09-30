package id.landcruiserprado.praktikum.modul4;

public class perkenalan {
    public void greet() {
        System.out.println("Hello!!");
    }
    public String intro(String name, String city, String citacita) {
        return "Perkenalkan, " + name + " asal " + city + ", cita-cita saya: " + citacita;
    }
    public void printAge(int age) {
        System.out.println("Aku berumur " + age + " tahun");
    }
    public static void main(String[] args) {
        perkenalan objek = new perkenalan();
        objek.greet();
        String printMe = objek.intro("Budiono Siregar", "Medan", "Kapal Lawud");
        System.out.println(printMe);
        objek.printAge(17);
    }
}
