package com.yo1000.tcexam.component;

import org.springframework.stereotype.Component;

/**
 * Created by yoichi.kikuchi on 2015/10/16.
 */
@Component
public class ExamComponent {
    public int div(int x, int y) {
        if (x == 0) {
            return 0;
        }

        if (y == 0) {
            throw new ArithmeticException(String.format("x=%d, y=%d", x, y));
        }

        return x / y;
    }
}
