* 外观模式（Facade Pattern）：为子系统中的一组接口提供统一的入口，外观模式定义了一个最高层
* 外观模式又称为门面模式
* 外观模式包含以下几个角色：
* 1. Facade（外观角色）：在客户端可以调用它的方法，在外观角色中可以知道相关（一个或者多个）子系统的功能和职责；正常情况下，它将所有从客户端发来的请求委派到相应的子系统去，传递给相应的子系统对象处理
* 2. Subsystem（子系统角色）：可以有一个或者多个子系统角色，每个子系统可以不是一个但不的类，而是一个类的集合；没格子系统可以被客户端直接调用，或者外观角色调用，处理由外观类传过来的请求；子系统并不知道外观的存在，对于子系统而言，外观角色仅仅是另外一个客户端而已
