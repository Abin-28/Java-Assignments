import java.util.*;

public class Student 
{
    int Rollno,Age;
    double CGPA;
    String Name, Phone_no;
    public static void main(String[] args) 
    {
        Student[] s = new Student[12];

        for (int i=1; i<=10; i++)
        {
            s[i] = new Student();
        }
        for (int i=1; i<=10; i++) 
        {       
            System.out.println("Enter the details of Student "+i);
            s[i].read();
        }
        
        double c=s[1].CGPA; ;
        String n=" ";
        int F=0;
        for (int i=1; i<=10; i++)
        {
            if(c<s[i].CGPA)    
            {
                c=s[i].CGPA;
                n=s[i].Name;
                F=1;
            }    
        }
        if(F==1)
        System.out.println("Student having highest CGPA (" +c +") : " + n);

        int f=0;
        int age=s[1].Age,rno=0;
        String str="ANU";
        for (int i=1; i<=10; i++)
        {    
            if(s[i].Name.equals(str))
            {        
                System.out.println("ANU Phone number : " + s[i].Phone_no);
            }
            
            else if(age>s[i].Age)
            {
                age=s[i].Age;
                rno=s[i].Rollno;
                n=s[i].Name;
                f=1;
            }
        } 
        if(f==1)       
        System.out.println("Roll number of the Youngest Student (" +n +") : " + rno);
        
    }
    
    
    void read() 
    {   
        Scanner sc = new Scanner(System.in);    
        System.out.print("Roll no: ");
        Rollno = sc.nextInt();
           
        System.out.print("Name: ");
        Name = sc.next();

        System.out.print("Phone number: ");
        Phone_no = sc.next();
    
        System.out.print("Age: ");
        Age = sc.nextInt();

        System.out.print("CGPA: ");
        CGPA= sc.nextDouble();

        System.out.print("\n");
    }

}
