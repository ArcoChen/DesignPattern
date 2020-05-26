package com.hjc.behavioralPattern.template.abstractTemplate;

public abstract class RefreshBeverage {
    /**
     * 制备饮料的模板方法 封装了所有子类所遵循的算法框架
     */
    public final void prepareBeverageTemplate() {
        // 步骤一 将水煮沸
        boilWater();
        // 步骤二 泡制饮料
        brew();
        // 步骤三 将饮料倒入杯中
        pourInCup();
        if (isCustomerWantsCondiments()) {
            // 步骤四 加入调味料
            addCondiments();
        }
    }

    /**
     * Hook 钩子函数,提供一个空的或者默认的实现 子类重写该方法，可以自行决定是否挂钩以及如何挂钩
     *
     * @return
     */
    protected boolean isCustomerWantsCondiments() {
        return true;
    }

    /**
     * 因为将水煮沸和把饮料倒入杯中对所有子类是共同的行为，所以没必要向子类过多开放，所以方法定义为private，这样我们在进行子类编码时可以减少复杂度。
     * 这样不需要关注细枝末节，我们只需要关注我们特定业务的实现，这就是模板方法模式的好处。可以封装变与不变，将不变的固化在高层，隐藏其细节。
     */
    private void boilWater() {
        System.out.println("第一步：将水煮沸");
    }

    private void pourInCup() {
        System.out.println("第三步：将水倒入杯子中");
    }

    //泡制饮料brew()和加入调料品addCondiments()这两个方法我们不知道它们在算法框架中的具体实现，因此定义为抽象方法
    protected abstract void brew();

    protected abstract void addCondiments();
}
