abstract class Complaint {
    abstract void showComplaint();
}
class ConcreteComplaint extends Complaint {
    private String issue;

    public ConcreteComplaint(String issue) {
        this.issue = issue;
    }

    @Override
    void showComplaint() {
        System.out.println("Complaint: " + issue);
    }
}
