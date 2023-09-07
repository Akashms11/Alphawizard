package com.subs.alphawizard.JavaAndOOPs;

public class Students
        {
    private int marks;
    private String name;

    public Students(int marks, String name) {
        super();
        this.marks = marks;
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Students{" +
                "marks=" + marks +
                ", name='" + name + '\'' +
                '}';
    }

//    @Override
//    public int compareTo(Students o) {
////       if(this.marks>o.marks) return 1;
////       else if (this.marks<o.marks) return -1;
////       else return this.name.compareTo(o.name);
//        return this.marks-o.marks;
//    }
}
