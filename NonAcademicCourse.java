

public class NonAcademicCourse extends Course
{
    private String InstructorName;
    private int Duration;
    private String StartDate;
    private String CompletionDate;
    private String ExamDate;
    private String Prerequisite;
    private boolean IsRegistered;
    private boolean IsRemoved;
    
    public NonAcademicCourse(String CourseID, String CourseName, int Duration, String Prerequisite)
    {
        super(CourseID, CourseName, Duration);
        this.Prerequisite = Prerequisite;
        StartDate = "";
        CompletionDate = "";
        ExamDate = "";
        IsRegistered = false;
        IsRemoved = false;
    }
    
    public String getInstructorName()
    {
        return InstructorName;
    }
    
    public int getDuration()
    {
        return Duration;
    }
    
    public String getStartDate()
    {
        return StartDate;
    }
    
    public String getCompletionDate()
    {
        return CompletionDate;
    }
    
    public String getExamDate()
    {
        return ExamDate;
    }
    
    public String getPrerequisite()
    {
        return Prerequisite;
    }
    
    public boolean getIsRegistered()
    {
        return IsRegistered;
    }
    
    public boolean getIsRemoved()
    {
        return IsRemoved;
    }
    
    public void setInstructorName(String InstructorName)
    {
        if(IsRegistered == false)
        {
            this.InstructorName = InstructorName;
        }
        else
        {
            System.out.println("The Non-Academic Course is already registered. So, you cannot change it.");
        }
    }
    
    public void Register(String CourseLeader, String InstructorName, String StartDate, String CompletionDate, String ExamDate)
    {
        if(IsRegistered == false)
        {
            setInstructorName(InstructorName);
            super.setCourseLeader(CourseLeader);
            this.StartDate = StartDate;
            this.CompletionDate = CompletionDate;
            this.ExamDate = ExamDate;
            IsRegistered = true;
        }
        else
        {
            System.out.println("The Course is already registered.");
        }
    }
    
    public void Remove()
    {
        if(IsRemoved == true)
        {
            System.out.println("The Course has been removed");
        }
        else
        {
            super.setCourseLeader("");
            InstructorName = "";
            StartDate = "";
            CompletionDate = "";
            ExamDate = "";
            IsRegistered = false;
            IsRemoved = true;
        }
    }
    
    public void Display()
    {
        super.Display();
        if(IsRegistered == true)
        {
            System.out.println("Instructor Name = " + InstructorName);
            System.out.println("Start Date = " + StartDate);
            System.out.println("Completion Date = " + CompletionDate);
            System.out.println("Exam Date = " + ExamDate);
        }
    }
}  
    
