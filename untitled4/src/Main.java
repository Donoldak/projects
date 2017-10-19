public class Main {
    public static void main(String[] args) {
        int n = 1;
        String text = "";
        char[] ch = text.toCharArray();
        String every2Letter = new String();
        String otherLetter = new String();
        int iter = 1;
        do {
            for (int i = 0; i < ch.length; i++) {
                if ((i % 2) != 0) {
                    every2Letter += ch[i];
                } else {
                    otherLetter += ch[i];
                }

            }
            text = every2Letter+otherLetter;
            ch = text.toCharArray();
            every2Letter="";
            otherLetter="";
            iter++;
        }while (iter<=n);
        System.out.println("Зашифрованный текс: "+text);

text = "hskt svr neetn!Ti aai eyitrsig";
        //Дешифровка
        int q = 0;
        String encryptedText = text;
        if ((encryptedText.length()%2)==0){
            q = encryptedText.length()/2;
        }else {q = (encryptedText.length()-1)/2;}
        String neChet = new String();
        String chet = new String();
        char[] encryptCharChet = {};
        char[] encryptCharNeChet = {};
        int iterat = 1;
        do {
            neChet = encryptedText.substring(encryptedText.length() - q );
            chet = encryptedText.substring(0, encryptedText.length()-q);
            encryptCharChet = chet.toCharArray();
            encryptCharNeChet = neChet.toCharArray();
            encryptedText="";


            for (int i = 0; i<encryptCharChet.length; i++){
                encryptedText += encryptCharNeChet[i];
                encryptedText += encryptCharChet[i];
            }



            iterat++;
        }while (iterat<=n);

        System.out.println("Расшифрованный текст: "+encryptedText.substring(0, encryptedText.length()-1));

    }
}
