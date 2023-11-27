import java.util.List;

/**
 * 추론 타입 역할하는 var 신규 추가
 * 초기 자바스크립트의 var 타입과 유사하다고 이해하면 됨
 */
public class NewKeywordVar {

    public static void main(String[] args) {

        var strData = "이협건"; // String 타입
        var doubleData = 1.5; // Double 타입
        var intData = 100; // Integer 타입

        var datas = List.of(strData, doubleData, intData);

        for (var data : datas) {
            System.out.println("data : " + data);
            System.out.println("data : " + data.getClass());

        }

    }
}
