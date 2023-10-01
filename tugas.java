package practice.oop;

import java.util.Scanner;

public class DuckSimulator {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        do {
            System.out.println("Pilih Jenis Bebek");
            System.out.println("1. Mallard Duck");
            System.out.println("2. Red Head Dduck");
            System.out.println("3. Rubber Duck");
            System.out.println("4. Decoy Duck");
            System.out.println("5. Model Duck");
            System.out.println("0. Keluar");
            int pilihan = scanner.nextInt();
            
            if (pilihan == 0) {
                System.out.println("Anda Keluar dari Program !");
                break;
            }
            
            Duck duck = null;
            switch (pilihan) {
                case 1:
                    duck = new MallardDuck();
                    break;
                case 2:
                    duck = new RedHeadDuck();
                    break;
                case 3:
                    duck = new RubberDuck();
                    break;
                case 4:
                    duck = new DecoyDuck();
                    break;
                case 5:
                    duck = new ModelDuck();
                    break;
                default:
                    System.out.println("Pilihan yang anda masukkan tidak terdaftar");
            }
            
            if (duck != null) {
                System.out.println("I'm a " + duck.getClass().getSimpleName());
                duck.performQuack();
                duck.performFly();
                
            }
        }while (true);
    }
}
