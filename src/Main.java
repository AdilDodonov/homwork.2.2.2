import java.util.Random;

public class Main {

    public static void main(String[] args) {
        createObject(1);
    }

    public static void createObject(Integer className){
        Object2 object2 = new Object2( " cat ", 3);
        Object3 object3 = new Object3( " dog ", 2);
        Object4 object4 = new Object4(" kit ", 1);

        Printable[] printable = {object2, object3, object4};

        switch (className){
            case 1:
                System.out.println(object2.print());
                System.out.println(object2.getName());
                break;
            case 2:
                System.out.println(object3.print());
                System.out.println(object3.getName());
                break;
            case 3:
                System.out.println(object4.print());
                System.out.println(object4.getName());
                break;
        }
    }
}
