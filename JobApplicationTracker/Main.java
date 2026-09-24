public class Main {
    public void main(String[] args){
        ApplicationTracker tracker = new ApplicationTracker();

        // Creatring Job application
        JobApplication application1 = new JobApplication(1, "Nokia", "Software Developer Intern", "Ottawa, ON", "2026-09-01");
        JobApplication application2 = new JobApplication(2, "Shopify", "Backend Developer Intern", "Remote", "2026-09-03", "Interview");
        JobApplication application3 = new JobApplication(3, "Ciena", "Test Automation Intern", "Ottawa, ON", "2026-09-05");
        JobApplication application4 = new JobApplication(4, "Kinaxis", "Cloud Engineering Intern", "Ottawa, ON", "2026-09-08", "Assessment");
        JobApplication application5 = new JobApplication(5, "IBM", "DevOps Developer Intern", "Toronto, ON", "2026-09-10");
        JobApplication application6 = new JobApplication( 6, "Microsoft", "Software Engineering Intern", "Vancouver, BC", "2026-09-12", "Rejected");
        JobApplication application7 = new JobApplication( 7, "Cisco", "Security Engineering Intern", "Kanata, ON", "2026-09-15");
        JobApplication application8 = new JobApplication( 8, "Ford", "Data Engineering Intern", "Waterloo, ON", "2026-09-17", "Interview");
        JobApplication application9 = new JobApplication( 9, "BlackBerry", "Systems Software Intern", "Waterloo, ON", "2026-09-20");
        JobApplication application10 = new JobApplication( 10, "Ericsson", "AI Infrastructure Intern", "Ottawa, ON", "2026-09-22", "Offer");

        //System.out.println(application1);

        //Testing Add method
        tracker.addApplication(application1);
        tracker.addApplication(application2);
        tracker.addApplication(application3);
        tracker.addApplication(application4);
        tracker.addApplication(application5);
        tracker.addApplication(application6);
        tracker.addApplication(application7);
        tracker.addApplication(application8);
        tracker.addApplication(application9);
        tracker.addApplication(application10);

        System.out.println("ID | Company | Position | Location | Status | Application Date");
        System.out.println("--------------------------------------------------------------");
        tracker.DiplayApplications();

        //Testing Update method
        //track.addApplication(3, "REVIEWED");
        //track.addApplication(6, "REVIEWED");
        //track.addApplication(8, "INTERVIEW");
        //track.addApplication(1, "REJECTED");
    }
}