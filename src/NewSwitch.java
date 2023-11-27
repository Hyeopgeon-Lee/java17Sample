public class NewSwitch {

    /**
     * Switch 문법이 가장 많이 변경됨
     * 사용성을 높이기 위해 Break 구문 제거
     * 람다 표현식 적용
     * yield 키워드를 통해 결과값 받을 수 있도록 처리
     */
    public static void main(String[] args) {

        var randomNames = new String[]{"이협건", "학생1", "학생2", "학생3", "학생4"}[(int) (Math.random() * 5)];

        switch (randomNames) {
            case "이협건" -> {
                System.out.println("한국폴리텍대학 서울강서캠퍼스 교수");
                System.out.println(randomNames);
            }
            case "학생1", "학생2" -> {
                System.out.println("한국폴리텍대학 서울강서캠퍼스 학생");
                System.out.println(randomNames);
            }
            default -> {
                System.out.println("넌 누구니?");
                System.out.println(randomNames);
            }
        }

        // 결과값을 받을 수 있는 스위치 문법
        String res = switch (randomNames) {
            case "이협건" -> {
                yield (randomNames + " 한국폴리텍대학 서울강서캠퍼스 교수");
            }
            case "학생1", "학생2" -> {
                yield (randomNames + " 한국폴리텍대학 서울강서캠퍼스 학생");
            }
            default -> {
                yield (randomNames + "넌 누구니?");
            }
        };

        System.out.println("res : " + res);

    }
}
