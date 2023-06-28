package Classes.ClassesAndObjects;

public class Student {
    private String fullName;
    private int groupNum;
    private int[] grades;

    private Student(String fullName, int groupNum, int[] grades) {
        this.fullName = fullName;
        this.groupNum = groupNum;
        this.grades = grades;
    }

    public static void main(String[] args) {
        Student [] students = new Student[10];
        //creating objects
        students[0] = new Student("Иванов И.И.", 1, new int[]{7, 7, 8, 9, 6});
        students[1] = new Student("Иванов П.И.", 3, new int[]{9, 6, 7, 10, 7});
        students[2] = new Student("Петров Л.П.", 4, new int[]{9, 8, 8, 8, 8});
        students[3] = new Student("Волкова Р.И.", 1, new int[]{7, 8, 9, 9, 6});
        students[4] = new Student("Авраамова К.О.", 2, new int[]{10, 7, 8, 10, 6});
        students[5] = new Student("Романов А.А.", 2, new int[]{7, 6, 10, 9, 8});
        students[6] = new Student("Смирнов А.С.", 4, new int[]{7, 10, 8, 7, 7});
        students[7] = new Student("Коновалова С.Л.", 1, new int[]{10, 10, 9, 9, 10});
        students[8] = new Student("Яковлева М.Р.", 3, new int[]{10, 7, 7, 9, 7});
        students[9] = new Student("Симаков В.Г.", 3, new int[]{9, 9, 10, 9, 9});

        excellentStudents(students);

    }

    private static void excellentStudents(Student[] students){
        System.out.println("Отличники:");
        for (Student student : students) {
            int countGoodGrades = 0;
            for (int j = 0; j < student.grades.length; j++){
                if(student.grades[j] >= 9) countGoodGrades++;
            }
            if(countGoodGrades == 5) {
                System.out.printf("%s, группа %d\n", student.fullName, student.groupNum);
            }
        }
    }


}
