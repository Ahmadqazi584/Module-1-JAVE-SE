package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class CrudApplication {
    public int id;
    public String name;
    public String roll;
    public byte age;
    public String email;
    public int crudoption;
    public int recordID;
    public boolean recordflag = false;
    ArrayList<CrudApplication> student = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    
    CrudApplication capp;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void crudOptions(){
        System.out.println();
        System.out.println("1- Add Student");
        System.out.println("2- Update Student");
        System.out.println("3- Delete Student");
        System.out.println("4- Get Student");
        System.out.println("5- Get All Students");
        System.out.println();
        System.out.print("Select any Choice : ");
        crudoption = sc.nextByte();
        if(crudoption == 1){
            addStudent();
        }else if(crudoption == 2){
            updateStudent();
        }else if (crudoption == 3){
            deleteStudent();
        }else if(crudoption == 4){
            getStudent();
        }else if (crudoption == 5){
            getAllStudent();
        } else{
            System.out.println("Select 1, 2, 3, 4, and 5 options for Results");
        }
    }

    public void addStudent(){
        capp = new CrudApplication();

        System.out.print("Enter the id : ");
        capp.setId(sc.nextInt());
        System.out.print("Enter the Name : ");
        capp.setName(sc.next());
        System.out.print("Enter the roll : ");
        capp.setRoll(sc.next());
        System.out.print("Enter the Age : ");
        capp.setAge(sc.nextByte());
        System.out.print("Enter the Email : ");
        capp.setEmail(sc.next());
        student.add(capp);
        System.out.println();
        System.out.print("Student Added Successfully");
        crudOptions();
    }
    public void updateStudent(){
        System.out.print("enter student ID to update the record : ");
        recordID = sc.nextInt();
        for (CrudApplication app : student){
            if (recordID != app.getId()){
                System.out.println("student does not exists \n");
                System.out.println();
                crudOptions();
            }else {
                System.out.print("Enter the id : ");
                capp.setId(sc.nextInt());
                System.out.print("Enter the Name : ");
                capp.setName(sc.next());
                System.out.print("Enter the roll : ");
                capp.setRoll(sc.next());
                System.out.print("Enter the Age : ");
                capp.setAge(sc.nextByte());
                System.out.print("Enter the Email : ");
                capp.setEmail(sc.next());
                student.add(student.indexOf(app),capp);
                System.out.println();
                System.out.print("Student updated Successfully");
                crudOptions();
            }
        }
    }
    public void deleteStudent() {
        System.out.print("enter student ID to delete the record : ");
        recordID = sc.nextInt();
        for (CrudApplication app : student){
            if (recordID != app.getId()){
                System.out.println("student does not exists \n");
                System.out.println();
                crudOptions();
            }else {
                student.remove(student.indexOf(app));
            }
        }
    }
    public void getStudent() {
        System.out.print("enter student ID to show the record : ");
        recordID = sc.nextInt();
        for (CrudApplication app : student){
            if (recordID == app.getId()){
                recordflag = false;
                System.out.println("ID \t\t\t Name \t\t Roll \t\t Age \t\t Email");
                System.out.println(app.getId() + "\t\t" + app.getName() + "\t\t" + app.getRoll() + "\t\t" + app.getAge() + "\t\t" + app.getEmail());
                System.out.println();
                crudOptions();
            }else {
                recordflag = true;
            }
        }
        if (recordflag){
            System.out.println("student does not exists \n");
            System.out.println();
            crudOptions();
        }
    }
    public void getAllStudent(){
        System.out.println("ID \t\t\t Name \t\t Roll \t\t Age \t\t Email");
        for (int i = 0; i < student.size(); i++) {
        }
        for (CrudApplication app : student){
            System.out.println(app.getId() + "\t\t\t" + app.getName() + "\t\t" + app.getRoll() + "\t\t" + app.getAge() + "\t\t" + app.getEmail());
        }
        System.out.println();
        crudOptions();
    }

    public static void main(String[] args) {
        System.out.println("CRUD Application");
        System.out.println();
        System.out.println("Welcome to Students Data");
        System.out.println();
        CrudApplication app = new CrudApplication();
        app.crudOptions();
    }
}
