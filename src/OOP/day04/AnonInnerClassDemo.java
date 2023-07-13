package OOP.day04;

public class AnonInnerClassDemo {
    public static void main(String[] args) {
        inter1 o1 = new inter1() {
        };

        inter1 o2 = new inter1() {
        };

        interinter o3 = new interinter() {

            public void show() {

            }

        };
    }


    class Aoo implements interinter {
        public void show() {

        }
    }

    interface inter1 {

    }

    interface interinter {
        void show();
    }

    interface inter {

    }


}
