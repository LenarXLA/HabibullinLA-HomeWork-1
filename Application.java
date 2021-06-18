package homeWork_1;

import homeWork_1.model.Kotik;

public class Application {
    public static void main(String[] args) {

        Kotik kotik1 = new Kotik(9, 5, "Saimon", "Myay", 1);

        Kotik kotik2 = new Kotik();
        kotik2.setKotik(8, "Murzik", 4, "Miay", 0);

        System.out.printf("Имя котика: %s, вес котика: %s%n", kotik1.getName(), kotik1.getWeight());
        kotik1.liveAnotherDay();

        System.out.printf("Сравнение одинаково ли мяукают котики: %s%n", kotik1.getMeow().equals(kotik2.getMeow()));
        System.out.printf("Количество созданных котиков: %s%n", Kotik.getNumberOfCats());
    }
}
