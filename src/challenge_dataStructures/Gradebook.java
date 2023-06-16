package challenge_dataStructures;

import java.util.HashMap;
import java.util.Map;


public class Gradebook {
  public static void main(String[] args) {
    Map<String, String> originalExamGrades = new HashMap<>();
    Map<String, String> makeupExamGrades = new HashMap<>();
    Map<String, String> finalGrades = new HashMap<>();

    originalExamGrades.put("Student1", "a");
    makeupExamGrades.put("Student1", "b");
    originalExamGrades.put("student1", "f");
    makeupExamGrades.put("student1", "c");
    originalExamGrades.put("Student3", "d");
    makeupExamGrades.put("Student3", "d");
    originalExamGrades.put("Student4", "d+");
    makeupExamGrades.put("Student4", "b");
    originalExamGrades.put("Student5", "c+");
    makeupExamGrades.put("Student5", "c");
    originalExamGrades.put("Student6", "b+");
    makeupExamGrades.put("Student6", "b-");
    originalExamGrades.put("Student7", "a");
    makeupExamGrades.put("Student7", "a-");
    originalExamGrades.put("Student8", "c-");
    makeupExamGrades.put("Student8", "c");

    for (Map.Entry m : originalExamGrades.entrySet()) {
      String originalExamGrade = m.getValue().toString().toLowerCase();
      String makeupExamGrade = makeupExamGrades.get(m.getKey()).toLowerCase();
      int originalExamGradeCodePoint = 0;
      int makeupExamGradeCodePoint = 0;
      char originalExamGradeSignage = '\0';
      char makeupExamGradeSignage = '\0';
      originalExamGradeCodePoint = originalExamGrade.codePointAt(0);
      if (originalExamGrade.endsWith("+") || originalExamGrade.endsWith("-")) {
        originalExamGradeSignage = originalExamGrade.charAt(1);
      }
      makeupExamGradeCodePoint = makeupExamGrade.codePointAt(0);
      if (makeupExamGrade.endsWith("+") || makeupExamGrade.endsWith("-")) {
        makeupExamGradeSignage = makeupExamGrade.charAt(1);
      }
      if (originalExamGradeCodePoint == makeupExamGradeCodePoint) {
        if (originalExamGradeSignage == makeupExamGradeSignage){
          finalGrades.put(m.getKey().toString(), originalExamGrade);
        } else if (originalExamGradeSignage == '+') {
          finalGrades.put(m.getKey().toString(), originalExamGrade);
        } else if (makeupExamGradeSignage == '-') {
          finalGrades.put(m.getKey().toString(), originalExamGrade);
        } else {
          finalGrades.put(m.getKey().toString(), makeupExamGrade);
        }
      }
      else if (originalExamGradeCodePoint < makeupExamGradeCodePoint) {
        finalGrades.put(m.getKey().toString(), originalExamGrade);
      } else {
        finalGrades.put(m.getKey().toString(), makeupExamGrade);
      }
    }
    finalGrades.forEach((k, v) -> System.out.println(k + ":" + v));
  }
}
