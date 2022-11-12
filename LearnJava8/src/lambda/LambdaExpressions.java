package lambda;

import java.util.*;

/**
 * Là một hàm ẩn danh, cho phép người dùng chuyển các phương thức làm đối số.
 * Điều này giúp loại bỏ rất nhiều code soạn sẵn.
 * --
 * Là một hàm không có tên và không thuộc bất kỳ class nào,
 * không có phạm vi truy cập (private, public hoặc protected),
 * không khai báo kiểu trả về.
 * </p>
 * Tại sao lại dùng lambda:
 *  - Cung cấp bản implement cho Functional interface.
 *  - Viết ít code hơn.
 *  - Hiệu quả hơn nhờ hỗ trợ thực hiện tuần tự (sequential) và song song (parallel) thông qua Stream API.
 */
public class LambdaExpressions {
    public static void sortNoJava8(List<String> list) {
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static void sortWithJava8(List<String> list) {
        Collections.sort(list, (o1, o2) -> o1.compareTo(o2));

        //Biểu thức với foreach
        list.forEach(System.out::println);
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("C++");
        list.add("C#");
        list.add("PHP");
        list.add("Python");

        /*lambdaExpressions.sortNoJava8(list);
        sortWithJava8(list);*/

        // Biểu thức không tham số
        /*Expressions expressions = () -> "I don't say anything";
        System.out.println(expressions.say());*/

        //Biểu thức với 1 tham số
        /*Expressions expressions = (name -> "Hello " + name);
        System.out.println(expressions.say("Hieu Vo"));*/

        //Biểu thức với nhiều tham số với 1 câu lệnh
        /*Expressions expressions = ((num1, num2) -> num1 + num2);
        System.out.println(expressions.calcWithTwoNumber(1, 1));*/

        //Biểu thức với nhiều tham số với nhiều câu lệnh
        Expressions expressions1 = ((num1, num2) -> {
            if (num1 >= 2 && num2 >= 2) {
                return num1 + num2;
            }
           return 0;
        });
        System.out.println(expressions1.calcWithTwoNumber(2, 2));
    }
}
















