/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rdeburca2.ct417assignment1partb;

/**
 *
 * @author Rumhann de Búrca
 */



import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import rdeburca2.ct417assignment1parta.Student;
import rdeburca2.ct417assignment1parta.Module;
import rdeburca2.ct417assignment1parta.CourseProgramme;



public class Driver {
    
    public static void main(String args[])
    {
        DateTimeFormatter dateTimeFor = DateTimeFormat.forPattern("dd/mm/yyyy");
        DateTime startDate = dateTimeFor.parseDateTime("01/09/2018");
        DateTime endDate = dateTimeFor.parseDateTime("15/05/2019");
        
        List<Student> students = new ArrayList<Student>();
        List<Student> studentsCSIT = new ArrayList<Student>();
        List<Student> studentsECE = new ArrayList<Student>();
        List<Student> studentsEEE = new ArrayList<Student>();
        
        List<Module> modulesCSIT = new ArrayList<Module>();
        List<Module> modulesECE = new ArrayList<Module>();
        List<Module> modulesEEE = new ArrayList<Module>();
        
        List<CourseProgramme> courses = new ArrayList<CourseProgramme>();
        
        CourseProgramme ECE = new CourseProgramme("Electronic & Computer Engineering", modulesECE, startDate, endDate);
        CourseProgramme EEE = new CourseProgramme("Electrical & Electronic Engineering", modulesEEE, startDate, endDate);
        CourseProgramme CSIT = new CourseProgramme("Computer Science & Information Technology", modulesCSIT, startDate, endDate);

        courses.add(ECE);
        courses.add(EEE);
        courses.add(CSIT);
        
        
        Student student1 = new Student("Jane Doe", 21,1456789, dateTimeFor.parseDateTime("30/04/1997"));
        Student student2 = new Student("Rumhann de Burca", 22, 15551603, dateTimeFor.parseDateTime("23/12/1996"));
        Student student3 = new Student("Ken Adams", 24, 12345678, dateTimeFor.parseDateTime("11/06/1996"));
        Student student4 = new Student("Ciara Fleminnig", 21, 13654789, dateTimeFor.parseDateTime("30/11/1996"));
        Student student5 = new Student("Peter Brown", 22, 12569543, dateTimeFor.parseDateTime("09/12/1997"));
        Student student6 = new Student("Henery Grace", 19, 14765689, dateTimeFor.parseDateTime("19/07/1995"));

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        
        studentsCSIT.add(student6);
        studentsCSIT.add(student5);
        
        studentsECE.add(student1);
        studentsECE.add(student2);
        
        studentsEEE.add(student3);
        studentsEEE.add(student4);
        
        Module EE444 = new Module("Communications and Signal Processing Applications", "EE444", students);
        Module EE443 = new Module("BE project","EE443", studentsCSIT);
        Module EE445 = new Module("Digital Signal Processing", "EE445", studentsEEE);
        Module EE451 = new Module("System on Chip Design I", "EE451", studentsECE);
        
        modulesECE.add(EE444);
        modulesECE.add(EE451);
        modulesCSIT.add(EE444);
        modulesCSIT.add(EE443);
        modulesEEE.add(EE444);
        modulesEEE.add(EE445);
        
        for(CourseProgramme course : courses)
        {
            System.out.print("\n" + course.toString());
        }
        
    }
}
