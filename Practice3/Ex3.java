import java.util.Formatter;

public class Ex3 {
    public static void main(String[] args) {
        String[] methods = {"intValue", "doubleValue", "floatValue", "longValue", "shortValue", "byteValue", "charValue", "booleanValue"};

        System.out.println("╔════════╦══════════╦═════════╦═════════╦═════════╦═════════╦═════════╦═════════╦══════════╗");
        System.out.println("║        ║ Integer  ║ Double  ║ Float   ║ Long    ║ Short   ║ Byte    ║ Character║ Boolean  ║");
        System.out.println("╠════════╬══════════╬═════════╬═════════╬═════════╬═════════╬═════════╬═════════╬══════════╣");

        for (String method : methods) {
            System.out.print("║ " + method + " ║");
            printCell(Integer.class, method, 8);
            printCell(Double.class, method, 8);
            printCell(Float.class, method, 8);
            printCell(Long.class, method, 8);
            printCell(Short.class, method, 8);
            printCell(Byte.class, method, 8);
            printCell(Character.class, method, 8);
            printCell(Boolean.class, method, 8);
            System.out.println("║");
        }

        System.out.println("╚════════╩══════════╩═════════╩═════════╩═════════╩═════════╩═════════╩═════════╩══════════╝");
    }

    public static void printCell(Class<?> wrapperClass, String methodName, int width) {
        try {
            wrapperClass.getMethod(methodName);
            Formatter fmt = new Formatter();
            fmt.format("%-" + width + "s║", "    x");
            System.out.print(fmt);
        } catch (NoSuchMethodException e) {
            Formatter fmt = new Formatter();
            fmt.format("%-" + width + "s║", "");
            System.out.print(fmt);
        }
    }
}
