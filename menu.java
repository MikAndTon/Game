package Menu;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class menu {
    public static void main() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("\n---------------------------\nВы перешли в меню:\n0 - Выйти назад \n1) Выбрать класс\n--------------------");
            String string = reader.readLine();
            int oneyes = Integer.parseInt(string);
            if (oneyes == 0)
                break;
            Vibor();
        }
    }
    public static void Vibor () throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("--------------------------\nВыберите свой класс: \n0 - перейти назад\n1) Рыцарь\n------------------------");
        while(true){
            String vibor = reader.readLine();
            int vib = Integer.parseInt(vibor);
            if (vib == 0) {
                break;
            }
            if (vib == 1){
                classKnight.main();
            }
            else {
                System.out.println("Ошибочка... Повторите ещё раз...");
            }
            System.out.print("--------------------\nВведите 0, чтобы выйти: ");
        }
    }
}
