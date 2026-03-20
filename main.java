public class main {
    public static void main(String[] args) {

        User user = new User("Piyush", 101);
        Worker worker = new Worker("Ramesh", 201);
        Admin admin = new Admin();

        user.raiseComplaint("Garbage not collected");
        
        admin.assignWorker(worker);

        worker.work();

        Complaint complaint = new ConcreteComplaint("Overflowing dustbin");
        complaint.showComplaint();
    }
}
