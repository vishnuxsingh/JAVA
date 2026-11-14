class Encaps {
    public static void main(String[] args){
    //    Student s1=new Student("Abhay BETA");
    //    System.out.println(s1.getname());
    BankAccount b1=new BankAccount();
    b1.setbal(5000);
    System.out.println(b1.getbal());
    }
}
class BankAccount {
    private int bal;
    public int getbal() {
        return this.bal;
    }
    public void setbal(int val){
        this.bal=val;
        System.out.print("Updated balance is" + bal);
    }
}
// class Student{
//     private String name;
//     public String getname(){
//         return this.name;
//     }
//     Student(String name){
//         this.name=name;
//     }
// }