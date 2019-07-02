/**
 * Copyright  2019-2029 联通集团财务有限公司版权所有。
 */
package enumUnit;

/**
 * @author: suxiaolei
 * @date: 2019/7/2
 */
public enum MulEnumUnit {
    MON(1), TUE(2), WED(3), THU(4), FRI(5), SAT(6) {
        @Override
        public boolean isRest() {
            return true;
        }
    },
    SUN(0) {
        @Override
        public boolean isRest() {
            return true;
        }
    };

    private int value;

    private MulEnumUnit(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isRest() {
        return false;
    }

}
