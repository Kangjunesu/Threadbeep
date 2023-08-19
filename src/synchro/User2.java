package synchro;

public class User2 extends Thread {
    private Calculator calculator;

    public void setCalculator(Calculator calculator) {
        this.setName("User2"); // 스레드 이름 설정
        this.calculator = calculator;
    }

    @Override
    public void run() {
        calculator.setMemory(50); // Calculator의 메모리에 50저장
    }
}
