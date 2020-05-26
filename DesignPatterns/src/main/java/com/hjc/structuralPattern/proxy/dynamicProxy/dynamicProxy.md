JDK动态代理实现步骤：
1. 创建一个实现InvocationHandler的类，它必须实现invoke方法，在invoke方法中添加具体的业务逻辑
2. 创建被代理的类和接口
3. 调用Proxy的静态方法newProxyInstance，动态穿件一个代理类
4. 通过代理调用方法

JDK动态代理只能代理实现了接口的类，没有实现接口的类不能实现JDK动态代理
