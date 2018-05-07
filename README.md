# HikariCP
使用SpringBoot整合HikariCP，并使用Mybatis操作数据库

# HikariCP？
HiKariCP是数据库连接池的一个后起之秀，号称性能最好，可以完美地PK掉其他连接池，是一个高性能的JDBC连接池，基于BoneCP做了不少的改进和优化。
并且在SpringBoot2.0之后已经默认将数据库连接池选择为了HikariCP

# HikariCP优势？
1. 字节码精简 
优化代码，直到编译后的字节码最少，这样，CPU缓存可以加载更多的程序代码；

2. 优化代理和拦截器
减少代码，例如HikariCP的Statement proxy只有100行代码，只有BoneCP的十分之一；

3. 自定义数组类型 （FastStatementList）代替ArrayList
避免每次get()调用都要进行range check,避免调用remove()时的从头到尾的扫描；

4. 自定义集合类型
提高并发读写的效率




