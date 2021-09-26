package by.stormnet.volodko.lesson5.task1;

public class Main {

    public static void main(String[] args) {
        Bird bird1 = new Bird("sparrow", 0.04);
        Bird bird0 = new Bird("sparrow");
         //   Bird bird2 = new Bird("hawk", 0.3);
           Bird bird3 = new Bird("penguin", 35.0);
        String bird1View = bird1.getView();
        Double bird1Weight = bird1.getWeight();

           String bird0View = bird0.getView();
          Double bird0Weight = bird0.getWeight();

          String bird3View = bird3.getView();
          Double bird3Weight = bird3.getWeight();


        System.out.println("Вид птицы: " + bird0View);
        System.out.println("Вес птицы: " + bird0Weight);

        System.out.println("Вид птицы: " + bird1View);
        System.out.println("Вес птицы: " + bird1Weight);
        //   System.out.println("Вид птицы: " + bird2View);
       // System.out.println("Вес птицы: " + bird2Weight);

           System.out.println("Вид птицы: " + bird3View);
         System.out.println("Вес птицы: " + bird3Weight);
       System.out.println("Вес всех птиц: " + Bird.getSum());
    }

}



