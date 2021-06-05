import com.mammals.zookeeper.Bat;

public class BatTest {

    public static void main(String[] args) {

        Bat jeff = new Bat();

        jeff.displayEnergy();

        jeff.attackTown();
        jeff.attackTown();
        jeff.attackTown();

        jeff.eatHumans();
        jeff.eatHumans();

        jeff.fly();
        jeff.fly();

        jeff.displayEnergy();
    }

}
