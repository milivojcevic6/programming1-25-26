public class Cuboid extends Rectangle {
    int depth;

    Cuboid(int width, int height, int depth) {
        super(width, height);
        this.depth = depth;
    }

    @Override
    int area(){
        return -1;
    }

    @Override
    int perimeter(){
        return -1;
    }

    int volume(){
        return super.area() * depth;
    }

    int surfaceArea(){
        return 2* super.area() + 2 * width * depth + 2 * height * depth;
    }

    @Override
    void print(){
        super.print();
        System.out.println("Imagine in 3D with depth " + depth);
    }
}
