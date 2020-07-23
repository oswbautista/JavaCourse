// Демонстрация использования логических значений
class BoolDemo {
    public static void main(String args[]) {
        boolean b;
        b= false;
        System.out.println("Знaчeниe b: " + b);
        b = true;
        System.out.println("Знaчeниe b " + b);
        // Логическое значение можно использовать для
        // управления условным оператором if
        if (b) {
            System. out. println ( "Эта инструкция вьполняется");
        }
        b = false;
        if(b) {
            System.out.println("Этa инструкция не выполняется");
        }
        // В результате выполнения сравнения получается логическое значение
        System.out.println("Peзyльтaт сравнения 10 > 9: " + (10 > 9));
    }
}