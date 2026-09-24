import java.util.ArrayList;
import java.util.List;

public class ApplicationTracker{
    private final List<JobApplication> Applications = new ArrayList<>();
    //private String ownerName;

    //
    //public ApplicationTracker(String name){
        //this.ownerName = name;
    //}

    //Add method(i.e let the owner add a job application)
    public void addApplication(JobApplication application){
        Applications.add(application);
    }

    //update the status of the Application
    public boolean updateApplication(int Id, String status){
        for(JobApplication application: Applications){
            if(application.getId() == Id){
                application.setStatus(status);
                return true;
            }
        }
        return false;
    }

    //Display metho that displays the list of all applications
    public void DiplayApplications(){
        for(JobApplication application: Applications){
            System.out.println(application);
        }
    }
}