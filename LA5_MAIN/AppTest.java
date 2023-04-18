package LA5_MAIN;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;

public class AppTest 
{
    public static void main(String []args) throws ParseException 
    {
        //initialize date formatter
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);

        //Project 1
        Project ProjectOne = new Project();
        //initialize project object with some values
        ProjectOne.setProjectId(" FNAF");
        ProjectOne.setStartDate( sdf.parse("18/04/2023"));
        ProjectOne.setEndDate(sdf.parse("30/04/2025"));

        ArrayList<Employee> employeeArrayListOfP1 = new ArrayList<>();
        employeeArrayListOfP1.add(new Employee("1","Freddy",500,0,3));
        employeeArrayListOfP1.add(new Employee("2","Bonnie",250,2,3));
        employeeArrayListOfP1.add(new Employee("3","Chica",346,3,1));
        employeeArrayListOfP1.add(new Employee("4","Foxy",125,1,2));

        ProjectOne.setListOfEmployees(employeeArrayListOfP1);

        System.out.println("Project toString method result :\n"+ProjectOne);
        System.out.println("Project Budget : "+ ProjectOne.estimateBudget());

        System.out.println();

        System.out.println("Project Details From Project Printer : ");
        ProjectPrinter projectPrinteFNAF=new ProjectPrinter(ProjectOne);
        Thread t1 = new Thread(projectPrinteFNAF);
        t1.start();

        //Project 2
        Project ProjectTwo = new Project();
        //initialize project object with some values
        ProjectTwo.setProjectId(" Sekai");
        ProjectTwo.setStartDate( sdf.parse("18/04/2054"));
        ProjectTwo.setEndDate(sdf.parse("30/04/2077"));

        ArrayList<Employee> employeeArrayListOfP2 = new ArrayList<>();
        employeeArrayListOfP2.add(new Employee("1","Kohane",500,0,10));
        employeeArrayListOfP2.add(new Employee("2","An",250,2,8));
        employeeArrayListOfP2.add(new Employee("3","Akito",346,2,4));
        employeeArrayListOfP2.add(new Employee("4","Foxy",125,1,2));

        ProjectTwo.setListOfEmployees(employeeArrayListOfP2);

        System.out.println("Project toString method result :\n"+ProjectTwo);
        System.out.println("Project Budget : "+ ProjectTwo.estimateBudget());

        System.out.println();

        System.out.println("Project Details From Project Printer : ");
        ProjectPrinter projectPrinterSEKAI=new ProjectPrinter(ProjectTwo);
        Thread t2 = new Thread(projectPrinterSEKAI);
        t2.start();

        //Project 3
        Project ProjectThree = new Project();
        //initialize project object with some values
        ProjectThree.setProjectId(" COD");
        ProjectThree.setStartDate( sdf.parse("30/9/2014"));
        ProjectThree.setEndDate(sdf.parse("03/01/2022"));

        ArrayList<Employee> employeeArrayListOfP3 = new ArrayList<>();
        employeeArrayListOfP3.add(new Employee("1","GHOST",500,2,20));
        employeeArrayListOfP3.add(new Employee("2","PRICE",600,4,16));
        employeeArrayListOfP3.add(new Employee("3","GAZ",300,10,13));
        employeeArrayListOfP3.add(new Employee("4","FARAH",400,12,30));

        ProjectTwo.setListOfEmployees(employeeArrayListOfP3);

        System.out.println("Project toString method result :\n"+ProjectTwo);
        System.out.println("Project Budget : "+ ProjectTwo.estimateBudget());

        System.out.println();

        System.out.println("Project Details From Project Printer : ");
        ProjectPrinter projectPrinterCOD=new ProjectPrinter(ProjectThree);
        Thread t3 = new Thread(projectPrinterCOD);
        t3.start();
    }
}
    

