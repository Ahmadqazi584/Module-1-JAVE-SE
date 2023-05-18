package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class CrudApp {
    Scanner sc = new Scanner(System.in);
    // for crudOptions();
    public byte crudoption;
    // for addStudent();
    ArrayList<Integer> idlist = new ArrayList<>();
    ArrayList<String> namelist = new ArrayList<>();
    ArrayList<String> rolllist = new ArrayList<>();
    ArrayList<Integer> agelist = new ArrayList<>();
    ArrayList<String> emaillist = new ArrayList<>();
    // for updateStudent();
    public int recordID;
    public boolean recordflag = false;

    public void crudOptions(){
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
        System.out.print("Enter the id : ");
        idlist.add(sc.nextInt());
        System.out.print("Enter the Name : ");
        namelist.add(sc.next());
        System.out.print("Enter the roll : ");
        rolllist.add(sc.next());
        System.out.print("Enter the Age : ");
        agelist.add(sc.nextInt());
        System.out.print("Enter the Email : ");
        emaillist.add(sc.next());
        System.out.println();
        System.out.print("Student Added Successfully");
        CrudApp crud = new CrudApp();
        crudOptions();
    }
    public void updateStudent(){
        System.out.print("enter student ID to update the record : ");
        recordID = sc.nextInt();
        for(int id : idlist){
            if (recordID != id){
                System.out.println("student does not exists \n");
                System.out.println();
                crudOptions();
            }else {
                System.out.print("Enter the Name : ");
                namelist.add(idlist.indexOf(id), sc.next());
                System.out.print("Enter the Roll : ");
                rolllist.add(idlist.indexOf(id), sc.next());
                System.out.print("Enter the Age : ");
                agelist.add(idlist.indexOf(id), sc.nextInt());
                System.out.print("Enter the Email : ");
                emaillist.add(idlist.indexOf(id), sc.next());
                System.out.println();
                System.out.println("Records Updated Successfully!");
                System.out.println();
                crudOptions();
            }
        }
    }
    public void deleteStudent(){
        System.out.print("enter student ID to delete the record : ");
        recordID = sc.nextInt();
        for(int id : idlist){
            if (id != recordID){
                System.out.println("student does not exists \n");
                System.out.println();
                crudOptions();
            }else {
                namelist.remove(idlist.indexOf(id));
                rolllist.remove(idlist.indexOf(id));
                agelist.remove(idlist.indexOf(id));
                emaillist.remove(idlist.indexOf(id));
                idlist.remove(idlist.indexOf(id));
                System.out.println();
                System.out.println("Record Deleted Successfully!");
                System.out.println();
                crudOptions();
            }
        }
    }
    public void getStudent(){
        System.out.print("enter student ID to show the record : ");
        recordID = sc.nextInt();

        for (int i = 0; i < idlist.size(); i++) {
            if (recordID == idlist.get(i)){
                recordflag = false;
                System.out.println("ID \t\t\t Name \t\t Roll \t\t Age \t\t Email");
                System.out.println(idlist.get(i) + "\t\t" + namelist.get(i) + "\t\t" + rolllist.get(i) + "\t\t" + agelist.get(i) + "\t\t" + emaillist.get(i));
                System.out.println();
                crudOptions();
            }else{
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
        for (int i = 0; i < idlist.size(); i++) {
            System.out.println(idlist.get(i) + "\t\t\t" + namelist.get(i) + "\t\t" + rolllist.get(i) + "\t\t" + agelist.get(i) + "\t\t" + emaillist.get(i));
        }
        System.out.println();
        crudOptions();
    }

    public static void main(String[] args) {
        System.out.println("CRUD Application");
        System.out.println();
        System.out.println("Welcome to Students Data");
        System.out.println();
        CrudApp cd = new CrudApp();
        cd.crudOptions();
    }
}
