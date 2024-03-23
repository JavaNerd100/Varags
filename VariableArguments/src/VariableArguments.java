
public class VariableArguments {

    /**
     * Varargs are straightforward to use. But there’re a few rules we have to keep in mind:
     *     1) Each method can only have one varargs parameter
     *     2) The varargs argument must be the last parameter
     *        
     *
     */

    public static void main(String[] args) {
        String[] words = new String[]{"This","is","without","varags"};
        test1(words);
        test2("This","is","with","varags");
        test3(10,15,"This","is","with","varags");


    }

    private static void test1(String[] words) {
        for (String word : words){
            System.out.println(word);
        }
        System.out.println("\n");
    }

    private static void test2(String... words) {
        for (String word : words){
            System.out.println(word);
        }
        System.out.println("\n");
    }


    private static void test3(int num1, int num2, String... words) {
        System.out.println(num1);
        System.out.println(num2);
        for (String word : words){
            System.out.println(word);
        }

    }




}
