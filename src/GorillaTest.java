import com.mammals.zookeeper.Gorilla;
import com.mammals.zookeeper.Mammal;

public class GorillaTest {

    public static void main(String[] args) {

        Gorilla bob = new Gorilla();

        bob.displayEnergy();

        bob.throwSomething();
        bob.throwSomething();
        bob.throwSomething();


        bob.eatBananas();
        bob.eatBananas();

        bob.climb();

        bob.displayEnergy();
    }

}
