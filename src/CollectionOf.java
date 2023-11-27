import java.util.*;

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

        System.out.println("set : "+ set);
        System.out.println("list : "+ list);
        System.out.println("map : "+ map);

        Set<String> newSet = Set.of("이협건", "홍길동", "고길동", "임꺽정", "둘리");

        List<String> newList = List.of("이협건", "홍길동", "고길동", "임꺽정", "둘리");

        Map<String, String> newMap
                = Map.of(
                "이", "협건",
                "홍", "길동",
                "고", "길동",
                "임", "꺽정",
                "둘", "리");

        System.out.println("newSet : "+ newSet);
        System.out.println("newList : "+ newList);
        System.out.println("newMap : "+ newMap);
    }

}


