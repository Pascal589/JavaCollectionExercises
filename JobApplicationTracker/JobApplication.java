public class JobApplication {
    private final int Id;
    private String Position;
    private String company;
    private String Location;
    private String Date;
    private String Status;

    //Constructors

    //Creates a JobApplication's instance with a default status
    public JobApplication(int id, String position, String company, String location, String date){
        this.Id = id;
        this.Position = position;
        this.company = company;
        this.Location = location;
        this.Date = date;
        this.Status = "Applied";
    }

    //Creates a JobApplication's instance with specified status
    public JobApplication(int id, String position, String company, String location, String date, String status){
        this.Id = id;
        this.Position = position;
        this.company = company;
        this.Location = location;
        this.Date = date;
        this.Status = status;
    }

    //Getters
    public int getId(){ return this.Id; }
    public String getPosition(){ return this.Position; }
    public String getCompany(){ return this.company; }
    public String getLocation(){ return this.Location; }
    public String getDate(){ return this.Date; }
    public String getStatus(){ return this.Status; }

    //Setters
    public void setStatus(String status){ this.Status = status; }

    //toString method
    public String toString(){
        return Id + " | " + Position + " | " + company + " | " + Location + " | " + Status + " | " + Date;
    }
}