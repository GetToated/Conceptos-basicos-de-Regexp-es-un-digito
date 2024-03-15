public class Kata {
    public static String nameThatNumber(int x) {
        if (x > 99) {
            return "No esta en el rango";
        }
        if (x == 0) {
            return "zero";
        }
        String[] primeros = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] decenas = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        if (x < 20) {
            return primeros[x];
        } else {
            int digitosdediez = x / 10;
            int digitosdeuno = x % 10;
            return decenas[digitosdediez] + (digitosdeuno !=0 ? " " + primeros[digitosdeuno] : "");
        }
    }
    public static void main(String [] args) {
        System.out.println(nameThatNumber(4));
        System.out.println(nameThatNumber(15));
        System.out.println(nameThatNumber(99));

    }
}