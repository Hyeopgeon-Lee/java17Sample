/*
 * 상속받는 자식을 명확히 지정하기
 * sealed claass 신규 추가
 * */
public sealed class Tree permits TreeApple, TreeApple2, TreeApple3 {

}

/**
 * 앞에 키워드는 final, non-sealed, sealed 가능
 */
final class TreeApple extends Tree {

}

non-sealed class TreeApple2 extends Tree {

}

/**
 * 상속에 상속을 받는 부분
 */
sealed class TreeApple3 extends Tree permits TreeApple4 {

}

final class TreeApple4 extends TreeApple3 {

}