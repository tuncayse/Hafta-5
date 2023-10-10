import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizide erismek istediginiz elemani giriniz. ");
        int giris = input.nextInt();
        if (giris >= 10){
            try {
                exceptMethod(giris);
            }catch (IndexOutOfBoundsException e){
                System.out.println(e.toString());
                System.out.println("Hata Yakalandi");
            }
            finally {
                System.out.println("Sorunlar Cozuldu.");
            }
        }
        else {
            exceptMethod(giris);
        }


        System.out.println("Program Sona Erdi");
    }
    public static void exceptMethod(int input){
        int[] array = {2,4,6,8,10,12,14,16,18,20};
        System.out.println(array[input]);

    }
}