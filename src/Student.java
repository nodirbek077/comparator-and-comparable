public class Student implements Comparable<Student> {
    private int age;
    private String name;
    private String surname;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Student(int age, String name, String surname) {
        this.age = age;
        this.name = name;
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        //Student o1 -> this
        //Student o2 -> o
        int result = this.getName().compareTo(o.getName());

        if (result == 0){
            result = o.getSurname().compareTo(this.getSurname());

            if (result == 0){
                if (this.getAge() > o.getAge()){
                    result = 1;
                } else if (this.getAge() < o.getAge()) {
                    result = -1;
                }
            }
        }
        return result;


        /*if (this.getAge() > o.getAge()) {
            result = 1;
        } else if (this.getAge() < o.getAge()) {
            result = -1;
        }
        return result;*/
    }
}
