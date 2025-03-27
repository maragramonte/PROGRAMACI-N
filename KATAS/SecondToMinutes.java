public class SecondToMinutes {
    public static void main(String[] args) {
        int sec_ini;
        int min;
        int sec_rest;
        sec_ini = 103;
        min = (sec_ini / 60);
        sec_rest = (sec_ini % 60);
        System.out.println(min + " min " + sec_rest + " seconds");
    }
}