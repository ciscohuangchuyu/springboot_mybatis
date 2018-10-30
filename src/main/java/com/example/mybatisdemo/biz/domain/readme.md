DTO- DataTransfer Object（数据传输对象），
也常被称作VO-Value Object(值对象)。
基于面向对象技术设计的领域对象（即通常所说的“实体”）都是细粒度的，
将细粒度的领域对象直接传递到远程调用端需要进行多次网络通信，
DTO在设计之初的主要考量是以粗粒度的数据结构减少网络通信并简化调用接口。

值得一提的是，DTO对实现一个独立封闭的领域模型具有积极的作用，
特别是当系统使用了某些具有自动脏数据检查（automatic dirty checking）机制的ORM框架时，
DTO的优势就更加明显，
否则就会存在领域对象在模型层以外被意外修改并自动持久化到数据库中的风险或者是像Hibernate那样的框架
因未开启OpenSessionInView
 (注：开启OpenSessionInView有副作用，一般认为OpenSessionInView不是一种好的实践)
 而导致Lazy Loading出现问题。



关于DTO具体的设计用意和应用场景可参考如下资源：

1.《Core J2EE™ Patterns: Best Practices and Design Strategies, SecondEdition》

2.《Patterns of Enterprise ApplicationArchitecture》

