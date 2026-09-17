class Department{
    void work(){
        System.out.println("Department is working");

    }
}
class BCADepartment extends Department{
    void work(){
        System.out.println("BCA department is organizing data");
    }
}
public class MethodOverridingDemoone{
    public static void main(String[] args){
        Department d=new Department();
        d.work();
        BCADepartment b=new BCADepartment();
        b.work();
        Department obj=new BCADepartment();
        obj.work();
    }
}