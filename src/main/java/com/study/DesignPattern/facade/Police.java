package com.study.DesignPattern.facade;

/**
 * Created by guobingwei on 18/5/14.
 */
public class Police {
    public void checkLetter(ILetterProcess letterProcess) {
        System.out.println("检测信件:" + letterProcess);
    }
}