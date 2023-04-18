package LA5_MAIN;

//employee class implements Comparable interface
public class Employee implements Comparable<Employee>
{
    private String employeeId;
    private String employeeName;
    private Integer salaryPerHour;
    private Integer noOfLeavingDay;
    private Integer noOfTravelDay;

    public Employee(String employeeId, String employeeName, int salaryPerHour, int noOfLeavingDay, int noOfTravelDay)
    {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salaryPerHour = salaryPerHour;
        this.noOfLeavingDay = noOfLeavingDay;
        this.noOfTravelDay = noOfTravelDay;
    }

    //getter /setter
    public String getEmployeeId() 
    {
        return employeeId;
    }
    public void setEmployeeId(String employeeId) 
    {
        this.employeeId = employeeId;
    }
    public String getEmployeeName()
    {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) 
    {
        this.employeeName = employeeName;
    }
    public int getSalaryPerHour() 
    {
        return salaryPerHour;
    }
    public void setSalaryPerHour(int salaryPerHour) 
    {
        this.salaryPerHour = salaryPerHour;
    }
    public int getNoOfLeavingDay() 
    {
        return noOfLeavingDay;
    }
    public void setNoOfLeavingDay(int noOfLeavingDay) 
    {
        this.noOfLeavingDay = noOfLeavingDay;
    }
    public int getNoOfTravelDay() 
    {
        return noOfTravelDay;
    }
    public void setNoOfTravelDay(int noOfTravelDay) 
    {
        this.noOfTravelDay = noOfTravelDay;
    }
    //End of getter/setter

    //Calculate weekly salary
    public Integer calculateWeeklySalary()
    {
        return salaryPerHour * 8 * (5-noOfLeavingDay + noOfTravelDay/2);
    }

    //Implemented method for comparable interface
    @Override
    public int compareTo(Employee o) 
    {
        int RANK_OF_FIRST_OBJ;
        //rank left object higher if noOfTravelDay of left object > noOfTravelDay of right object
        RANK_OF_FIRST_OBJ = noOfTravelDay - o.getNoOfTravelDay();
        //if noOfTravelDay is same for both object
        if(RANK_OF_FIRST_OBJ == 0)
        {
            //rank left object higher if it has less noOfLeavingDay than right object
            RANK_OF_FIRST_OBJ = o.noOfLeavingDay - noOfLeavingDay;
        }
        //return rank
        return RANK_OF_FIRST_OBJ;
    }

    //Overridden toString method
    @Override
    public String toString() 
    {
        return "[Name: "+employeeName+" - "+"Salary Per Hour: "+salaryPerHour+" - " + "Weekly Salary: "+calculateWeeklySalary()+"]";
    }
}
