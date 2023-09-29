import java.text.Normalizer;
import java.util.regex.Pattern;
public class test {
  public static String maHoa(int key, String data){
      String result = "";

      for (char character : data.toCharArray()) {
          if ( character>= '\u0041'&& character<= '\u01B0') {
              char encryptedChar = (char) (((character  + key) ));

              result += encryptedChar;
          }  else {
              result += character;
          }
      }

      return result;
  }
    public static String giaiMa(int key, String data) {
        return maHoa( - key,data);
    }
    public static void main(String[] args) {
        String data = " Việc Mbappe tới Real Madrid vào kỳ chuyển nhượng hè 2024 hay không vẫn là dấu hỏi lớn. Chưa có cam kết nào đủ chắc chắn được thực hiện giữa đôi bên, trong khi có nhiều nguồn tin còn khẳng định Mbappe và PSG hiện ngồi vào bàn đàm phán để thương thảo về việc gia hạn hợp đồng. ";
        int key = 3;

        String encryptedText = maHoa(key,data );
        String decryptedText = giaiMa(key, encryptedText);


        System.out.println("Original Text: " + data);
        System.out.println("Encrypted Text: " + encryptedText);
        System.out.println("Decrypted text: " + decryptedText);

    }
}
