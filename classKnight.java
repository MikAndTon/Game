package Menu;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class classKnight {
    String name;
    static int Health = 2;
    public classKnight(String name){
        this.name = name;
    }
    public static void main() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("-----------------\nВведите имя Вашего рыцаря: ");
        String string = reader.readLine();
        classKnight knight = new classKnight(string);
        System.out.println("Однажды в " + knight.name + " сошёлся в бою со страшным научным драконом с целью спасти принцессу, которую схватил дракон.\nТак как силы у нашего героя очень мало, он не справится в схватке один на один. " + knight.name + " решил сыграть с ним в У-Е-Фа. Помогите ему выиграть...");
        knight.fight();
    }
    public void fight () throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.print("1 - Камень; \n2 - Ножницы\n3 - Бумага\nВаш выбор: ");
            String string = reader.readLine();
            int figh = Integer.parseInt(string);
            if (figh == 1){
                System.out.println("Дракон выбрал \"Бумага\". Вы проиграли схватку и утратили 1 очко жизни.");
                classKnight.Health--;
            }
            if (figh == 2){
                System.out.println("Дракон выбрал \"Камень\". Вы проиграли схватку и утратили 1 очко жизни.");
                classKnight.Health--;
            }
            if (figh == 3){
                System.out.println("Дракон выбрал \"Ножницы\". Вы проиграли схватку и утратили 1 очко жизни.");
                classKnight.Health--;
            }
            if (classKnight.Health == 0){
                System.out.println("Вы проиграли... дракон оказывается обладает даром предсказывания... на что " + this.name + " надеялся...");
                break;
            }
        }
    }
}
