import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private Integer mark1;
    private Integer mark2;
    private Integer mark3;
    private String name;
    private Integer age;
    public Student(Integer mark1, Integer mark2, Integer mark3,String name,Integer age){
//        marks = new ArrayList<>(Arrays.asList(mark1,mark2,mark3));

        this.mark1 = mark1;
        this.mark2=mark2;
        this.mark3=mark3;
        this.name=name;
        this.age = age;
    }



    public Integer getMark1(){
        return this.mark1;
    }

    public Integer getMark2(){
        return this.mark2;
    }

    public Integer getMark3(){
        return this.mark3;
    }

    public String getName() {
        return this.name;
    }

    public Integer getAge(){
        return this.age;
    }
    public void setMark1(Integer mark1){
        this.mark1 = mark1;
    }
    public void setMark2(Integer mark2){
        this.mark2 = mark2;
    }
    public void setMark3(Integer mark3){
        this.mark3 = mark3;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(Integer age){
        this.age = age;
    }
    public float average(){
        float avg = (this.mark1+this.mark2+this.mark3)/3;
        return avg;
    }
    public void display(){
        System.out.println("Name:" +this.name);
        System.out.println("Subject 1 Marks"+this.mark1);
        System.out.println("Subject 2 Marks"+this.mark2);
        System.out.println("Subject 3 Marks"+this.mark3);
        System.out.println("Age:" +this.age);
    }
}
