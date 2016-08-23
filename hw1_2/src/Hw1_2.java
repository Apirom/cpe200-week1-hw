/**
 * Created by pruet on 11/8/2559.
 */
public class Hw1_2 {
    float gpaCalculation(int[] credit, int[] grade)
    {
        float gpa=0.0f,sumcredit=0;
                for(int i=0;i<credit.length;i++)
                {
                    gpa += credit[i] * grade[i];
                }
                for(int j=0;j<credit.length;j++)
                {
                    sumcredit += credit[j];
                }
                gpa/=sumcredit;
        return gpa;
    }

    public static void main(String[] args) {
        int[] credit = {3, 3, 3, 3, 2};
        int[] grade  = {2, 4, 4, 3, 2};
        Hw1_2 h = new Hw1_2();
        System.out.printf("Your GPA is %f\n", h.gpaCalculation(credit, grade));
    }
}
