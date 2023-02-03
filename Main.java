class Main{
    public static void main(String[] args) {
        Human human = new Human("lessia");
        human.sleep();
        human.eat();
        human.drink();
        human.reproduce();
        
        Programmer programmer = new Programmer("lessia",12000);

        programmer.sleep();
        programmer.eat();
        programmer.drink();
        programmer.reproduce();
        programmer.participateInCyberGothDanceParty();
        programmer.program();
        programmer.salary();

        Programmer bill = new Programmer("Bill", 3456);
        System.out.println(bill.getSalary());

        human.printInfo();
        bill.printInfo();

        bill.raise();

        Programmer amy = new Programmer("Amy", 40000);
        amy.raise();



        
    }
}