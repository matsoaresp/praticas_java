package page_3;

public class sequenciaIJ {
    public static void main(String[] args) {

        int j = 60;
    for (int i = 1 ; i < j; i += 3){
        System.out.println("I=" + i + " J=" + j);
        j -= 5;
        if (i < 0 || j < 0){
            break;
        }
    }
    }
}