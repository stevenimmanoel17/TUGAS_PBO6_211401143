package Main;

import Interface.Controllable;
import Abstract.Character;
import Inner.Player;






public class Tugas2 {
    public static void main(String[] args) {
        // Membuat objek pemain dan musuh
        Character player = new Player("Pakkai", 120, 70){
            @Override
            public void attack() {
                System.out.println("Anda menyerang dengan tenaga dalam");
            }

            @Override
            public void displayInfo() {
                System.out.println("Nama Anda: " + name);
                System.out.println("Jumlah Darah anda: " + healthPoints);
            }
        };

        Character player1 = new Player("Titan", 100, 50);

        // Memanggil metode dari objek pemain dan pemain1
        player.displayInfo();
        player.attack();
        player.moveRight();
        player.successfulAttack ();

        System.out.println();

        player1.displayInfo();
        player1.attack();
        player1.moveLeft();
        player1.hit();

    }
}
