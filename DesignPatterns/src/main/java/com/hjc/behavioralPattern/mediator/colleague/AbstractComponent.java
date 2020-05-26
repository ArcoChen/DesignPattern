package com.hjc.behavioralPattern.mediator.colleague;

import com.hjc.behavioralPattern.mediator.mediator.Mediator;
import sun.security.provider.MD2;

public abstract class AbstractComponent {
    protected Mediator mediator;

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void changed(){
        mediator.componentChanged(this);
    }

    public abstract void update();
}
