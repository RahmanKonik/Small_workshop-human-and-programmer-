import org.w3c.dom.ls.LSException;

public class Programmer extends Human {

    private int salary;
    private String name;

    public void setName( String name){
        this.name =name;
    }

    public String getName(){
        return this.name;
    }

    public void setSalary(int salary){
        if( salary > 1000 && salary < 10000){
            this.salary= salary;
        }
    }

    public int getSalary(){
        return this.salary;
    }

    public Programmer(String name, int salary) {
        super(name);
        this.salary =salary;

    }

    public void participateInCyberGothDanceParty(){
        System.out.println(super.getName()+"Programmer is danceing!");

    }

    public void program(){
        System.out.println(super.getName()+"Program is bad!");
    }

    public void salary(){
        System.out.println(this.salary+" not bad!");
    }

    public void printInfo(){
        System.out.println("Name:"+super.getName()+"Salary"+this.salary);
    }

    public void raise(){
        if (salary > 4000){
            System.out.println(super.getName() +" Must be wanting raise");

        }else{
            System.out.println(super.getName()+" Sweet, will do for a while");
        }
        
    }
    
}

