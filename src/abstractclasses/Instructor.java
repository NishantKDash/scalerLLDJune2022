package abstractclasses;

public class Instructor extends User {
    private String assignedBatch;
    private String description;

    Instructor() {
        super("Instructor");
    }

    public String getAssignedBatch() {
        this.setName("Naman");
        return assignedBatch;
    }

    public void setAssignedBatch(String assignedBatch) {
        this.assignedBatch = assignedBatch;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    void saySomething() {
        System.out.println("Solve your assisgments");
    }
}


// Question: If I create an object of a child class
// DO private attributes attributes of parent take memory
// in that object?
// class A {
//      private int a;
//      public int b;
// }
// class B extends A {
//      public int c;
// }
// B b = new B(); ->