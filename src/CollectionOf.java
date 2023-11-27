import java.util.*;

/**
 * 불변(Immutable) 지원하는 새로운 메소스 추가
 * 메소드명 :  of
 */
public class CollectionOf {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("이협건");
        set.add("홍길동");
        set.add("고길동");
        set.add("임꺽정");
        set.add("둘리");

        List<String> list = new ArrayList<>();
        list.add("이협건");
        list.add("홍길동");
        list.add("고길동");
        list.add("임꺽정");
        list.add("둘리");

        Map<String, String> map = new HashMap<>();
        map.put("이", "협건");
        map.put("홍", "길동");
        map.put("고", "길동");
        map.put("임", "꺽정");
        map.put("둘", "리");

        System.out.println("set : " + set);
        System.out.println("list : " + list);
        System.out.println("map : " + map);

        Set<String> newSet = Set.of("이협건", "홍길동", "고길동", "임꺽정", "둘리");

        List<String> newList = List.of("이협건", "홍길동", "고길동", "임꺽정", "둘리");

        Map<String, String> newMap
                = Map.of(
                "이", "협건",
                "홍", "길동",
                "고", "길동",
                "임", "꺽정",
                "둘", "리");

        System.out.println("newSet : " + newSet);
        System.out.println("newList : " + newList);
        System.out.println("newMap : " + newMap);

        /*
        불변 객체에 값을 추가하는 방법은 객체를 새롭게 생성하여 값을 추가하는 방법만 가능함
         */

//        newSet.add("난 실행되면, 에러 난다.");
        Set<String> addSet = new HashSet<>(newSet);
        addSet.add("난 새로운 객체에 값에 값을 추가한 것이다.");

//        addList.add("난 실행되면, 에러 난다.");
        List<String> addList = new ArrayList<>(newList);
        addList.add("난 새로운 객체에 값에 값을 추가한 것이다.");

        Map<String, String> addMap = new HashMap<>(newMap);
        addMap.put("키", "난 새로운 객체에 값에 값을 추가한 것이다.");

        System.out.println("addSet : " + addSet);
        System.out.println("addList : " + addList);
        System.out.println("addMap : " + addMap);

    }

}


