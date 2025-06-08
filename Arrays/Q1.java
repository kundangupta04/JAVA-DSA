public class Q1 {
    // Given an array of marks of students, if the mark of any student is less than 35 print its roll number. [roll number here refers to the index of the array.]

    public static void main(String[] args) {
        int[] marks = {100,23,55,56,58,74,17,95,85};
        for(int i=0;i<marks.length;i++){
            if(marks[i]<35){
                System.out.print(i+" ");
            }
        }
    }
}
