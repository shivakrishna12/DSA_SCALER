package June2024.Arrays;

public class SumofTheStudentMarks {
    public static void main(String[] args) {
        int[] marksArr = {90, 89, 88, 98, 95, 96};
        int sum = 0;
        for (int i = 0; i < marksArr.length; i++) {
            sum = sum + marksArr[i];
        }
        System.out.println("total marks of Given Student ::" + sum);
    }
}


