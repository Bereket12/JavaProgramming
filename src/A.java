abstract class A{

    abstract void display();
}


class d extends A{

    void display(){
        System.out.println("Class A");
    }

}

class Abstract {

    public static void main(String[] args) {
        d obj = new d();
        obj.display();
    }
}
