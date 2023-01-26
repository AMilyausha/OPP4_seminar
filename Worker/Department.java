package Worker;

import java.util.ArrayList;


public class Department {
    public String deptName;
    ArrayList<Persona> personaInDept = new ArrayList<>();
    
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public ArrayList<Persona>  GetDep(){
        return personaInDept;
    }

}
