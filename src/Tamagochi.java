import java.util.ArrayList;
import java.util.List;
public class Tamagochi
{
    int hunger = 0;
    int boredom = 0;

    List<String> words = new ArrayList<>();

    boolean isAlive = true;
    String name;



    public void feed()
    {


        if (hunger > 0)
        {
            hunger--;
            System.out.println(name + "är nu mindre hungrig. Hunger: " + hunger);
        }
        else
        {
            System.out.println(name + " är inte hungrig");
        }
    }
    public void hi()
    {

    }
    public void teachWord(String Word)
    {
        words.add(Word);

        System.out.println(name + " har lärt sig ordet " + Word);
    }
    public void tick()
    {
        hunger++;
        boredom++;
    }
    public void printStats()
    {

    }
    public void reduceBoredom()
    {

    }
}
