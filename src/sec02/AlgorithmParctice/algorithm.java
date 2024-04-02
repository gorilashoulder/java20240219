package sec02.AlgorithmParctice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class algorithm {
    public static void main(String[] args) {
        AlogoStudent alogoStudent = new AlogoStudent("심성환", "2015");
        AlogoStudent alogoStudent1 = new AlogoStudent("서다봄", "2016");
        AlogoStudent alogoStudent2 = new AlogoStudent("박재훈", "2017");

        ArrayList<AlogoStudent> list = new ArrayList<>();
        list.add(alogoStudent);
        list.add(alogoStudent1);
        list.add(alogoStudent2);


        Scanner scanner = new Scanner(System.in);
        System.out.println("y는 반복 N은종료");
        String line = scanner.nextLine();
        while (true) {
            if (line.equals("y")) {
                System.out.println("검색시작");
                String name = scanner.next();
                boolean flag = false;
                for (AlogoStudent member : list) {
                    if (member.getName().equals(name)) {
                        System.out.println("감기걸렸다");
                        flag = true;

                    }
                    if (!flag) {
                        System.out.println("끝");

                    }
                }

            }

        }
    }
}
