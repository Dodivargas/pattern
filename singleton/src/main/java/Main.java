import java.sql.Time;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        Time horaAtual = Time.valueOf(now);

        System.out.println("Iniciando a estancia sem usar o singleton: " + horaAtual);

        Singleton s = new Singleton();
        Singleton s1 = new Singleton();
        Singleton s3 = new Singleton();

        now = LocalTime.now();
        Time horaFinal = Time.valueOf(now);

        System.out.println("Terminando a estancia sem usar o singleton: " + horaFinal);


        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        Singleton singleton3 = Singleton.getInstance();
        Singleton singleton4 = Singleton.getInstance();
        Singleton singleton5 = Singleton.getInstance();

        now = LocalTime.now();
        Time horaFinalSingleton = Time.valueOf(now);

        System.out.println("Usando singleton : " + horaFinalSingleton);
    }
}
