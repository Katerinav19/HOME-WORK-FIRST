import java.util.Scanner;
public class Homework2 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Привет,Как тебя зовут?");
        String Name = input.nextLine();
        System.out.println("Приятно познакомиться " + Name);
        System.out.println("Ты учишься или работаешь?");
        String Work = input.nextLine();
        System.out.println("Какое у тебя хобби?");
        String Hobby = input.nextLine();
        System.out.println("Кем бы ты хотел стать?");
        String Target = input.nextLine();
        System.out.println("В какой сфере ты бы хотел прославиться?");
        String sphere = input.nextLine();
        System.out.println("Любишь гулять по городу ночью?");
        String walk = input.nextLine();
        System.out.println("Сколько тебе лет?");
        int age = input.nextInt();
        input.nextLine();
        System.out.println("Сколько литров воды выпиваешь за день?)");
        int water = input.nextInt();
        input.nextLine();
        System.out.println("Сколько ты зарабатываешь?");
        int money = input.nextInt();
        input.nextLine();
        System.out.println("Какой у тебя любимый вид траспорта?");
        String transport = input.nextLine();
        System.out.println("Какой твой любимый праздник?");
        String holiday = input.nextLine();
        System.out.println("Сколько человек у тебя в группе?");
        int group = input.nextInt();
        System.out.println("Сколько человек у тебя в семье?");
        int family = input.nextInt();
        System.out.println("Какой твой любимый цвет?");
        String color = input.nextLine();
        System.out.println("Сколько классов ты окончил в школе?");
        int school= input.nextInt();
        System.out.println("Какой твой любимый фильм?");
        String movie = input.nextLine();
        System.out.println("Любишь получать подарки или дарить?");
        String present = input.nextLine();
        System.out.println("Твой любимый стиль одежды?");
        String style = input.nextLine();
        System.out.println("что ты любишь носить чаще, футболки или кофты?");
        String cloth = input.nextLine();
        System.out.println("Любишь сладкое?");
        String sweet= input.nextLine();
        System.out.println("Приятно было с тобой пообщаться. Всего доброго!");
        String Bye = input.nextLine();



    }
}
