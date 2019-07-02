/**
 * Copyright  2019-2029 联通集团财务有限公司版权所有。
 */
package enumUnit;

import org.junit.Test;

/**
 * @author: suxiaolei
 * @date: 2019/7/2
 */
public class enumTest {


    @Test
    public void tlekj() {
        for (SingleEnumunit c : SingleEnumunit.values()) {
            System.out.println(c.toString());
        }
        SingleEnumunit singleEnumunit = SingleEnumunit.MON;
        switch (singleEnumunit) {
            case MON:
                System.out.println("周周");
            default:
                System.out.println("other");
                break;
        }

        System.out.println(singleEnumunit.compareTo(SingleEnumunit.TUE));

        System.out.println(singleEnumunit.getDeclaringClass().getName());

        System.out.println(singleEnumunit.toString());

        System.out.println(singleEnumunit.name());

        //ordinal()， 返回值是从 0 开始
        System.out.println(singleEnumunit.ordinal());
    }
}
