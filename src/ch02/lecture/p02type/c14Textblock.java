package ch02.lecture.p02type;

public class c14Textblock {
    public static void main(String[] args) {

        //text block
        // """로 묶음
        //new line 따옴표 등을 탈출문자 없이 사용 가능
        //가장왼쪽에 있는 문자 기준으로 들여쓰기 결정

        String html1 = """
                <html>
                    <body>
                """;
        System.out.println(html1);

    }
}
