public class Kata {

    public static boolean feast(String beast, String dish) {

        char a = beast.charAt(0);
        char b = beast.charAt(beast.length() - 1);
        char c = dish.charAt(0);
        char d = dish.charAt(dish.length() -1);

        return (a==c && b==d);

    }

}
