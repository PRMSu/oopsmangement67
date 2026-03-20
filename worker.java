class Worker extends User {

    public Worker(String name, int userId) {
        super(name, userId);
    }

    public void work() {
        System.out.println(getName() + " is cleaning the area.");
    }

    // Polymorphism
    @Override
    public void raiseComplaint(String issue) {
        System.out.println("Worker " + getName() + " reported: " + issue);
    }
}
