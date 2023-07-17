public class Employee {
    private String name;
    private Long phoneNo;
    private String address;
    private Integer salary;

    public Employee(String name, Long phoneNo, String address, Integer salary){
        this.name = name;
        this.phoneNo = phoneNo;
        this.address = address;
        this.salary = salary;
    }

    public void display(){
        System.out.println(this.name);
        System.out.println(this.phoneNo);
        System.out.println(this.address);
        System.out.println(this.salary);
    }
    public void increment(){
        this.salary = this.salary + (this.salary/10);
    }

    public String getName(){
        return this.name;
    }

    public String getAddress(){
        return this.address;
    }

    public Integer getSalary(){
        return this.salary;
    }

    public Long getPhoneNo(){
        return this.phoneNo;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setPhoneNo(Long phoneNo){
        this.phoneNo = phoneNo;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setSalary(Integer salary){
        this.salary = salary;
    }
}
