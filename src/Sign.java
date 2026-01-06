
public class Sign {
    String message1 = "";
    int width1 = 0;
    int length;
    String ram;
    String ram2;
    int count;
    public Sign (String message, int width){
        this.message1 = message;
        this.width1 = width;
    }
    public int numofLines(){
        length = 0;
        ram = "";
        ram2 = "";
        count = 0;
        length = message1.length();
        if (message1.length() == 0){
            return 0;
        }
        if (width1 >= length){
            count++;
            return count;
        }
        while ((length - width1) > 0){
            ram = message1.substring(count * width1,(count * width1) + width1);
            count++;
            length = length - width1;
            ram2 = ram2 + ";" + ram;
            if (length - width1 <= 0){
                ram = message1.substring(count * width1);
                count++;
                ram2 = ram2 + ";" + ram;
            }
        }
        ram2 = ram2.substring(1);
        return count;
    }
    public String getLines(){
        length = 0;
        ram = "";
        ram2 = "";
        count = 0;
        length = message1.length();
        if (message1.length() == 0){
            return null;
        }
        if (width1 >= length){
            count++;
            return message1;
        }
        while ((length - width1) > 0){
            ram = message1.substring(count * width1,(count * width1) + width1);
            count++;
            length = length - width1;
            ram2 = ram2 + ";" + ram;
            if (length - width1 <= 0){
                ram = message1.substring(count * width1);
                count++;
                ram2 = ram2 + ";" + ram;

            }
        }
        ram2 = ram2.substring(1);
        return ram2;
    }

}