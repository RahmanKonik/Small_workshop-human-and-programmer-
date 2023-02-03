public class Human{

    private String name;

    public Human(String name) {
        this.name =name;
    }

    public void setname(String name){
        if( name != null && !name.isEmpty())
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void sleep(){
        System.out.println(this.name+" can sleep");

    }

    public void eat(){
        System.out.println(this.name+" eat a lots");


    }

    public void drink(){
        System.out.println(this.name+" drinks the water!");

    }

    public void reproduce(){

        System.out.println(this.name+" is repoducing!");
    }

    // method

    public void printInfo(){
        System.out.println("human name "+this.name);
    }

}
