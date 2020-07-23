/*
Определение длины гипотенузы, исходя из длины катетов,
по теореме Пифагора
*/
class Hypot {
    public static void main(String args[]) {
        double x, у, z;
        x = 3;
        у = 4;
        z = Math.sqrt(x*x + у*у);
        System.out.println("Длинa гипотенузы: " +z);
    }
}