package generic.test.ex3;

import generic.test.ex3.unit.BioUnit;

public class UnitPrinter {
    public <T extends BioUnit> void printV1(T t) {
        System.out.println("이름 : " + t.getName() + ", HP : " + t.getHp());
    }

    // public void printV2(BioUnit<?> bioUnit) {
    // System.out.println("이름 : " + bioUnit.);
    // }
}
