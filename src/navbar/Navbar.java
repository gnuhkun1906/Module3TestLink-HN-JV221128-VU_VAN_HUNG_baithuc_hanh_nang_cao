package navbar;

import model.Student;


import java.util.Scanner;

public class Navbar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        int choice;
        Student students[] = new Student[10];
        int size = 3;
        students[0] = new Student(1, "Hung", 18);
        students[1] = new Student(2, "A", 12);
        students[2] = new Student(3, "B", 11);
        while (true) {
            System.out.println("***********STUDENT MANAGE*************");
            System.out.println("1.Show list student");
            System.out.println("2.Create student");
            System.out.println("3.Update student");
            System.out.println("4.Delete student");
            System.out.println("5.Sort Student By Age ASC");
            System.out.println("6.Exit");

            System.out.println("Enter the choice");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    for (int i = 0; i < size; i++) {
                        System.out.println(students[i].toString());
                    }
                    break;
                case 2:


                    System.out.println("Create student");
                    System.out.println("Enter the StudentId");
                    student.studentId = size+1;
                    System.out.println("Enter the StudentName");
                    student.studentName = sc.next();
                    System.out.println("Enter the Age");
                    student.age = sc.nextInt();
                    students[size] = student;
                    size++;

                    break;
                case 3:
                    for (int i = 0; i < size; i++) {
                        System.out.println(students[i].toString());
                    }
                    System.out.println("Update Student");
                    System.out.println("Nhập vị trí cần sửa");
                    int upIndex = sc.nextInt();
                    if (upIndex >= students.length) {
                        System.out.println("Nhập lại đi , số cần nhập phải nhỏ hơn" + students.length);
                    }
                    System.out.println(students[upIndex].studentName + "=====>>>>>> ");
                    String updateName = sc.next();
                    students[upIndex].studentName = updateName;
                    System.out.println(students[upIndex].age + "======>>>>>>  ");
                    int updateAge = sc.nextInt();
                    students[upIndex].age = updateAge;
                    break;
                case 4:
                    System.out.println("Nhập vào vị trí cần xóa");
                    int del = sc.nextInt();
                    Student newStd[] = new Student[size - 1];
                    for (int i = 0; i < del; i++) {
                        newStd[i] = students[i];
                    }
                    for (int i = del + 1; i < size; i++) {
                        newStd[i - 1] = students[i];
                    }
                    size--;

                    for (int i = 0; i < newStd.length; i++) {
                        System.out.println(newStd[i]);

                    }
                    break;
                case 5:
                    Student temp;

                    for (int i = 0; i < size; i++) {
                        for (int j = i + 1; j < size; j++) {
                            if (students[i].age > students[j].age) {
                                temp = students[j];
                                students[j] = students[i];
                                students[i] = temp;
                            }
                        }
                    }
                    for (int i = 0; i < size; i++) {
                        System.out.println(students[i]);
                    }

                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }

    }
}
