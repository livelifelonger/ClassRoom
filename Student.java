import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A simple Gmae of Tag
 * 
 * Devyn Desriosiers
 * Java
 */
public class Student extends Actor
{
    private int studentNumber;
    private int    gradeLevel;
    private int       itDelay;
    
    private boolean it;
    
    private double average;
    
    private String firstName;
    private String  lastName;
    private String     upKey;
    private String   downKey;
    private String   leftKey;
    private String  rightKey;
    
    public Student( int number, String first, String last, int Grade, double average, boolean isIt )
    {
        studentNumber =  number;
        firstName     =   first;
        lastName      =    last;
        gradeLevel    =   Grade;
        this.average  = average;
        it            =    isIt;
        
        if( studentNumber == 1)
        {
            upKey   = "w";
            downKey = "s";
            leftKey = "a";
            rightKey= "d";
        }
        else if( studentNumber == 2)
        {
            upKey   = "u";
            downKey = "j";
            leftKey = "h";
            rightKey= "k";
        }
        else
        {
            upKey   =    "up";
            downKey =  "down";
            leftKey =  "left";
            rightKey= "right";
        }
        itDelay = 200;
        if(it == true)
        {
            setImage("ppl2.png");
        }
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public int getGradelevel()
    {
        return gradeLevel;
    }
    
    public boolean getIt()
    {
        return it;
    }
    
    public double getAverage()
    {
        return average;
    }
    
    public String toString()
    {
        return String.format("Name: %14s, %5s\nGrade: %20d\nAverage: %16.1f %%", firstName, lastName, gradeLevel, average);
    }
    
    private void checkCollision()
    {
        Actor otherStudent = getOneIntersectingObject(Student.class);
        
        if( otherStudent != null )
        {
            if (itDelay >= 200)
            {
                if (it == true) 
                {
                    it = false;
                    setImage("ppl1.png");
                    itDelay = 0;
                }
                else
                {
                    it = true;
                    setImage("ppl2.png");
                    itDelay = 0;
                }
            }
        }
    }
    
    /**
     * Act - do whatever the Students wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        movement();
        checkCollision();
        
         if( Greenfoot.mouseClicked(this) )
        {
            System.out.println( toString() );
        }
        
        itDelay ++;
    }    
    
    private void movement()
    {
        
         if( Greenfoot.isKeyDown(upKey) )
         {
             setLocation(getX(), getY() - 3);
         }
         
         if( Greenfoot.isKeyDown(downKey) )
         {
             setLocation(getX(), getY() + 3);
         }
            
         if( Greenfoot.isKeyDown(leftKey) )
         {
             setLocation(getX() - 3, getY() );
         }
         
         if( Greenfoot.isKeyDown(rightKey) )
         {
             setLocation(getX() + 3, getY() );
         }
         
         
    }
    
}
