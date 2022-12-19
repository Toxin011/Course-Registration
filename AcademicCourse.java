

public class AcademicCourse extends Course
{
    private String LecturerName;
    private String Level;
    private String Credit;
    private String StartingDate;
    private String CompletionDate;
    private int NumberOfAssessments;
    private boolean IsRegistered;
    
    public AcademicCourse(String CourseID, String CourseName, int Duration, String Level, String Credit, int NumberOfAssessments)
    {
        //call is made from the parent class Course
        super(CourseID, CourseName, Duration);
        this.Level = Level;
        this.Credit = Credit;
        this.NumberOfAssessments = NumberOfAssessments;
        LecturerName = "";
        StartingDate = "";
        CompletionDate = "";
        IsRegistered = false;
    }
    
    public String getLecturerName()
    {
        return LecturerName;
    }
    
    public String getLevel()
    {
        return Level;
    }
    
    public String getCredit()
    {
        return Credit;
    }
    
    public String getStartingDate()
    {
        return StartingDate;
    }
    
    public String getCompletionDate()
    {
        return CompletionDate;    
    }
    
    public int getNumberOfAssessments()
    {
        return NumberOfAssessments;
    }
    
    public boolean getIsRegisterd()
    {
        return IsRegistered;
    }
    
    public void setLecturerName(String LecturerNAME)
    {
        this.LecturerName = LecturerNAME;
    }
    
    public void setNumberOfAssessments(int NumberOfASSessments)
    {
        this.NumberOfAssessments = NumberOfASSessments;
    }
    
    public void Register(String LecturerName, String CourseLeader, String StartingDate, String CompletionDate)
    {
        if(IsRegistered == true)
        {
            System.out.println("The Academic Course has been registered.");
            System.out.println("LecturerName =" + LecturerName);
            System.out.println("StartingDate =" + StartingDate);
            System.out.println("CompletionDate =" + CompletionDate);    
        }
        else
        {
            super.setCourseLeader(CourseLeader);
            this.LecturerName = LecturerName;
            this.StartingDate = StartingDate;
            this.CompletionDate = CompletionDate;
            IsRegistered = true;
        }
    }
    
    public void Display()
    {
        super.Display();
        if(IsRegistered == true)
        {
            System.out.println("Lecturer Name = " +LecturerName);
            System.out.println("Level = " + Level);
            System.out.println("Credit = " +Credit);
            System.out.println("Starting Date = " +StartingDate);
            System.out.println("Completion Date = " +CompletionDate);
            System.out.println("Number Of Assessments = " +NumberOfAssessments); 
        }
    }
}
    

    
