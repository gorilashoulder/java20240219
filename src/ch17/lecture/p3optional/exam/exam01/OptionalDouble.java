package ch17.lecture.p3optional.exam.exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

class OptionalEaxmple {
    public static void main(String[] args) {
        List<Integer> list =new ArrayList<>();

        java.util.OptionalDouble optional=list.stream()
                .mapToInt(Integer::intValue)
                .average();

    }
}
