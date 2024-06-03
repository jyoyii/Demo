package OopsConcepts;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

@Getter
@Setter
@AllArgsConstructor
public class Employee implements IRetryAnalyzer {
    String ename;
    int eno;


//    @Override
//    public int compareTo(Employee emp) {
//        return Integer.compare(this.eno,emp.eno);
//    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + ename + '\'' +
                ", id=" + eno +
                '}';
    }

    @Override
    public boolean retry(ITestResult iTestResult) {
        return false;
    }
}
