* CGLIB代理需要先引入cglib的jar包
* CGLIB代理针对类来实现
* 对指定目标类产生一个子类，通过法法拦截技术拦截所有父类方法的调用
* Spring AOP:同时用到了JDK动态代理和cglib动态代理