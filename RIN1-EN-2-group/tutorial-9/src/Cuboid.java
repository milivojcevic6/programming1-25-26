public class Cuboid extends Rectangle{
    int depth;

    Cuboid(int height, int width, int depth) {
        super(height, width);
        this.depth = depth;
    }

    @Override
    int area(){
        return -1; // since no area for 3D figure
    }

    @Override
    int perimeter(){
        return -1;
    }

    int volume(){
        return super.area() * depth;
    }

    int surfaceArea(){
        return super.area() * 2 + height * depth * 2 + width * depth * 2;
    }

    @Override
    void print(){
        super.print();
        System.out.println("Imagine in 3D with depth " +depth);
    }
}
