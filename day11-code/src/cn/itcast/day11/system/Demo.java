package cn.itcast.day11.system;

public class Demo {
    public static void main(String[] args){
        System.out.println(System.getProperty("java.io.tmpdir",""));
        System.out.println("Java运行时环境版本: " + System.getProperty("java.version")); // Java运行时环境版本
        System.out.println("Java运行时环境供应商: " + System.getProperty("java.vendor")); // Java运行时环境供应商
        System.out.println("Java供应商的 URL: " + System.getProperty("java.vendor.url")); // Java供应商的 URL
        System.out.println("Java安装目录: " + System.getProperty("java.home")); // Java安装目录
        System.out.println("Java虚拟机规范版本: " + System.getProperty("java.vm.specification.version")); // Java虚拟机规范版本
        System.out.println("Java虚拟机规范供应商: " + System.getProperty("java.vm.specification.vendor")); // Java虚拟机规范供应商
        System.out.println("Java虚拟机规范名称: " + System.getProperty("java.vm.specification.name")); // Java虚拟机规范名称
        System.out.println("Java虚拟机实现版本: " + System.getProperty("java.vm.version")); // Java虚拟机实现版本
        System.out.println("Java虚拟机实现供应商: " + System.getProperty("java.vm.vendor")); // Java虚拟机实现供应商
        System.out.println("Java虚拟机实现名称: " + System.getProperty("java.vm.name")); // Java虚拟机实现名称
        System.out.println("Java运行时环境规范版本: " + System.getProperty("java.specification.version")); // Java运行时环境规范版本
        System.out.println("Java运行时环境规范供应商: " + System.getProperty("java.specification.vendor")); // Java运行时环境规范供应商
        System.out.println("Java运行时环境规范名称: " + System.getProperty("java.specification.name")); // Java运行时环境规范名称
        System.out.println("Java类格式版本号: " + System.getProperty("java.class.version")); // Java类格式版本号
        System.out.println("Java类路径: " + System.getProperty("java.class.path")); // Java类路径
        System.out.println("加载库时搜索的路径列表: " + System.getProperty("java.library.path")); // 加载库时搜索的路径列表
        System.out.println("默认的临时文件路径: " + System.getProperty("java.io.tmpdir")); // 默认的临时文件路径
        System.out.println("要使用的 JIT 编译器的名称: " + System.getProperty("java.compiler")); // 要使用的 JIT 编译器的名称
        System.out.println("一个或多个扩展目录的路径: " + System.getProperty("java.ext.dirs")); // 一个或多个扩展目录的路径
        System.out.println("操作系统的名称: " + System.getProperty("os.name")); // 操作系统的名称
        System.out.println("操作系统的架构: " + System.getProperty("os.arch")); // 操作系统的架构
        System.out.println("操作系统的版本: " + System.getProperty("os.version")); // 操作系统的版本
        System.out.println("文件分隔符（在 UNIX 系统中是“/”）: " + System.getProperty("file.separator")); // 文件分隔符（在 UNIX 系统中是“/”）
        System.out.println("路径分隔符（在 UNIX 系统中是“:”）: " + System.getProperty("path.separator")); // 路径分隔符（在 UNIX 系统中是“:”）
        System.out.println("行分隔符（在 UNIX 系统中是“/n”）: " + System.getProperty("line.separator")); // 行分隔符（在 UNIX 系统中是“/n”）
        System.out.println("用户的账户名称: " + System.getProperty("user.name")); // 用户的账户名称
        System.out.println("用户的主目录: " + System.getProperty("user.home")); // 用户的主目录
        System.out.println("用户的当前工作目录: " + System.getProperty("user.dir")); // 用户的当前工作目录
    }
}
