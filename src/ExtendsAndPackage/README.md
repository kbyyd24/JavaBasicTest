JAVA的继承与封装测试

|                                       | public  | protected | default | private | 
|---------------------------------------|:-------:|:---------:|:-------:|:-------:|
| the same class                        |    Y    |     Y     |    Y    |    Y    |
| the same package include subclass     |    Y    |     Y     |    Y    |    N    |
| subclass in the different packages    |    Y    |     Y     |    N    |    N    |
| other class in the different packages |    Y    |     N     |    N    |    N    |