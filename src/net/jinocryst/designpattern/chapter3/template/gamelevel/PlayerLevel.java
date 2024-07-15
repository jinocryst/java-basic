package net.jinocryst.designpattern.chapter3.template.gamelevel;

public abstract class PlayerLevel {

    public abstract void run();
    public abstract void jump();
    public abstract void turn();
    public abstract void showLevelMessage();
    public void fly() {}    //훅 메서드 -> 필요에 따라 하위클래스가 추가적인 기능을 제공할 수 있음, 확장성 제공 가능

    // template method는 재정의하면 안되기 때문에 final로 선언
    final public void go(int count) {
        run();

        for(int i=0; i<count; i++) {
            jump();
        }

        turn();

        fly();
    }

}
