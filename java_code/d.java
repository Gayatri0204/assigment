package java_code;

class a {
    int rollno;

    void acc() {
        rollno = 30;

    }
}

class b extends a {
    String name;

    void accept() {
        name = "gayatri mankar";

    }
}

class c extends b {
    double per;

    void data() {
        per = 89.00;
    }
}

class d extends c {
    void display() {
        System.out.println("roll no =" + rollno);
        System.out.println("name =" + name);
        System.out.println("percentage =" + per);

    }

    public static void main(String arg[]) {
        d obj = new d();
        obj.acc();
        obj.accept();
        obj.data();
        obj.display();
    }
}
