多态的测试

1. 多态性的表现：
	* 方法的重载与重写
	* 对象的多态性
2. 对象的多态性：
	* 向上转型：JVM自动完成
		
		`superClass obj = subclassObj;`
		
	* 向下转型：强制转换(需要先向上转型，再向下转型)
		
		```java
		superClass superClassObj = new subclass();
		subclass obj = (subclass)superClassObj;
		```