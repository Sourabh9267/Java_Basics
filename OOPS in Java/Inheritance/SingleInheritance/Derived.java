class Base{

void methodofBaseClass(){
    System.out.println("Hey This is Base Class's method");
}
    
    
}

class Derived extends Base{
    

    void methodofDerivedClass(){
        System.out.println("Hey! This is Derived Class's method");
    }
    
    public static void main(String[] args) {
        

        Derived obj=new Derived();
        obj.methodofBaseClass();
        obj.methodofDerivedClass();
    
    
    
    }

}
