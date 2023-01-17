package Session4;

public class Student {
    //ini atribut
    private String id;
    private String name;
    private String className;
    //tidak seperti di c, di java tidak perlu inisialisasi = 0
    private int score; // dikasih private agar bisa diakses hanya di kelas ini sendiri (Stundent)


    public void setClassName(String className) {
        this.className = className;
    }

    //ini method
    void study() {
        if (score + 10 < 100) {
            score += 10;
        } else {
            score = 100;
        }
        System.out.println("Study" + score);
    }

    public Student(String name, String className) {
        id = "" + (int) (Math.random() * 2000000000); // cara ngrandom angka antara 0-2m, dikasih stirng "" kosong aar nanti menjadi string(lifehack), lalu di casting  ke int
        this.setName(name);
        this.className = className;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 20) {
            throw new IllegalArgumentException("Panjang nama ga boleh lebih dari 20");
        }
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    int getScore() {
//        karena dia get, maka pasti memngembalikan suatu value, yaitu score itu sendiri
        return score;
    }

    void setScore(int score) {

        // ini namanya preprocessing, kelebihan setter bisa melakukan preprocessing yaitu kita bisa melakukan something terlebih dahulu
        if (score > 100 || score < 0) {
            throw new IllegalArgumentException("Score harus 0 - 100");
        }
        this.score = score;
    }

    void display() {
        System.out.println("Id : " + id);
        System.out.println("Name : " + name);
        System.out.println("Class : " + className);
        System.out.println("Score : " + score);
    }


    /*"access modifier" biasa digunakan pada encapsulation(melindungi/memprotect)
    terdapat beberapa modifier :

    tabel aksesnya bisa dimana saja:

                                class   |   package |   turunan |   public
    1. public                     *     |     *     |      *    |     *
    2. protected                  *     |     *     |      *    |
    3. package/default            *     |     *     |           |
    4. private                    *     |           |           |

    # setter / getter
    */
    class Main {
        public static void main(String[] args) {
//      langsung set disini, karena sudah tidak memakai constructor default(constructor tanpa parameter)
            Student student1 = new Student("samoedraaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "PPTI 16");
//        System.out.println("Score = " + student1.score);
//        display pakai method
            student1.display();
            student1.study();
            student1.study();
            student1.setScore(1000);
            student1.display();
        }
    }

}
