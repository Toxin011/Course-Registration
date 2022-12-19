

public class Course
{
    private String CourseID;
    private String CourseName;
    private String CourseLeader;
    private int CourseDuration;
  
    public Course(String CourseID, String CourseName, int CourseDuration)
    {
      this.CourseID = CourseID;
      this.CourseName = CourseName;
      this.CourseDuration = CourseDuration;
      CourseLeader = "";
    }  
    
    public String getCourseID()
    {
        return CourseID;
    }
    
    public String getCourseName()
    {
        return CourseName;
    }
    
    public String getCourseLeader()
    {
        return CourseLeader;
    }
    
    public int getCourseDuration()
    {
        return CourseDuration;
    }
    
    public void setCourseLeader(String CourseLeader)
    {
        this.CourseLeader = "Course Leader = " + CourseLeader;
    }
    
    public void Display()
    {
        System.out.println("Course ID = " + CourseID);
        System.out.println("Course Name = " + CourseName);
        System.out.println("Course Duration = " + CourseDuration);
        if (CourseLeader !="")
        {
            System.out.println("Course Leader = " + CourseLeader);
        }
        
    }
}
