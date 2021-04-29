package com.windystreet.AOP.jdkaop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author windyStreet
 * @codetime 2021-04-29 14:25
 */
/**
 * Class Proxy
 * newProxyInstance(ClassLoader loader, 类<?>[] interfaces,InvocationHandler h)
 * 参数一、类加载器
 * 参数二、增强方法所在的类，这个类实现的接口，支持多个接口
 * 参数三、实现这个接口InvocationHandler，创建带来对象，写增强的方法
 */
public class JDKProxy {
    public static void main(String[] args) {
        // 创建接口实现类代理对象
        Class[] interfaces = {UserDao.class};
        UserDaoImpl userDaoImpl = new UserDaoImpl();
        UserDao dao = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoProxy(userDaoImpl));
        int res = dao.add(2, 3);
        System.out.println(res);
    }

}

class UserDaoProxy implements InvocationHandler {
    /**
     * 创建的是谁的代理对象，把谁传递过来
     */
    private Object obj;

    public UserDaoProxy(Object obj) {
        this.obj = obj;
    }

    // 增强逻辑
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 方法前
        System.out.println("方法执行前.." + method.getName() + "参数" + Arrays.toString(args));
        Object res = method.invoke(obj, args);
        // 方法后
        System.out.println("方法执行后.." + res);

        return res;
    }
}
