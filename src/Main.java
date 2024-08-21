import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {
                2002, 2015, 2055, 1456, 2013,
                1449, 1979, 2001, 1975, 2050,
                2500, 1500, 2021, 1989, 2026
        };

        String[] array2 = {
                "Java",
                "Python",
                "PHP",
                "C#",
                "C++"
        };

        System.out.println(Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));

        System.out.println(Arrays.toString(array2));
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));
    }
}
