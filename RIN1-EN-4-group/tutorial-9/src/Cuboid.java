public class Cuboid extends Rectangle{
    int depth;

    Cuboid(int height, int width, int depth) {
        super(height, width); // call parents constructor (Rectangle)
        this.depth = depth;
    }

    int volume(){
        return super.area() * depth;
    }

    int surfaceArea(){
        return super.area() * 2 + height * depth * 2 + width * depth * 2;
    }

    // method overriding
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
        System.out.println("Depth: " + depth);
        System.out.println("Imagine in 3D");
    }

}
