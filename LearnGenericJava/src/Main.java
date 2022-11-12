import java.util.*;

/**
 * Generic programming:
 * - Là việc cho phép 1 class hay 1 method xử lý các đối tượng thuộc 1 kiểu dữ liệu bất kỳ
 * <p>
 * Một số quy ước trong generics:
 * T - Type (Kiểu dữ liệu bất kỳ thuộc Wrapper class: String, Integer, Long, Float, …)
 * E – Element (phần tử – được sử dụng phổ biến trong Collection Framework)
 * K – Key (khóa)
 * V – Value (giá trị)
 * N – Number (kiểu số: Integer, Double, Float, …)
 * U,S,I,G, … (tùy theo kiểu của người dùng đặt)
 * <p>
 * Lợi ích của generic:
 *  - Kiểu đối tượng an toàn:
 *      + Chúng ta chỉ có thể lưu một kiểu đối tượng duy nhất trong generics.
 *      + Nó không cho phép lưu trữ 2 đối tượng có kiểu khác nhau.
 *  - Không cần phải ép kiểu:
 *      + Vd:
 *          * Trước generic
 *              List list = new ArrayList();
 *              list.add("hello");
 *              String s = (String) list.get(0);// ép kiểu
 *          * Sau generic:
 *              List<String> list = new ArrayList<String>();
 *              list.add("hello");
 *              String s = list.get(0);
 *  - Kiểm tra lúc biên dịch: Nó kiểu tra lỗi khi biên dịch nên sẽ không bị lỗi lúc runtime.
 */
public class Main {
    /**
     * Generic with function
     *
     * @param whatever: whatever param
     * @param <T>: type of param
     */
    public static <T> void createGenericFunc(T whatever) {
        System.out.println(whatever + "!!!");
    }

    /**
     * Generic with wild card(Generic với ký tự đại diện: ?)
     *
     * @param list: whatever list
     */
    public static void createGenericWildCard(List<?> list) {
        list.forEach(System.out::println);
    }

    public static void createGenericWildCardExtendAnimal(List<? extends Animal> list) {
        list.forEach(l -> System.out.println(l.getName()));
    }

    public static void main(String[] args) {
        Dictionary<String, Integer> humanMap = new Dictionary<>();
        humanMap.add("Hieu Vo", 22);
        humanMap.add("Hieu Le", 22);
        humanMap.add("Thuan Bui", 25);
        humanMap.update("Hieu Vo", 24);
        humanMap.remove("Hieu Vo");
        humanMap.show();

        createGenericFunc("Hello World");

        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        stringList.add(":>");
        createGenericWildCard(stringList);

        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("cat1", 1, "male"));
        cats.add(new Cat("cat2", 2, "female"));
        cats.add(new Cat("cat3", 3, "male"));
        createGenericWildCardExtendAnimal(cats);
    }
}