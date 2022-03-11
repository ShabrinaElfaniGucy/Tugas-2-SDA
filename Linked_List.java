import java.util.LinkedList;

public class Linked_List {
    public static void main(String[] args) throws Exception {
        
        LinkedList<String> nama =new LinkedList<>();
        LinkedList<String> nama1 =new LinkedList<>();

        nama.add("S");
        nama.add("H");
        nama.add("A");
        nama.add("B");
        nama.add("R");
        nama.add("I");
        nama.add("N");
        nama.add("A");
        nama.add("_");
        nama.add("E");
        nama.add("L");
        nama.add("F");
        nama.add("A");
        nama.add("N");
        nama.add("I");
        nama.add("_");
        nama.add("G");
        nama.add("U");
        nama.add("C");
        nama.add("Y");
        System.out.println("Name\t:" + nama + "\tUkuran :" + nama.size());

        //add atau menambah karakter
        nama1.add("_");
        nama1.add("S");
        nama1.add("A");
        nama1.add("U");
        nama1.add("D");
        nama1.add("A");
        nama1.add("R");
        nama1.add("A");
        nama.addAll(nama1);
        System.out.println("Name1\t:" + nama + "\tUkuran : " +nama.size());

        //menimpa karakter
        nama.set(5,"T");
        nama.set(14,"S");
        nama.set(16,"P");
        System.out.println("Name2\t:" + nama + "\tUkuran : " + nama.size());

        //menghapus karakter
        nama.remove(3);
        nama.remove(5);
        nama.remove(7);
        nama.remove(9);
        nama.remove(11);
        nama.remove(13);
        System.out.println("Name3\t:" + nama + "\tUkuran : " + nama.size());

        //fungsi PUSH
        nama.push("Subject");
        System.out.println("Name4\t:" + nama + "\tUkuran : " + nama.size());

        //fungsi POP
        nama.pop();
        System.out.println("Name5\t:" + nama + "\tUkuran : " + nama.size());;


    }

}
