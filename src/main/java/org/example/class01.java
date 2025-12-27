package org.example;

public class class01 {

    public static void main(String[] args) {
        System.out.println("Hello World!");

//        Student data
        String studentName = "John Doe";
        int studentID1 = 15;
        short studentAge1 = 23;
        float studentFee1 = 75.25f;
        char studentGender1 = 'B';

        System.out.println("Student Name: " + studentName);
        System.out.println("Student ID: " + studentID1);
        System.out.println("Student Age: " + studentAge1);
        System.out.println("Student Fee: " + studentFee1);
        System.out.println("Student Gender: " + studentGender1);

        Student student = new Student();
        student.name = "Min Pyae Hein";
        student.id = 123;
        student.fee = 1000;
        student.age = 23;
        student.grade = 'A';

        Student student1 = new Student();
        student1.name = "Thin Nwe Oo";
        student1.id = 123;
        student1.fee = 1000;
        student1.age = 23;
        student1.grade = 'A';

        int num = 30; //primitive int
        Integer price = 30; //non-primitive Integer

        Boolean flag = true;
        boolean flag1 = true; //primitive boolean

        Character grade = 'A';
        char grade1 = 'A';

        int num1 = Integer.parseInt("100");


        int z = 5;
        System.out.println(z+1);


    }

}

