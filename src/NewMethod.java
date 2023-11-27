import java.util.List;

public class NewMethod {

    public static void main(String[] args) {

        //isBlank 문자열이 비어있거나 공백이면 True 반환 함수
        boolean res = "   ".isBlank(); // 공백이 많아도 True 나옴
        System.out.println("res : " + res);

        res = "".isBlank();
        System.out.println("res : " + res);

        res = "안녕하세요. ".isBlank();
        System.out.println("res : " + res);

        // 줄 단위로 나뉘어 있는 문자를 배열로 반환하며, 반환된 데이터는 스트림 가능
        String text = "1번째 안녕하세요. \n2번째 안녕하세요. \n3번째 안녕하세요. \n4번째 안녕하세요.";

        var lines = text.lines();
        System.out.println("lines : " + lines.getClass()); // Stream<String> 타입으로 반환
        lines.forEach(s -> System.out.println("s : " + s));

        // 난 에러가 발생할 것이다. Stream 처리는 1번 사용하면 끝이다.
        // 앞의 프로그래밍에서 forEach 반복문을 통해 스트림 결과를 가져왔기 때문이다.
//        System.out.println("lines : " + lines.count());


        // strip 문자열 공백 제거
        // 기존 trim() 함수 개선된 버전으로 유니코드의 공백들을 전부 제거함
        var text1 = "     안녕하세요.   ";
        System.out.println("strip : #" + text1.strip() + "#");

        // repeat  문자열을 반복 횟수만큼 반복함
        var result = "안녕하세요.".repeat(3);
        System.out.println("result : " + result.getClass());
        System.out.println("result : " + result);

    }
}
