package Day_9.src;
import java.util.Random;
public class DailyWage{
    int random;
    int Wage_per_Hour;
    int Hour;
    double EmployeeWage;
    DailyWage(int Wage_per_Hour){
        this.Wage_per_Hour=Wage_per_Hour;
    }
    public  int isCheck(){
        random=randomNumber();
        if(random==1){
            System.out.println(" Working is  Full Time Wage :");
            Hour=8;
        }
        else
        {
            System.out.println("Employee is absent");
            Hour=0;
        }
        return Hour;
    }
    public int randomNumber(){
        Random r = new Random();
        random = r.nextInt(2);
        return random;
    }
    public  void calculate(){
        EmployeeWage= Wage_per_Hour*Hour;
        System.out.println("Employee Wage Per Day is  "+EmployeeWage);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
        DailyWage d= new DailyWage(20);
        d.calculate();
    }
}
