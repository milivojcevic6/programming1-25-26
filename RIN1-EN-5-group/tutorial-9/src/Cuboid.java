public class Cuboid extends Rectangle{
    int depth;
    public Cuboid(int height, int width, int depth) {
        super(height, width);
        this.depth = depth;
    }

    int volume(){
        return super.area() * depth;
    }

    int surfaceArea(){
        return super.area() * 2 + 2 * width * depth + 2 * height * depth;
    }
    @Override
    int area(){
        return -1;
    }
    @Override
    int perimeter(){
        return -1;
    }

    @Override
    void print(){
        super.print();
        System.out.println("Imagine in 3D with depth " + depth);
    }
}
