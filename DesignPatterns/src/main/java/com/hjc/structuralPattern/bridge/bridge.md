* 桥接模式（Bridge Pattern）：将抽象部分与他的实现部分分离，使他们都可以独立的变化。他是一种对象结构性模式，
*                           又称为柄体（Handle and Body）模式或者接口（interface）模式
* 桥接模式用抽象关联取代传统 多层继承
* 桥接模式具有以下几个角色：
* 1. Abstraction（抽象类）：用于定义抽象接口，一般为抽象类而不是接口，其中定义了一个implementor（实现类接口）类型的对象并可以维护该对象
* 2. RefinedAbstraction（扩充抽象类）：扩充由Abstraction定义的接口，通常情况下它不再是抽象类，而是具体类，它实现了Abstraction中声明的抽象业务方法
* 3. Implementor（实现类接口）：定义实现类的接口，
* 4. ConcreteImplementor（具体实现类）：实现Implementor接口