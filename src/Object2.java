public class Object2 extends Object1  {
    private Integer age;

    public Object2(String name, Integer age) {
        super(name);
        this.age = age;
    }

    @Override
    public int print() {
        return + age;
    }
}
