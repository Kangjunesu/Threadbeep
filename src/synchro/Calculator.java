package synchro;

public class Calculator {  //공유 객체
    private int memory;

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) { //계산기 메모리에 값을 저장하는 메서드
        this.memory = memory;
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){}
        System.out.println(Thread.currentThread().getName() + " : " + this.memory );  //스레드 이름 + ㅇ메모리 값

    }
}
