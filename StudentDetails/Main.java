public class Main {
    public static void main(String[] args){
        Student s1 = new Student(93,95,96,"John",25);

        s1.display();
        System.out.println(s1.average());
        s1.setName("Jerry");
        s1.display();
        s1.setMark1(35);
        System.out.println(s1.average());
    }
}