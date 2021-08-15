package by.stormnet.volodko.lesson5.task2;

public class Chair {
    private String type;
    // private String material;

    public Chair(String type) {
        //   this.material = material;
        this.type = type;
    }

    public class seat {
        public void up() {
            System.out.println("Сиденье вверх");
        }

        public void down() {
            System.out.println("Сиденье вниз");
        }
    }

    public class back {
        public void forward() {
            System.out.println("Спинка наклонена вперед");
        }

        public void backward() {
            System.out.println("Спинка наклонена назад");
        }

            }
    public class legs {
        int legs=4;
        public void legs(){
            System.out.println(legs);
        }
    }
}
