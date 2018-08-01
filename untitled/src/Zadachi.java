import java.util.Random;

public class Zadachi{

    String name;
    int id;

    Zadachi (String name, int id){
        this.name = name;
        this.id = id;
    }

    Zadachi (Zadachi a){
        this.name = a.name;
        this.id = a.id;
    }


    void display (){
        System.out.println(name+" "+id);
    }
    public static void main(String[] args) {
        Zadachi s1 = new Zadachi("Tanir", 12);
        Zadachi s2 = new Zadachi(s1);
        s2.display();
    }
}


