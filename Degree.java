import java.util.Scanner;

public class Degree {
   String FacultyAvailable;
   String Major;
   String Minor;
   String Level;

   public static void main (String[] args){
System.out.println("Choose your intended faculty from the following: ");
String[] theseFaculties= Faculty.facultyAvailable();
for(int i=0; i<theseFaculties.length; i++){
    System.out.println(theseFaculties[i]);
}

Scanner chosenFaculty= new Scanner(System.in);
String userFaculty= chosenFaculty.nextLine();



   }


}
