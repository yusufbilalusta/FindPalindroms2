public class Stack {

    Node head;
    public Stack(){
        this.head = null;
    }
    public void push(String line){
        Node yeniNode = new Node(line);
        if (head==null){
            head = yeniNode;
        }
        else {
            Node gecici = head;
            while (gecici.sonraki != null){
                gecici = gecici.sonraki;
            }
            gecici.sonraki =yeniNode;
        }

    }
    public void SondakiNoduSil(){

        if (head==null){
            System.out.println("Silincek bir sey Yok");
        }
        else if (head.sonraki == null) {
            // Tek düğüm varsa, head'i null olarak ayarla
            head = null;}
        else {
            Node gecici = head;
            Node onceki=head;
            while (gecici.sonraki != null){
                onceki=gecici;
                gecici = gecici.sonraki;
            }
            onceki.sonraki=null;

        }
    }
    public void BastakiNoduSil(){
        if (head==null){
            System.out.println("Silincek bir sey Yok");
        }
        else {
            head=head.sonraki;
        }
    }

    public void yazdir(){
        Node gecici = head;
        while (gecici!=null){
            System.out.println(" -> "+gecici.line);
            gecici = gecici.sonraki;
        }
    }
    public void elemanSay(){
        int sayac=0;
        Node gecici = head;
        while (gecici!=null){
            sayac++;
            gecici = gecici.sonraki;
        }
        System.out.println(sayac+" adet eleman vardir.");
    }

    public boolean ispalindrom(String str){
        boolean cevap = false;
        String res = "";
        for (Character c : str.toCharArray())
        {
            if(Character.isLetter(c))
                res += c;
        }
        str = res.toLowerCase();
        char ch[] = str.toCharArray();
        String ters="";
        for(int i=ch.length-1;i>=0;i--){
            ters+=ch[i];
        }

        if (str.equals(ters)) {cevap=true;}
        return cevap;
    }



}


