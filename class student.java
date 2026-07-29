class student 
{
    string name = "adhi";
    int age = 20;
    void display(){
        system.out.println("name:" + name);
        system.out.println("age:" +age);
    }
    public static void main(sting[] args){
        student s1 = new student();
        s1.display();
    
    }
}