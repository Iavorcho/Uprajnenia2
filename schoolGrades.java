import java.util.Scanner;
public class schoolGrades {
    public static void main(String[] args) {

        int procentOcenka;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the grade in percentage: ");
        procentOcenka= scan.nextInt();
        if (procentOcenka > 80){
            System.out.println("The student grade is: A");
        }else if (procentOcenka >= 60){
            System.out.println("The student grade is: B");
        }else if (procentOcenka >= 50){
            System.out.println("The student grade is: C");
        }else if (procentOcenka >= 45){
            System.out.println("The student grade is: D");
        }else if (procentOcenka >= 25){
            System.out.println("The student grade is: E");
        }else if (procentOcenka < 0) {
            System.out.println("The students grade is: F");
        }else{
                    System.out.println("Error");
                }
            }

    }


