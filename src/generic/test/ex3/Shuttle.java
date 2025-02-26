package generic.test.ex3;

import generic.test.ex3.unit.BioUnit;

public class Shuttle<T extends BioUnit> {
    private T t;

    // TODO : in() 메서드 => 셔틀에 탑승 시키기
    public void in(T t) {
        this.t = t;
    }

    public T out() {
        return t;
    }

    // TODO : showInfo() 메서드 => 탑승한 유닛의 정보를 출력
    public void showInfo() {
        String name = t.getName();
        int hp = t.getHp();

        System.out.println("이름 : " + name + ", HP : " + hp);
    }
}
