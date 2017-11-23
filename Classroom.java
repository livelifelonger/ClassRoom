import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Classroom extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Classroom()
    {    
        super(600, 400, 1); 
        prepare();
    }
    
    private void prepare()
    {
        Student student1 = new Student(1, "Billy", "Willy", 12, 93.1, true);
        Student student2 = new Student(2, "Silly", "Zilly", 1, 00.1, false);
        Student student3 = new Student(3, "Milly", "Nilly", 11, 70.5, false);
        
        addObject(student1, 60 , 60);
        addObject(student2, 540, 60);
        addObject(student3, 300, 340);
    }
}
