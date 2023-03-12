package LA3_Q3;

public class Person {
    private String name;
    private String address;
    public Person(String name,String address)
    {
        this.name = name;
        this.address = address;
    }
    public String getAddress()
    {
        return address;
    }
    
    public void setAddress(String address)
    {
        this.address = address;
    }
    @Override
    public String toString()
    {
        return "Person[name=" + name + "," + "address= " + address + "]";
    }
}
