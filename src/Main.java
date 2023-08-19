import java.awt.*;

public class Main {  // 메인 스레드 : 출력

    public static void main(String[] args) {

      Thread thread = new Thread();
      thread.start();

        for(int i =0; i<5; i++){
            System.out.println("띵");
            try{Thread.sleep(500); } catch(Exception e) {}
        }

    }
}

