1. 抽象类概念：**包含一个抽象方法的类就是抽象类**
2. 抽象方法：**声明而未被实现的方法，必须使用abstract关键字声明**
3. 抽象类被子类继承，子类如果不是抽象类，则必须重写抽象类中的所有抽象方法
4. 定义格式：
```java
abstract class className{
	property
	methods
	abstract methods
}
```
5. 抽象类不能直接实例化，要通过其非抽象类的子类实例化