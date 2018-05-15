package lv.javaguru.courses.ingenico.lecture2.enums;

import java.util.function.Predicate;

public enum ObjectPredicates implements Predicate<Object> {

    ALWAYS_TRUE {
        @Override
        public boolean test(Object o) {
            return true;
        }
    },

    ALWAYS_FALSE {
        @Override
        public boolean test(Object o) {
            return false;
        }
    },

    IS_NULL {
        @Override
        public boolean test(Object o) {
            return o == null;
        }
    };

}
