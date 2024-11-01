
public class PreetyPrinting {
    public static void main(String[] args) {
        float a = 123.53634f;
        // use printf() for formated print, here "%f" is a placeholder and .2f limit the decimal precision
        System.out.printf("Formated number is %.2f \n", a); // it also tound off the value

        System.out.println(Math.PI);    // value of pi = 3.141592653589793
        System.out.printf("pi: %.3f \n", Math.PI);

        // In order what you place the placeholder in that order you have to place the variables respectively
        System.out.printf("Hello my name is %s and i watch %s and my age is %d . \n", "Karan", "Anime", 21);
    }
}
