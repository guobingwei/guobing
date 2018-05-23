package com.study.designpattern.mediator.colleague;

import com.study.designpattern.mediator.mediator.Mediator;

/**
 * 同事类
 * Created by guobingwei on 18/5/23.
 */
public abstract class Colleague {

    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
