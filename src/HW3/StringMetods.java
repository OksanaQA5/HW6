package HW3;
public class StringMetods {
    public static void main(String[] args) {
        String string1 = "This line that i want to cut, cause it is too long";
        String string2 = string1.substring(0, 34);
        String string3 = string2 + " don't want to cut, cause it is perfect";

        System.out.println("string1: " + string1);
        System.out.println("string2: " + string2);
        System.out.println("string3: " + string3);
    }
}
