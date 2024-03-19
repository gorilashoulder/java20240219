package ch15.lecture.p1list;

import java.util.ArrayList;

import java.util.List;

public class C04NestedListre {
    public static void main(String[] args) {
        int [][]array={
                {95,86},
                {83,92,96},
                {78,83,93,87,88}
        };

        System.out.println(array[1][1]);
        System.out.println(array[2][2]);
        System.out.println(array[1][0]);

        //
        List<List<Integer>>list =new ArrayList<>();
        list.add(new ArrayList<>());
        list.add(new ArrayList<>());
        list.add(new ArrayList<>());

        list.get(0).add(95);
        list.get(0).add(86);

        list.get(2).get(78);
        list.get(2).get(83);
        list.get(2).get(93);


        System.out.println(list.get(0).get(0));
        System.out.println(list.get(2).get(2));

    }
}
