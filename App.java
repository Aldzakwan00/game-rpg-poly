public class App {
    
    public static void main(String[] args) {
        //static polymorphism :
        Hero hr = new Hero();
        hr.move();
        hr.move("Selatan");
    
        Enemy en = new Enemy();
        en.move();
        en.move(5);

        System.out.println("----------------------------------------------------------");
    
        //dynamic polymorphism
        Character ch1 = new Hero();
        ch1.move();

        Character ch2 = new Enemy();
        ch2.move();

        Character ch3 = new Fighter();
        ch3.move();

        Character ch4 = new Witch();
        ch4.move();

        System.out.println("----------------------------------------------------------");

        //casting
        Character ch5 = new Witch();
        ch5 = (Fighter) ch5;
        ch5.move();
        //terjadi error ketika program dijalankan tidak bisa dilakukan casting dari objek witch menjadi objek fighter.
        
    }
}
