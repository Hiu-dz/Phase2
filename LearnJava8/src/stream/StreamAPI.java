package stream;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Stream (luồng) là một object mới của Java 8,
 * giúp cho việc thao tác trên collection và array trở nên dễ dàng và tối ưu hơn.
 * </p>
 * Một số method:
 *  - stream() : trả về một stream sẽ được xử lý theo tuần tự.
 *  - parallelStream() : trả về một Stream song song,
 *                      các xử lý sau đó sẽ thực hiện song song.
 * Lưu ý:
 *  - Không lưu trữ các elements, chỉ thực hiện các phép toán tổng hợp (chẳng hạn như filter() và count())
 *  - Tất cả các hoạt động là lazy (lười biếng), có nghĩa là chúng không được thực hiện cho đến khi cần thiết.
 *  - Không dùng lại được, không thể dùng index để truy xuất cái elements trong stream.
 *  - Có hỗ trợ thao tác song song với các elements trong collection hoặc array
 */

public class StreamAPI {
    public static void noStream(List<Integer> list) {
        List<Integer> evenNumbers = new ArrayList<>();
        for (Integer i : list) {
            if (i % 2 == 0) {
                evenNumbers.add(i);
            }
        }
        System.out.println(evenNumbers);
    }

    public static void haveStream(List<Integer> list) {
        List<Integer> integerList = list
                                .stream()
                                .filter(num -> num % 2 == 0)
                                .toList();
        System.out.println(integerList);
    }

    /* Stream với các cấu trúc dữ liệu khác */
    public static void streamWithArray() {
        String[] names = {"Hieu 1st", "Hieu 2nd", "Thuan", "Trung", "Tien"};
        Stream<String> namesStream = Arrays.stream(names);
        System.out.println(Arrays.toString(namesStream.toArray()));
    }

    public static void streamWithCollection() {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        integerList.add(6);

        haveStream(integerList);
    }

    public static void convertStreamToCollection() {
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5 ,6);
        List<Integer> integerList = integerStream.toList();
        System.out.println(integerList);
    }

    public static void convertStreamToArray() {
        Stream<String> stringStream = Stream.of("Java", "C#", "C++", "PHP", "Javascript");
        String[] strings = stringStream.toArray(String[]::new);
        System.out.println(Arrays.toString(strings));
    }

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        integerList.add(6);

        /*noStream(integerList);
        haveStream(integerList);*/

        // Stream với các kiểu dữ liệu nguyên thủy(primitive)
        /*IntStream.range(1,5).forEach(System.out::println);
        IntStream.of(1,2,3,4,5).forEach(System.out::println);*/

        streamWithCollection();
        streamWithArray();
        convertStreamToCollection();
        convertStreamToArray();
     }
}
