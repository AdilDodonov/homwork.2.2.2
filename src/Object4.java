public class Object4 extends Object1 {
    private Integer age;

    public Object4(String name, Integer age) {
        super(name);
        this.age = age;
    }

    @Override
    public int print() {
        return  + age ;
    }
}
