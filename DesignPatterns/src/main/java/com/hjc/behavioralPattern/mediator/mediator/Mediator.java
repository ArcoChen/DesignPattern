package com.hjc.behavioralPattern.mediator.mediator;

import com.hjc.behavioralPattern.mediator.colleague.AbstractComponent;

public abstract class Mediator {
    public abstract void  componentChanged(AbstractComponent abstractComponent);
}
