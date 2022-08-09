public interface Edible {
    public abstract String howToEat();

    /* default 声明可以使得 implement 接口的 subclass
    * 无需 override 这一方法，因为default方法中包含了具体的方法实现
    * 也可以称为Defender方法，或者虚拟扩展方法（Virtual extension methods)。
    */
    default String color(){
        return "Red";
    }
}
