package dev.jadepark.personal.lambda;

import java.util.function.Function;

public class IfElseExam {
    public static void main(String[] args) {
        String test = "Y";
        String chk = "";

        if("Y".equals(test)){
            chk = "1";
        }else{
            chk = "2";
        }

        System.out.println(chk);

        //삼황연산자 & 람다
        Function<String, String> function = t -> "Y".equals(t) ? "1" : "2";
        chk = function.apply(test);

        System.out.println(chk);

        //인터페이스 람다
        Function2<String, String> function2 = (t) -> {
          return "Y".equals(t) ? "1" : "2";
        };

        chk = function2.apply(test);
        System.out.println(chk);
    }


}

@FunctionalInterface
interface Function2<T,R> {
    R apply(T t);
}
