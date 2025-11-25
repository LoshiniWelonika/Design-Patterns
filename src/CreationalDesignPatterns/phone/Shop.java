package CreationalDesignPatterns.phone;

public class Shop {
    public static void main(String[] args) {
        Phone p = new PhoneBuilder().setOs("Android").setRam(2).setBattery(3000).build();
        System.out.println(p);
    }
}
