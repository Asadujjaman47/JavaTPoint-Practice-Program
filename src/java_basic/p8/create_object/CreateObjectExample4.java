package java_basic.p8.create_object;

import java.lang.reflect.Constructor;

// Create Object in Java
// Using newInstance() Method of Constructor class
public class CreateObjectExample4 implements Cloneable {

    private String str;

    CreateObjectExample4() {
    }

    public void setName(String str) {
        this.str = str;
    }

    public static void main(String[] args) {
        try {
            Constructor<CreateObjectExample4> constructor = CreateObjectExample4.class.getDeclaredConstructor();
            CreateObjectExample4 r = constructor.newInstance();
            r.setName("JavaTpoint");
            System.out.println(r.str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
