import java.util.Scanner;

public class CoderFunctionality {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String coder = coder(s);
        System.out.println(coder);
    }

    public static String coder(String inputData) {
        String regex = "[0-9]";
        String slash = ("\\\\");
        String str = "";

        int count = 1;

        char[] masChar = inputData.toCharArray();

        for (int i = 0; i < masChar.length - 1; i++) {
            String number = String.valueOf(masChar[i]);
                if (number.matches(regex) || number.matches(slash)) {
                    str = str + "\\" + masChar[i];
                } else {
                    if (masChar[i] == masChar[i + 1] && count < 9) {
                        count++;
                    } else {
                        if (count == 1) {
                            str = str + count + masChar[i];
                        } else {
                            str = str + count + masChar[i];
                            count = 1;
                        }
                    }
                }
            }
            if (count == 1) {
                str = str + "\\" + masChar[masChar.length - 1];
            } else {
                str = str + count + masChar[masChar.length - 1];
            }
        return str;
    }
}
