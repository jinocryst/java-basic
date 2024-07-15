package net.jinocryst.standard.ch13thread;

public class TreadEx1 {
    public static void main(String[] args) {
        /*
        TODO Thread를 구현하는 방법
         * Thread클래스를 상속 -> 상속받으면 다른 클래스를 상속받을 수 없기 때문에 Runnable 구현이 일반적
         * Runnable 인터페이스를 구현 -> 재사용성이 높고 코드의 일관성을 유지할 수 있기 때문에 보다 객체지향적인 방법 -> run()의 몸통을 채우는 것
         */

        ThreadEx1_1 t1 = new ThreadEx1_1(); //Thread의 자손 클래스 생성
        Runnable r = new ThreadEx1_2(); // Runnable을 구현한 클래스의 인스턴스 생성
        Thread t2 = new Thread(r);  //생성자 Thread    (Runnable target)


        t1.start();
        t2.start();
        //t1.start(); -- 한번 실행된 쓰레드는 다시 생성할 수 없다. IllegalThreadStateException 발생


    }
}

class ThreadEx1_1 extends Thread {
    public void run() {
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for(int i=0; i < 5; i++) {
            System.out.println(getName());  //조상인 Thread의 getName() 호출
        }
    }
}

class ThreadEx1_2 implements Runnable {
    public void run() {
        for(int i=0; i < 5; i++) {
            //Thread.currentThread() - 현재 실행중인 Thread를 반환
            System.out.println(Thread.currentThread().getName());
        }
    }
}