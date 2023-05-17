public class Enemy extends Character{
    @Override
    public void move() {
        System.out.println("Enemy menjauh dari Hero beberapa langkah");
    }

    public void move(int step){
        System.out.println("Enemy menjauh sebanyak " + step + " langkah");
    }
}
