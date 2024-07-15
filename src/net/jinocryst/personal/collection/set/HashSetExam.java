package net.jinocryst.personal.collection.set;
import java.util.*;

public class HashSetExam {

    public static void main(String[] args) {
        /*
        Set은 List와 다르게 순서가 보장되지 않는 자료구조
        - 중복된 값을 허용하지 않는다.
        - 순서를 보장하지 않는다.
        - null을 저장할 수 있다.
        - 내부적으로 HashMap을 사용하여 데이터를 저장한다.

         */

        Set<String> fruits = new HashSet<>();

        fruits.add("apple");
        fruits.add("banana");
        fruits.add("kiwi");
        fruits.add("mango");
        fruits.add("lemon");
        fruits.add(null);
        System.out.println("fruits : " + fruits + " size : " + fruits.size());   //순서를 보장하지 않기 때문에 랜덤

        fruits.remove("apple");
        System.out.println("fruits : " + fruits + " size : " + fruits.size());   //apple은 삭제된다

        List<String> fruitsList = new ArrayList<>();
        fruitsList.add("mango");
        fruitsList.add("lemon");
        fruits.removeAll(fruitsList);
        System.out.println("fruits : " + fruits + " size : " + fruits.size());   //fruitsList에 포함된 아이템 삭제
        System.out.println("has apple? " + fruits.contains("apple"));   //set에 아이템이 있는지 조회

        //fruits.clear(); //set의 모든 아이템 삭제
        //System.out.println("fruits : " + fruits + " size : " + fruits.size());   //모두 삭제됨
        System.out.println("is empty? " + fruits.isEmpty());   //저장된 아이템이 없으면 true리턴


        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println("fruits one : " + iterator.next());
        }

        for(String fruit : fruits){
            System.out.println("fruits one : " + fruit);
        }
    }
}
