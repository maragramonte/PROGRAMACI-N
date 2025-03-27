public class Dalmatas {

    public static String howManyDalmations(int number) {
        String[] dogs = {"Hardly any", "More than a handful!", "Woah that's a lot of dogs!", "101 DALMATIONS!!!"};
        
        if (number <= 10) {
            return dogs[0]; // "Hardly any"
        } else if (number <= 50) {
            return dogs[1]; // "More than a handful!"
        } else if (number <= 101) {
            return dogs[2]; // "Woah that's a lot of dogs!"
        } else {
            return dogs[3]; // "101 DALMATIONS!!!"
        }
    }

    public static void main(String[] args) {
        System.out.println(howManyDalmations(5));  // "Hardly any"
        System.out.println(howManyDalmations(20)); // "More than a handful!"
        System.out.println(howManyDalmations(70)); // "Woah that's a lot of dogs!"
        System.out.println(howManyDalmations(102)); // "101 DALMATIONS!!!"
    }
}