package Inheritance;

class WildClass{

    public void hunt(){
        System.out.println("Hunting for their prey");
    }

}

class  Lion extends WildClass{
    public void kingAttitide(){
        System.out.println("Roaring like a king ! ");
    }
}

class Tiger extends WildClass {
    public void blinkAndKill(){
        System.out.println("You Miss , I Hit");
    }
}


public class ClassCastException {
    public static void main(String[] args) {

        WildClass wa; // reference of parent type
        wa = new Lion(); // Upcasting
        wa.hunt();

        Lion l = (Lion)wa;
        System.out.println(wa instanceof WildClass);
        l.kingAttitide();

//        wa = new Tiger();
        if(wa instanceof Tiger){
            Tiger t = (Tiger)wa;
            t.blinkAndKill();
        }

//        Tiger t = (tiger)wa;
//        t.blinkAndKill();
        /*
        *
          java: cannot find symbol
          symbol:   class tiger
          location: class Inheritance.ClassCastException

        * */

    }
}
