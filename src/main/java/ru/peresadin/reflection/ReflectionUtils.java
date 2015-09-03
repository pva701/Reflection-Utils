package ru.peresadin.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ReflectionUtils {

    public static <T, R extends T> R createDerived(T obj, Class<R> derivedClazz) throws IllegalAccessException, InstantiationException {
        Class<?> baseClazz = obj.getClass();
        R ret = derivedClazz.newInstance();
        Class<?> currentClazz = derivedClazz;
        while (currentClazz != baseClazz)
            currentClazz = currentClazz.getSuperclass();
        System.out.println(currentClazz.getName());
        Field[] fields = baseClazz.getDeclaredFields();
        for (Field f : fields) {
            if (!f.isAccessible())
                f.setAccessible(true);
            f.set(ret, f.get(obj));
        }
        return ret;
    }

    public static <T> T copyObject(T obj) {
        return null;
        //Class<?> typeToken = obj.getClass();
    }

    //Copy
    //DeepCopy
    //Reference
}
