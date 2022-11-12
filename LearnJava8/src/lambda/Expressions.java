package lambda;

@FunctionalInterface
public interface Expressions {
    /**
     * Method no param
     *
     * @return whatever string
     */
//    String say();

    /**
     * Method have a param
     *
     * @param name: string name
     * @return whatever name
     */
//    String say(String name);

    /**
     * Method with multiple parameters
     *
     * @param a: num 1st
     * @param b: num 2st
     *
     * @return result of calculate with two number
     */
    int calcWithTwoNumber(int a, int b);
}

