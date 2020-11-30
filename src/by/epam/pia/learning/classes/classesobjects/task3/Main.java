package by.epam.pia.learning.classes.classesobjects.task3;

// Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы,
// успеваемость (массив из пяти элементов). Создайте массив из десяти элементов
// такого типа. Добавьте возможность вывода фамилий и номеров групп студентов,
// имеющих оценки, равные только 9 или 10.

public class Main {

    public static void main(String[] args) {
        Student[] students = new Student[10];
        students[0]= new Student("Petrov A.T.", 1, new int[]{ 9,10,10,10,9});
        students[1]= new Student("Frolov B.S.", 1, new int[]{ 10,1,2,1,10});
        students[2]= new Student("Krylov C.R.", 1, new int[]{ 10,9,8,7,6});
        students[3]= new Student("Karpov D.Q.", 1, new int[]{ 5,6,7,8,9});
        students[4]= new Student("Bodrov E.P.", 1, new int[]{ 13,16,10,12,9});
        students[5]= new Student("Kvasnov F.O.", 2, new int[]{ 9,9,10,9,9});
        students[6]= new Student("Krasnov G.N.", 2, new int[]{ 9,8,10,8,9});
        students[7]= new Student("Potapov H.M.", 2, new int[]{ 10,6,7,8,9});
        students[8]= new Student("Suvorov I.L.", 2, new int[]{ 1,2,3,4,5});
        students[9]= new Student("Popov J.K.", 2, new int[]{ 10,9,10,9,10});

        for(Student student:students){
            if (student.isExcellent()){
                System.out.println(student);
            }
        }
    }
}
