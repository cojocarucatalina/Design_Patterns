package prototype;

abstract class Prototype {

        private int x;
        private int y;
        private String color;

        public Prototype(Prototype shape){

            this.x = shape.x;
            this.y = shape.y;
            this.color = shape.color;

        }

        public abstract Prototype clone();

}
