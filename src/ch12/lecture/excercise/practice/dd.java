package ch12.lecture.excercise.practice;
import java.util.*;
public class dd {

    class Solution {
        public static void main(String[] args) {
        }
        String myString ="axbxcxdx";
        public String[] solution(String myString) {
            String myString1=myString.replaceAll("^x+","");

            String[] answer = myString1.split("x+");
            Arrays.sort(answer);


            return answer;

        }
    }
}
