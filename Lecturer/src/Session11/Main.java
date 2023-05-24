package Session11;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        BST<String> bst = new BST<>();
//        bst.push("bijo");
//        bst.push("kevin");
//        bst.push("apeng");
//        bst.push("kevin");
//        bst.push("samu");
//        bst.push("jason");
//        bst.viewTree();
//        BST<Integer> angka = new BST<>();
//        for (int i = 0; i < 100; i++) {
//            angka.push((int)(Math.random()*1000));
//        }
//        angka.viewTree();
        Thread th = new Thread(new Runnable() {
            @Override
            public void run() {
                cetak();
            }
        });
        Thread th1 = new Thread(new Runnable() {
            @Override
            public void run() {
                cetak();
            }
        });
        th.start();
        th1.start();
        Scanner scan = new Scanner(System.in);
        int a;
        do {
            a = scan.nextInt();
            for (int i = 0; i < a; i++) {
                System.out.println(i);
            }
        }while (a != 0);

    }

    static void cetak() {
        int id = (int) (Math.random() * 10000);
        int a = 0;

        while (true) {
            System.out.println(id + "loop" + a++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}


class Data<T> {
    int key;
    T data;
    Data<T> left = null;
    Data<T> right = null;

    public Data(int key, T data) {
        this.data = data;
        this.key = key;
    }
}

class BST<T> {
    Data<T> root;

    public BST() {
        root = null;
    }

    public Data<T> push(Data<T> curr, int key, T data) {
        if (curr == null) {
            return new Data(key, data);
        } else {
            if (key < curr.key) {
                curr.left = push(curr.left, key, data);
            } else {
                curr.right = push(curr.right, key, data);
            }
        }
        return curr;
    }

    public void push(T data) {
        root = push(root, (int) (Math.random() * 10000), data);
    }

    private void viewTree(Data<T> curr, int level) {
        if (curr != null) {
            viewTree(curr.right, level + 1);
            for (int i = 0; i < level; i++) {
                System.out.print("   ");
            }
            System.out.println(curr.key + " " + curr.data);
            viewTree(curr.left, level + 1);
        }
    }

    public void viewTree() {
        viewTree(root, 0);
    }
}