package com.jade.psn.regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionExam {
    public static void main(String[] args) {
        /*
        출처 : https://hbase.tistory.com/160

        [정규표현식]
        특정한 규칙을 가진 문자열의 집합을 표현하는데 사용되는 언어
        자바에서는 주로 regex 패키지에 있는 Pattern과 Matcher클래스 사용
         */

        //Pattern
        String pattern = "^[0-9]*$";    //숫자만 등장하는지 확인
        String str = "123321";

        boolean result = Pattern.matches(pattern, str);
        System.out.println(result);

        /*
        [Pattern 클래스 메서드]
        compile(String regex);  //주어진 정규표현식으로부터 패턴 생성
        matcher(CharSequence input);    //대상 문자열이 패턴과 일치할 경우 true 반환
        asPredicate();  //문자열을 일치시키는데 사용할 수 있는 Predicate 작성
        pattern();  //컴파일된 정규표현식을 String 형태로 반환
        split(CharSequence input);  //문자열을 주어진 인자값 CharSequence 패턴에 따라 분리
         */

        //Matcher

        Pattern pattern2 = Pattern.compile(pattern);
        str = "04234234";

        //문자열의 패턴을 해석하고 주어진 패턴과 일치하는지 체크할 때 사용
        Matcher matcher = pattern2.matcher(str);
        System.out.println(matcher.find());

    }
}
