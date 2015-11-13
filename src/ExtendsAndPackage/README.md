JAVA的继承与封装测试

|                                       | public  | protected | default | private | 
|---------------------------------------|:-------:|:---------:|:-------:|:-------:|
| the same class                        |    Y    |     Y     |    Y    |    Y    |
| the same package include subclass     |    Y    |     Y     |    Y    |    N    |
| subclass in the different packages    |    Y    |     Y     |    N    |    N    |
| other class in the different packages |    Y    |     N     |    N    |    N    |


| Overloading                  | Overriding                            |
|------------------------------|:-------------------------------------:|
| 方法名相同，参数类型或个数不同  | 方法名、参数类型与个数、返回值类型相同       |
| 对权限无要求                                               | 被重写的方法不能拥有比父类更加严格的权限  |
| 发生在一个类中                                          | 发生在继承中                                                                        |