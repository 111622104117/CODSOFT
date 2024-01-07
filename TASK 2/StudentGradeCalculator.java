import java.util.Scanner;

public class StudentGradeCalculator
{
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("STUDENT GRADE MANAGEMENT SYSTEM\n");
      int NoSubjects=0;
      while(true)
      {
        System.out.print("Enter the number of subjects: ");
        NoSubjects=sc.nextInt();
        if(NoSubjects>0)
        {
          break;
        }
        else
        {
          System.out.println("Please, enter valid number. It should be greater than zero.");
        }
      }
      int TotalMark=0;
      System.out.println("Enter the marks obtained for all subjects (out of 100):");
      for(int i=0;i<NoSubjects;i++)
      {
        int Temporary=sc.nextInt();
        if(Temporary>=0 && Temporary<=100)
        {
         TotalMark+=Temporary; 
        }
        else
        {
          System.out.println("Please, enter the valid marks.");
          i--;
        }
      }
      sc.close();
      float AvgPercentage= TotalMark/NoSubjects;
      System.out.printf("TOTAL MARKS: %d \nAVERAGE PERCENTAGE: %.2f \n",TotalMark,AvgPercentage);
      System.out.print("GRADE: ");
      if (AvgPercentage>=95)
      {
        System.out.println("O");
      }
      else if (AvgPercentage>=80)
      {
        System.out.println("A");
      }
      else if (AvgPercentage>=70)
      {
        System.out.println("B");
      }
      else if (AvgPercentage>=60)
      {
        System.out.println("C");
      }
      else if (AvgPercentage>=50)
      {
        System.out.println("D");
      }
      else
      {
        System.out.println("F");
      }
    }
}