package com.cisimple.dependency1;

import com.cisimple.dependency2.SomeDepTwoClass;

public class SomeOtherClass {
    public SomeOtherClass(){
        SomeDepTwoClass instance = new SomeDepTwoClass();
    }
}
