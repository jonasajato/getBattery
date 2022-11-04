import java.util.Scanner;

public class desafioBateria {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite a quantidade inicial de baterial: ");
        Integer battery = input.nextInt();
        System.out.println("Digite a quantidade de eventos:");
        Integer escolha = input.nextInt();
        getBattery result = null;
        Integer[] events = new Integer[escolha];

        for(int i = 0; i < events.length; i++){
            System.out.println("Digite o evento " + i + ":");
            events[i] = input.nextInt();
        }
        result = new getBattery(events, battery);
        System.out.println("\nBateria final: " + result);
    }
}

