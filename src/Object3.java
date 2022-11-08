public class Object3 extends Object1 {
    private Integer age;

    public Object3(String name, Integer age) {
        super(name);
        this.age = age;
    }

    @Override
    public int print() {
        return  + age;
    }
}
