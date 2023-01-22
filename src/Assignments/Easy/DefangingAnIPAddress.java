package Assignments.Easy;

public class DefangingAnIPAddress {
    public static void main(String[] args) {
        System.out.println("Defanging an IP Address");
        System.out.println(defangIPaddr("1.1.1.1"));
    }

    static String defangIPaddr(String address) {
        return address.replaceAll("\\.","[.]");
    }
}
