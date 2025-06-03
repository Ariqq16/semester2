package Minggu15;
public class BinaryTree16 {
    Node16 root;

    public BinaryTree16() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void add(Mahasiswa16 mahasiswa) {
        Node16 newNode = new Node16(mahasiswa);
        if (isEmpty()) {
            root = newNode;
        } else {
            Node16 current = root;
            Node16 parent = null;
            while (true) {
                parent = current;
                if (mahasiswa.ipk < current.mahasiswa16.ipk) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    public boolean find(double ipk) {
        boolean result = false;
        Node16 current = root;
        while (current != null) {
            if (current.mahasiswa16.ipk == ipk) {
                result = true;
                break;
            } else if (ipk > current.mahasiswa16.ipk) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return result;
    }

    public void traversePreOrder(Node16 node) {
        if (node != null) {
            node.mahasiswa16.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    public void traverseInOrder(Node16 node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.mahasiswa16.tampilInformasi();
            traverseInOrder(node.right);
        }
    }

    public void traversePostOrder(Node16 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.mahasiswa16.tampilInformasi();
        }
    }

     Node16 getSuccessor(Node16 del) {
        Node16 successor = del.right;
        Node16 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

     public void delete(double ipk) {
        if (isEmpty()) {
            System.out.println("x:Binary tree kosong");
            return;
        }

        // cari node (current) yang akan dihapus
        Node16 parent = root;
        Node16 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.mahasiswa16.ipk == ipk) {
                break;
            } else if (ipk < current.mahasiswa16.ipk) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (ipk > current.mahasiswa16.ipk) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
    //penghapusan
        if (current == null) {
            System.out.println("x:Data tidak ditemukan");
            return;
        } else {
            //jika tidak ada anak (leaf), maka node dihapus
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            }
            //jika hanya punya 1 anak (kanan)
            else if (current.left == null) {
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            }
            //jika hanya punya 1 anak (kiri)
            else if (current.right == null) {
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            }
            //jika punya 2 anak
            else {
                Node16 successor = getSuccessor(current);
                System.out.println("x:Jika 2 anak, current = ");
                current.mahasiswa16.tampilInformasi(); 
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                }
                successor.left = current.left;
            }
        }
    }

     public void addRekursif(Mahasiswa16 mahasiswa) {
        root = addRekursif(root, mahasiswa);
    }

    private Node16 addRekursif(Node16 current, Mahasiswa16 mahasiswa) {
        if (current == null) {
            return new Node16(mahasiswa);
        }

        if (mahasiswa.ipk < current.mahasiswa16.ipk) {
            current.left = addRekursif(current.left, mahasiswa);
        } else if (mahasiswa.ipk > current.mahasiswa16.ipk) { 
            current.right = addRekursif(current.right, mahasiswa);
        } else {
            System.out.println("x:Mahasiswa dengan IPK " + mahasiswa.ipk + " sudah ada, tidak ditambahkan.");
        }
        return current;
    }

    public Mahasiswa16 cariMinIPK() {
        if (isEmpty()) {
            System.out.println("x:Binary tree kosong, tidak ada IPK minimum.");
            return null;
        }
        Node16 current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.mahasiswa16;
    }

     public Mahasiswa16 cariMaxIPK() {
        if (isEmpty()) {
            System.out.println("x:Binary tree kosong, tidak ada IPK maksimum.");
            return null;
        }
        Node16 current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current.mahasiswa16;
    }

    public void tampilMahasiswaIPKdiAtas(double ipkBatas) {
        System.out.println("\nx:Mahasiswa dengan IPK di atas " + ipkBatas + ":");
        tampilMahasiswaIPKdiAtas(root, ipkBatas);
    }

    private void tampilMahasiswaIPKdiAtas(Node16 node, double ipkBatas) {
        if (node == null) {
            return;
        }
    }
}