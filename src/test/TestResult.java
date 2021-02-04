package test;
import domain.Exercise;

public class TestResult {

    public static void main(String[] args) {
        String mesage = "88sDanielSs88";
        System.out.println(mesage+" :");
        byte[] m = Exercise.Encrypt(mesage, "stack_overlow");
        for (byte i : m) System.out.print(i);
        System.out.println();
        }
}
